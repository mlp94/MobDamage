/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mlp94.mobmodifier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author ItsBill
 */
public class DataLoader
{

    static final Logger log = Logger.getLogger("Minecraft");
    //custom .dat system

    /*
     * This structure consists of the mob name, and its
     * configured stats separated by a / delimiter, for example
     * 
     * CREEPER/MinHP/MaxHP/Damage/DetectionRange/BiomeID's/BlocksAllowed
     * 
     */
    
    public void loadFiles()
    {
        try
        {
            Scanner file = new Scanner(new File("MobModifier/mobs.dat"));
        } catch (FileNotFoundException e)
        {
            log.info("\"mobs.dat\" does not exist! Creating default configuration. Edit using a plain text editor or commands.");
        } catch (Exception e)
        {
            log.info("An error occurred during file loading! Check format for errors or use commands to edit.");
        }
    }
    
    /*
     * Creates a default file
     */
    public void writeDefaultFile()
    {
        
    }
}