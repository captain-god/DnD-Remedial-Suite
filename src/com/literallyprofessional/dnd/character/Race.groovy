package com.literallyprofessional.dnd.character

import com.literallyprofessional.dnd.core.Skill
import com.literallyprofessional.dnd.core.Spell

/**
 * This is the class that builds races.
 */
class Race implements Serializable {
    private String raceName;
    private String raceDescription;
    private Language[] raceDefaultLanguage; //for instance, half-orcs start with common and one other choice.
    private CharacterClass raceFavoredClass;
    private Size raceSize;
    //racial mods to skills
    private int strMod;
    private int conMod;
    private int dexMod;
    private int wisMod;
    private int intMod;
    private int chaMod;
    private int levelAdjustment; //not supported in phb1, but some mm classes need this. accounting for it now cant hurt.
    private Skill[] bonusSkills; //for instance, elves have +2 to listen
    private Spell[] bonusSpells; //for instance, gnomes have ghost sound

    public Race(String name, String description, Language[] languages, CharacterClass favoredClass, Size size,
                int str, int con, int dex, int wis, int intel, int cha, int levelAdjustment, Skill[] bonusSkills,
                Spell[] bonusSpells){
        this.raceName = name;
        this.raceDescription = description;
        this.raceDefaultLanguage = languages;
        this.raceFavoredClass = favoredClass;
        this.raceSize = size;
        this.strMod = str;
        this.conMod = con;
        this.dexMod = dex;
        this.wisMod = wis;
        this.intMod = intel;
        this.chaMod = cha;
        this.levelAdjustment = levelAdjustment;
        this.bonusSkills = bonusSkills;
        this.bonusSpells = bonusSpells;
    }

    Spell[] getBonusSpells() {
        return bonusSpells
    }

    void setBonusSpells(Spell[] bonusSpells) {
        this.bonusSpells = bonusSpells
    }

    String getRaceName() {
        return raceName
    }

    void setRaceName(String raceName) {
        this.raceName = raceName
    }

    String getRaceDescription() {
        return raceDescription
    }

    void setRaceDescription(String raceDescription) {
        this.raceDescription = raceDescription
    }

    Language[] getRaceDefaultLanguage() {
        return raceDefaultLanguage
    }

    void setRaceDefaultLanguage(Language[] raceDefaultLanguage) {
        this.raceDefaultLanguage = raceDefaultLanguage
    }

    CharacterClass getRaceFavoredClass() {
        return raceFavoredClass
    }

    void setRaceFavoredClass(CharacterClass raceFavoredClass) {
        this.raceFavoredClass = raceFavoredClass
    }

    Size getRaceSize() {
        return raceSize
    }

    void setRaceSize(Size raceSize) {
        this.raceSize = raceSize
    }

    int getStrMod() {
        return strMod
    }

    void setStrMod(int strMod) {
        this.strMod = strMod
    }

    int getConMod() {
        return conMod
    }

    void setConMod(int conMod) {
        this.conMod = conMod
    }

    int getDexMod() {
        return dexMod
    }

    void setDexMod(int dexMod) {
        this.dexMod = dexMod
    }

    int getWisMod() {
        return wisMod
    }

    void setWisMod(int wisMod) {
        this.wisMod = wisMod
    }

    int getIntMod() {
        return intMod
    }

    void setIntMod(int intMod) {
        this.intMod = intMod
    }

    int getChaMod() {
        return chaMod
    }

    void setChaMod(int chaMod) {
        this.chaMod = chaMod
    }

    int getLevelAdjustment() {
        return levelAdjustment
    }

    void setLevelAdjustment(int levelAdjustment) {
        this.levelAdjustment = levelAdjustment
    }

    Skill[] getBonusSkills() {
        return bonusSkills
    }

    void setBonusSkills(Skill[] bonusSkills) {
        this.bonusSkills = bonusSkills
    }
}
