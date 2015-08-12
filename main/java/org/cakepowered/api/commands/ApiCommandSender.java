package org.cakepowered.api.commands;

import org.cakepowered.api.base.Player;
import org.cakepowered.api.command.CommandSender;
import org.cakepowered.api.util.ForgeInterface;
import org.cakepowered.api.util.Vector3d;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class ApiCommandSender implements CommandSender{

	public ICommandSender sender;
	
	public ApiCommandSender(ICommandSender sender){
		this.sender = sender;
	}
	
	@Override
	public String getName() {
		return sender.getName();
	}

	@Override
	public String getDisplayName() {
		IChatComponent comp = sender.getDisplayName();
		if(comp == null)return getName();
		return comp.getUnformattedText();
	}

	@Override
	public boolean canUseCommand(int permLevel, String commandName) {
		return sender.canUseCommand(permLevel, commandName);
	}

	@Override
	public Vector3d getPositionVector() {
		return ForgeInterface.getVector3(sender.getPositionVector());
	}

	@Override
	public Player getPlayer() {
		if(sender instanceof EntityPlayer)return ForgeInterface.getPlayer((EntityPlayer) sender);
		return null;
	}

	@Override
	public void sendMessage(String message) {
		sender.addChatMessage(new ChatComponentText(message));
	}

}
