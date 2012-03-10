/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mlp94.mobmodifier;

/**
 *
 * @author pham266693
 */
public class MobData {
    //CREEPER/MinHP/MaxHP/Damage/DetectionRange/BiomeID's/BlocksAllowed

    String mobName;
    int minHP, maxHP;
    //note: see EntityDamageEvent
    int damage;
    int range;
    int[] biomes, blocks;

    public MobData(String mobName, int minHP, int maxHP) {
        this.mobName = mobName;
        this.minHP = minHP;
        this.maxHP = maxHP;
    }

    public MobData(String mobName, int minHP, int maxHP, int damage) {
        this.mobName = mobName;
        this.minHP = minHP;
        this.maxHP = maxHP;
        this.damage = damage;
    }

    public MobData(String mobName, int minHP, int maxHP, int damage, int range) {
        this.mobName = mobName;
        this.minHP = minHP;
        this.maxHP = maxHP;
        this.damage = damage;
        this.range = range;
    }
    

    

    
    
    
    public int[] getBiomes() {
        return biomes;
    }

    public void setBiomes(int[] biomes) {
        this.biomes = biomes;
    }

    public int[] getBlocks() {
        return blocks;
    }

    public void setBlocks(int[] blocks) {
        this.blocks = blocks;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMinHP() {
        return minHP;
    }

    public void setMinHP(int minHP) {
        this.minHP = minHP;
    }

    public String getMobName() {
        return mobName;
    }

    public void setMobName(String mobName) {
        this.mobName = mobName;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    
    
}
