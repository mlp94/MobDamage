/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mlp94.mobmodifier;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ItsBill
 */
public class DataLoader {
    //list of mobs and defaults

    /*
     * 00 Blaze 
     * 01 CaveSpider 
     * 02 Chicken 
     * 03 Cow 
     * 04 Creeper 
     * 05 Enderman 
     * 06 Giant
     * 07 Golem 
     * 08 IronGolem 
     * 09 MushroomCow 
     * 10 Ocelot 
     * 11 Pig 
     * 12 PigZombie 
     * 13 Sheep 
     * 14 Silverfish 
     * 15 Skeleton 
     * 16 Snowman 
     * 17 Spider 
     * 18 Squid 
     * 19 Villager
     * 20 Wolf 
     * 21 Zombie
     */
    static final Logger log = Logger.getLogger("Minecraft");
    //custom .dat system

    /*
     * This .dat file structure consists of the mob name and its configured
     * stats which are separated by a / delimiter. For example:
     * Name/MinHP/MaxHP/Damage/DetectionRange/BiomeID's/BlocksAllowed
     */
    public void loadFiles() {
        try {
            Scanner file = new Scanner(new File("MobModifier/mobs.dat"));
        } catch (FileNotFoundException e) {
            log.info("[MobModifier] \"mobs.dat\" does not exist! Creating default configuration. Edit using a plain text editor or commands.");
            writeDefaultFile();
        } catch (Exception e) {
            log.info("[MobModifier] An error occurred during file loading! Check format for errors or use commands to edit.");
        }

    }

    /*
     * Creates a default file
     */
    public void writeDefaultFile() {
        try {
            FileWriter fstream = new FileWriter("MobModifier/mobs.dat");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(in.readLine());
            out.close();
            log.info("[MobModifier] File created successfully! Written to \"MobModifier/mods.dat\"");
            System.out.println("");
        } catch (IOException ex) {
            log.info("[MobModifier] Error writing file!");
        }
    }
}