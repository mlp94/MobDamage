package com.github.mlp94.mobmodifier;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author ItsBill
 */
public class MobModifierMain extends JavaPlugin implements Listener {

    public static final String version = "v0.1";
    static final Logger log = Logger.getLogger("Minecraft");
    public DataLoader config = new DataLoader();
    public HashMap<String, MobData> mobData = new HashMap<>();

    @Override
    public void onEnable() {
        log.info("[MobModifier] Mobmodifier " + version + " enabled!");
        getServer().getPluginManager().registerEvents(this, this);

        //initialize

    }

    public void init() {
    }

    @Override
    public void onDisable() {
        log.info("[MobModifier] Mobmodifier disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return false;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        LivingEntity mob = event.getEntity();
        modifiyHP(mob);
    }

    public void modifiyHP(LivingEntity mob) {
        MobData reference = mobData.get(mob.getType().getName());
        int newHP = reference.getMinHP() + (int) ((reference.getMaxHP() - reference.getMinHP()) * Math.random());
        mob.setHealth(newHP);

    }
}
