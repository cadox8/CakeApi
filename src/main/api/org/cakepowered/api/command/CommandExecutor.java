package org.cakepowered.api.command;

import org.cakepowered.api.util.Vector3i;

import java.util.List;

public interface CommandExecutor {

	String getName();

	String getCommandUsage(CommandSender commandSender);

	List<String> getAllias();

	void execute(CommandSender commandSender, String[] args);

	List<String> addTabCompletionOptions(CommandSender sender, String[] args, Vector3i pos);

	boolean canBeUsedBy(CommandSender commandSender);

}