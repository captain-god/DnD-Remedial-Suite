package src.data.game;

import src.data.item.Currency;
import src.data.item.Item;
import src.data.player.*;

import java.util.ArrayList;

/**
 * Created by dougRiss on 4/29/2015.
 */
public class Settings {
    private ArrayList<Rule> listOfRules = new ArrayList<Rule>();
    private ArrayList<PlayerClass> listOfClasses = new ArrayList<PlayerClass>();
    private ArrayList<Ability> listOfAbilities = new ArrayList<Ability>();
    private ArrayList<Feat> listOfFeats = new ArrayList<Feat>();
    private ArrayList<Skill> listOfSkills = new ArrayList<Skill> ();
    private ArrayList<Race> listOfRaces = new ArrayList<Race>();
    private ArrayList<Item> listOfItems = new ArrayList<Item>();
    private ArrayList<Currency> listOfCurrencies = new ArrayList<Currency>();
    private String name;
    private String description;
    private static Settings instance;

    private Settings(String settingName, String settingDesc){
        this.name = settingName;
        this.description = settingDesc;
    }

    public static Settings getInstance(){
        if (instance == null){
            instance = new Settings("Default", "Edit Me!");
        }
        return instance;
    }

    public boolean setName(String s){
        if (s!= null){
            instance.name = s;
            return true;
        }
        else return false;
    }

    public String getName(){
        return instance.name;
    }

    public boolean setDescription(String s){
        if (s!= null){
            instance.description = s;
            return true;
        }
        else return false;
    }

    public String getDescription(){
        return instance.description;
    }

    public boolean readSettingsFromFile(){
        return true;
    }

    public boolean addRule(Rule r){
        if (r!=null){
            listOfRules.add(r);
            return true;
        }
        else return false;
    }

    public boolean removeRule(Rule r){
        if (r!= null){
            listOfRules.remove(r);
            return true;
        }
        else return false;
    }

    public boolean addClass(PlayerClass c){
        if (c!= null){
            listOfClasses.add(c);
            return true;
        }
        else return false;
    }

    public boolean removeClass(PlayerClass c){
        if (c!= null){
            listOfClasses.remove(c);
            return true;
        }
        else return false;
    }

    public boolean addAbility(Ability a){
        if (a!= null){
            listOfAbilities.add(a);
            return true;
        }
        else return false;
    }

    public boolean removeAbility(Ability a){
        if (a!= null){
            listOfAbilities.remove(a);
            return true;
        }
        else return false;
    }

    public boolean addFeat(Feat f){
        if (f!= null){
            listOfFeats.add(f);
            return true;
        }
        else return false;
    }

    public boolean removeFeat(Feat f){
        if (f!= null){
            listOfFeats.remove(f);
            return true;
        }
        else return false;
    }

    public boolean addSkill(Skill s){
        if (s!= null){
            listOfSkills.add(s);
            return true;
        }
        else return false;
    }

    public boolean removeSkill(Skill s){
        if (s!= null){
            listOfSkills.remove(s);
            return true;
        }
        else return false;
    }

    public boolean addRace(Race r){
        if (r!= null){
            listOfRaces.add(r);
            return true;
        }
        else return false;
    }

    public boolean removeRace(Race r){
        if (r!= null){
            listOfRaces.remove(r);
            return true;
        }
        else return false;
    }

    public boolean addItem(Item i){
        if (i!= null){
            listOfItems.add(i);
            return true;
        }
        else return false;
    }

    public boolean removeItem(Item i){
        if (i!= null){
            listOfItems.remove(i);
            return true;
        }
        else return false;
    }

    public boolean addCurrency(Currency c){
        if (c!= null){
            listOfCurrencies.add(c);
            return true;
        }
        else return false;
    }

    public ArrayList<Rule> getListOfRules() {
        return listOfRules;
    }

    public void setListOfRules(ArrayList<Rule> listOfRules) {
        this.listOfRules = listOfRules;
    }

    public ArrayList<PlayerClass> getListOfClasses() {
        return listOfClasses;
    }

    public void setListOfClasses(ArrayList<PlayerClass> listOfClasses) {
        this.listOfClasses = listOfClasses;
    }

    public ArrayList<Ability> getListOfAbilities() {
        return listOfAbilities;
    }

    public void setListOfAbilities(ArrayList<Ability> listOfAbilities) {
        this.listOfAbilities = listOfAbilities;
    }

    public ArrayList<Feat> getListOfFeats() {
        return listOfFeats;
    }

    public void setListOfFeats(ArrayList<Feat> listOfFeats) {
        this.listOfFeats = listOfFeats;
    }

    public ArrayList<Skill> getListOfSkills() {
        return listOfSkills;
    }

    public void setListOfSkills(ArrayList<Skill> listOfSkills) {
        this.listOfSkills = listOfSkills;
    }

    public ArrayList<Race> getListOfRaces() {
        return listOfRaces;
    }

    public void setListOfRaces(ArrayList<Race> listOfRaces) {
        this.listOfRaces = listOfRaces;
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(ArrayList<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public ArrayList<Currency> getListOfCurrencies() {
        return listOfCurrencies;
    }

    public void setListOfCurrencies(ArrayList<Currency> listOfCurrencies) {
        this.listOfCurrencies = listOfCurrencies;
    }
}
