package com.github.mlp94.mobmodifier;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author MLP
 */
public class MobModifierMain extends JavaPlugin implements Listener {

    public static final String version = "v0.1";
    public static final Logger log = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        log.info("[MobModifier] " + version + " enabled!");
    }

    @Override
    public void onDisable() {
        log.info("[MobModifier] " + version + " disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        
        return super.onCommand(sender, command, label, args);
    }
    
    
}
