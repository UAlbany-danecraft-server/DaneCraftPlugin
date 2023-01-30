package com.danecraft.server.danecraftserver;

import com.danecraft.server.danecraftserver.commands.*;
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
        getCommand("cleanInv").setExecutor(new cleanInv());
//        getCommand("SetSpawnProtection").setExecutor(new SetSpawnProtection());
//        getCommand("RemoveSpawnProtection").setExecutor(new RemoveSpawnProtection());
//        getCommand("getSpawnLocation").setExecutor(new getSpawnLocation());
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("goodbye world");

    }
}
