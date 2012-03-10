/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mlp94.mobmodifier;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MLP
 */
public class DataWriter {

    public final String filename = "mobconfig.dat";
    public static final Logger log = Logger.getLogger("Minecraft");

    /*
     * Default mob values?
     */
    
    /*
     * @param Writes the default data file if it does not exist
     */
    public void writeDefault() throws IOException {
        log.info("Writing default MobModifier config file " + filename + " in folder MobModifier");
        Writer out = new OutputStreamWriter(new FileOutputStream(filename));
        try {
            String data = "";
            
            
            out.write(data);
        } catch (Exception e) {
            log.log(Level.INFO, "Error while writing default file: {0}", e.getMessage());
        } finally {
            out.close();
        }
    }
}
