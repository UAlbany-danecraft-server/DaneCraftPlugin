package com.danecraft.server.danecraftserver.handlers;

import com.danecraft.server.danecraftserver.Danecraftserver;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.*;
import java.io.*;


/**
 * @author Theo willis
 * @version 1.0.0
 * ~ project outline here ~
 * @Javadoc
 */
public class TorchHandler implements Listener {
    public TorchHandler(Danecraftserver plugin) {
        Bukkit.getPluginManager().registerEvents(this,plugin);
    }
    @EventHandler
    public  void  onTorchPlace(BlockPlaceEvent event){


    }
}
