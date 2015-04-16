package src.data.player;

import java.util.ArrayList;

public class Character {
    private String name;
    private String player;
    private Race race;
    private ArrayList<Ability> abilities;
    private ArrayList<Feat> feats;
    private ArrayList<Skill> skills;
    private ArrayList<PlayerClass> classes;
    private int experience;
    private int hp;
    private int ac;
    private int will;
    private int fortitude;
    private int reflex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Feat> getFeats() {
        return feats;
    }

    public void setFeats(ArrayList<Feat> feats) {
        this.feats = feats;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public ArrayList<PlayerClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<PlayerClass> classes) {
        this.classes = classes;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        this.will = will;
    }

    public int getFortitude() {
        return fortitude;
    }

    public void setFortitude(int fortitude) {
        this.fortitude = fortitude;
    }

    public int getReflex() {
        return reflex;
    }

    public void setReflex(int reflex) {
        this.reflex = reflex;
    }
}
