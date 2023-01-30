package com.danecraft.server.danecraftserver.handlers;

import com.danecraft.server.danecraftserver.Danecraftserver;
import com.danecraft.server.danecraftserver.commands.SetSpawnProtection;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.*;
import java.io.*;


/**
 * @author Theo willis
 * @version 1.0.0
 * ~ project outline here ~
 * @Javadoc
 */
public class SpawnProtectionHandler implements Listener {
    public SpawnProtectionHandler(Danecraftserver plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void preventSpawnGrief(BlockBreakEvent event) {
        if(SetSpawnProtection.spawnLocation == null){
            Bukkit.getLogger().info("doesnt work (block break event)(condition failed)");
            return;
        }
        Location a = event.getPlayer().getLocation();

        if ((a.getX() <= SetSpawnProtection.spawnLocation.getX() && a.getX() >=
                (SetSpawnProtection.spawnLocation.getX() - 10)) ||
                (a.getZ() <= SetSpawnProtection.spawnLocation.getZ() && a.getZ() >=
                        (SetSpawnProtection.spawnLocation.getZ() - 10))) {
            Bukkit.getLogger().info("event works (break block)");
            event.setCancelled(true);

        }

        Bukkit.getLogger().info("doesnt work (block break event everything failed)"+a);

    }

    @EventHandler
    public void preventSpawnBlockPlace(BlockPlaceEvent event) {
        if(SetSpawnProtection.spawnLocation == null){
            Bukkit.getLogger().info("doesnt work (block break event everything failed)(cf failed)");
            return;
        }


        Location a = event.getPlayer().getLocation();
        if ((a.getX() <= SetSpawnProtection.spawnLocation.getX() && a.getX() >=
                (SetSpawnProtection.spawnLocation.getX() - 10)) ||
                (a.getZ() <= SetSpawnProtection.spawnLocation.getZ() && a.getZ() >=
                        (SetSpawnProtection.spawnLocation.getZ() - 10))) {
            Bukkit.getLogger().info("event works (place block)");
            event.setCancelled(true);

        }

        Bukkit.getLogger().info("doesnt work (block place event everything failed)"+a);
    }

}
