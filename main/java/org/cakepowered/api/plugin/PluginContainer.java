package org.cakepowered.api.plugin;

import java.io.File;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.cakepowered.api.CakeApiMod;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.eventbus.EventBus;

import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.MetadataCollection;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.ModContainerFactory;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.discovery.ModCandidate;
import net.minecraftforge.fml.common.versioning.ArtifactVersion;
import net.minecraftforge.fml.common.versioning.DefaultArtifactVersion;
import net.minecraftforge.fml.common.versioning.VersionRange;

public class PluginContainer implements ModContainer{
	
	public String pluginClass;
	public ModCandidate modCandidate;
	public Map<String, Object> pluginDescriptor;
	public ModMetadata metadata;
	public boolean enabled = true;
	public EventBus eventBus;
    public LoadController controller;
    public Object pluginInstance;

	public PluginContainer(String className, ModCandidate candidate, Map<String, Object> descriptor){
		this.pluginClass = className;
		this.modCandidate = candidate;
		this.pluginDescriptor = descriptor;
		try {
			pluginInstance = Class.forName(className).newInstance();
			PluginManager.registerPlugin(this, pluginInstance);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getModId() {
		return (String) pluginDescriptor.get("id");
	}

	@Override
	public String getName() {
		return (String) pluginDescriptor.get("name");
	}

	@Override
	public String getVersion() {
		return (String) pluginDescriptor.get("version");
	}

	@Override
	public File getSource() {
		return modCandidate.getModContainer();
	}

	@Override
	public ModMetadata getMetadata() {
		return metadata;
	}

	@Override
    public void bindMetadata(MetadataCollection mc) {
		
        metadata = mc.getMetadataForId(getModId(), this.pluginDescriptor);

        String annotationDependencies = (String) this.pluginDescriptor.get("dependencies");

        Set<ArtifactVersion> requirements = Sets.newHashSet();
        List<ArtifactVersion> dependencies = Lists.newArrayList();
        List<ArtifactVersion> dependants = Lists.newArrayList();

        Loader.instance().computeDependencies(annotationDependencies, requirements, dependencies, dependants);

        metadata.requiredMods = requirements;
        metadata.dependencies = dependencies;
        metadata.dependants = dependants;
    }

	@Override
	public void setEnabledState(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
    public Set<ArtifactVersion> getRequirements() {
        return this.metadata.requiredMods;
    }

    @Override
    public List<ArtifactVersion> getDependencies() {
        return this.metadata.dependencies;
    }

    @Override
    public List<ArtifactVersion> getDependants() {
        return this.metadata.dependants;
    }

    @Override
    public String getSortingRules() {
        return (String) this.pluginDescriptor.get("dependencies");
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        if (enabled) {
            eventBus = bus;
            this.controller = controller;
            return true;
        }
        return false;
    }

	@Override
	public boolean matches(Object mod) {
		return mod == pluginInstance;
	}

	@Override
	public Object getMod() {
		return pluginInstance;
	}

	@Override
	public ArtifactVersion getProcessedVersion() {
		return new DefaultArtifactVersion(getModId(), getVersion());
	}

	@Override
	public boolean isImmutable() {
		return false;
	}

	@Override
	public String getDisplayVersion() {
		return getVersion();
	}

	@Override
	public VersionRange acceptableMinecraftVersionRange() {
		return Loader.instance().getMinecraftModContainer().getStaticVersionRange();
	}

	@Override
	public Certificate getSigningCertificate() {
		return null;
	}

	@Override
	public Map<String, String> getCustomModProperties() {
		return EMPTY_PROPERTIES;
	}

	@Override
	public Class<?> getCustomResourcePackClass() {
		return null;
	}

	@Override
	public Map<String, String> getSharedModDescriptor() {
		Map<String,String> descriptor = Maps.newHashMap();
        descriptor.put("modsystem", "CakeApi");
        descriptor.put("id", getModId());
        descriptor.put("version",getDisplayVersion());
        descriptor.put("name", getName());
        return descriptor;
	}

	@Override
	public Disableable canBeDisabled() {
		return Disableable.RESTART;
	}

	@Override
	public String getGuiClassName() {
		return "";
	}

	@Override
	public List<String> getOwnedPackages() {
		return modCandidate.getContainedPackages();
	}

	@Override
	public boolean shouldLoadInEnvironment() {
		return true;
	}
	
	@Override
    public String toString() {
        return "Cake Plugin:" + getName() + "(" + getVersion() + ")";
    }
}
