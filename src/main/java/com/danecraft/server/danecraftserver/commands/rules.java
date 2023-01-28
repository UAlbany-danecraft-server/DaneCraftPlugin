package com.danecraft.server.danecraftserver.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;


/**
 * @author Theo willis
 * @version 1.0.0
 * ~ project outline here ~
 * @Javadoc
 */
public class rules implements CommandExecutor {
    public rules() {

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)){
            return true;
        }
        Player p = (Player) commandSender;
        p.sendMessage("1. this server is exclusive to UAlbany students");
        p.sendMessage("2. this server is exclusive to UAlbany students To be whitelisted, a member must fill out the google form and provide valid information");
        p.sendMessage("3. no killing or greifing stealing");
        p.sendMessage("4. all UA laws and US laws apply");
        p.sendMessage("5. no modified clients or mods that give an advantage of any kind");
        p.sendMessage( "6. be nice and have fun");
        p.sendMessage("any questions DM TheoW#4769 or noahlevine #8821 on discord thank you :)");
        return true;
    }
}
