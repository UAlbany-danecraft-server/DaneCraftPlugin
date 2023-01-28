package com.danecraft.server.danecraftserver.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


/**
 * @author Theo willis
 * @version 1.0.0
 * ~ project outline here ~
 * @Javadoc
 */
public class SetCommand implements CommandExecutor {
    public SetCommand() {

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)){
            return false;
        }
        Player player = (Player) commandSender;
        player.sendMessage("");
        return false;
    }
}
