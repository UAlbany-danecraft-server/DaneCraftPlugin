package com.danecraft.server.danecraftserver.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.*;
import java.io.*;


/**
 * @author Theo willis
 * @version 1.0.0
 * ~ project outline here ~
 * @Javadoc
 */
public class getSpawnLocation implements CommandExecutor {
    public getSpawnLocation() {

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
//        if(!(commandSender instanceof Player)){
//            return true;
//        }
//
//        Player p = (Player) commandSender;
//        if(SetSpawnProtection.spawnLocation == null){
//            p.sendMessage("spawn location is none existant do /setSpawnProtection");
//            return true;
//        }
//        p.sendMessage("X: "+SetSpawnProtection.spawnLocation.getX() + " Z: "+SetSpawnProtection.spawnLocation.getZ());
        return true;
    }
}
