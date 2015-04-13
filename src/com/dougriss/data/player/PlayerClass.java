package com.dougriss.data.player;

import com.dougriss.data.game.Dice;
import com.dougriss.data.item.ArmorType;
import com.dougriss.data.item.WeaponType;

/**
 * Created by dougriss on 4/9/15.
 * structure of a playable class in the game
 * Druid, Ranger, Sorcerer etc
 */
public class PlayerClass {
    private String name;
    private String description;
    private Dice hitDie;
    //here we have the table that represents the modifiers for each score;
    //for instance, if at level one you have +1 fort, the first entry int
    //fortTable will be 1. It's a system that I'll work on later, but it
    //works fine for now...
    private int[] fortTable = new int[20];
    private int[] willTable = new int[20];
    private int[] refTable = new int[20];
    private Feat[] bonusFeats = new Feat[20];
    private Skill[] classSkills = new Skill[20];
    private WeaponType[] weaponProficiencies = new WeaponType[13];
    private ArmorType[] armorProficiencies = new ArmorType[5];
    private Alignment classRestrictAlignment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Dice getHitDie() {
        return hitDie;
    }

    public void setHitDie(Dice hitDie) {
        this.hitDie = hitDie;
    }

    public int[] getFortTable() {
        return fortTable;
    }

    public void setFortTable(int[] fortTable) {
        this.fortTable = fortTable;
    }

    public int[] getWillTable() {
        return willTable;
    }

    public void setWillTable(int[] willTable) {
        this.willTable = willTable;
    }

    public int[] getRefTable() {
        return refTable;
    }

    public void setRefTable(int[] refTable) {
        this.refTable = refTable;
    }

    public Feat[] getBonusFeats() {
        return bonusFeats;
    }

    public void setBonusFeats(Feat[] bonusFeats) {
        this.bonusFeats = bonusFeats;
    }

    public Skill[] getClassSkills() {
        return classSkills;
    }

    public void setClassSkills(Skill[] classSkills) {
        this.classSkills = classSkills;
    }

    public WeaponType[] getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public void setWeaponProficiencies(WeaponType[] weaponProficiencies) {
        this.weaponProficiencies = weaponProficiencies;
    }

    public ArmorType[] getArmorProficiencies() {
        return armorProficiencies;
    }

    public void setArmorProficiencies(ArmorType[] armorProficiencies) {
        this.armorProficiencies = armorProficiencies;
    }

    public Alignment getClassRestrictAlignment() {
        return classRestrictAlignment;
    }

    public void setClassRestrictAlignment(Alignment classRestrictAlignment) {
        this.classRestrictAlignment = classRestrictAlignment;
    }
}
