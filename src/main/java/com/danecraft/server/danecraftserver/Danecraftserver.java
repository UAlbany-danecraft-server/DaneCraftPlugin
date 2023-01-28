package com.danecraft.server.danecraftserver;

import com.danecraft.server.danecraftserver.commands.Help;
import com.danecraft.server.danecraftserver.commands.Kill;
import com.danecraft.server.danecraftserver.commands.rules;
import com.danecraft.server.danecraftserver.handlers.PlayerHandler;
import com.danecraft.server.danecraftserver.handlers.SpawnProtectionHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Danecraftserver extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("hello world");
        //~~~~~~~~~~~~HANDLER CALLS ~~~~~~~~~~~~~~~~~~~~
        new SpawnProtectionHandler(this);
        new PlayerHandler(this);
        //~~~~~~~~~~~~~commands ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        getCommand("rules").setExecutor(new rules());
        getCommand("Kill").setExecutor(new Kill());
        getCommand("helpD").setExecutor(new Help());
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("goodbye world");

    }
}
