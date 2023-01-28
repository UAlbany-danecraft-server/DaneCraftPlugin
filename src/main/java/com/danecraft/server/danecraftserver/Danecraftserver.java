package com.danecraft.server.danecraftserver;

import com.danecraft.server.danecraftserver.commands.rules;
import com.danecraft.server.danecraftserver.handlers.PlayerHandler;
import com.danecraft.server.danecraftserver.handlers.TorchHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Danecraftserver extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("hello world");
        new TorchHandler(this);
        new PlayerHandler(this);
        getCommand("rules").setExecutor(new rules());

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("goodbye world");

    }
}
