package com.dougriss.data.game;

import com.dougriss.data.item.Currency;
import com.dougriss.data.item.Item;
import com.dougriss.data.player.*;

import java.util.ArrayList;

/**
 * Created by dougriss on 4/9/15.
 * Houses rules and configurations for this loadout
 */
public class Configuration {
    private ArrayList<Rule> listOfRules;
    private ArrayList<PlayerClass> listOfClasses;
    private ArrayList<Ability> listOfAbilities;
    private ArrayList<Feat> listOfFeats;
    private ArrayList<Skill> listOfSkills;
    private ArrayList<Race> listOfRaces;
    private ArrayList<Item> listOfItems;
    private ArrayList<Currency> listOfCurrencies;
    private String name;
    private String description;

    public ArrayList<Rule> getListOfRules() {
        return listOfRules;
    }

    public void setListOfRules(ArrayList<Rule> listOfRules) {
        this.listOfRules = listOfRules;
    }

    public void addRule(Rule newRule) {
        listOfRules.add(newRule);
    }

    public void removeRule(Rule oldRule) {
        listOfRules.remove(oldRule);
    }

    public void removeRule(int ruleIndex) {
        listOfRules.remove(ruleIndex);
    }

    public ArrayList<PlayerClass> getListOfClasses() {
        return listOfClasses;
    }

    public void setListOfClasses(ArrayList<PlayerClass> listOfClasses) {
        this.listOfClasses = listOfClasses;
    }

    public void addAllowedClass(PlayerClass newClass) {
        listOfClasses.add(newClass);
    }

    public void RemoveAllowedClass(PlayerClass oldClass) {
        listOfClasses.remove(oldClass);
    }

    public void RemoveAllowedClass(int classIndex) {
        listOfClasses.remove(classIndex);
    }

    public ArrayList<Ability> getListOfAbilities() {
        return listOfAbilities;
    }

    public void setListOfAbilities(ArrayList<Ability> listOfAbilities) {
        this.listOfAbilities = listOfAbilities;
    }

    public void addAllowedAbility(Ability newAbility) {
        listOfAbilities.add(newAbility);
    }

    public void RemoveAllowedAbility(Ability oldAbility) {
        listOfAbilities.remove(oldAbility);
    }

    public void RemoveAllowedAbility(int abilityIndex) {
        listOfAbilities.remove(abilityIndex);
    }

    public ArrayList<Feat> getListOfFeats() {
        return listOfFeats;
    }

    public void setListOfFeats(ArrayList<Feat> listOfFeats) {
        this.listOfFeats = listOfFeats;
    }

    public void addAllowedFeat(Feat newFeat) {
        listOfFeats.add(newFeat);
    }

    public void removeAllowedFeat(Feat oldFeat) {
        listOfFeats.remove(oldFeat);
    }

    public void removeAllowedFeat(int featIndex) {
        listOfFeats.remove(featIndex);
    }

    public ArrayList<Skill> getListOfSkills() {
        return listOfSkills;
    }

    public void setListOfSkills(ArrayList<Skill> listOfSkills) {
        this.listOfSkills = listOfSkills;
    }

    public void addSkill(Skill newSkill) {
        listOfSkills.add(newSkill);
    }

    public void removeSkill(Skill oldSkill) {
        listOfSkills.remove(oldSkill);
    }

    public void removeSkill(int skillIndex) {
        listOfSkills.remove(skillIndex);
    }

    public ArrayList<Race> getListOfRaces() {
        return listOfRaces;
    }

    public void setListOfRaces(ArrayList<Race> listOfRaces) {
        this.listOfRaces = listOfRaces;
    }

    public void addRace(Race newRace) {
        listOfRaces.add(newRace);
    }

    public void removeRace(Race oldRace) {
        listOfRaces.remove(oldRace);
    }

    public void removeRace(int raceIndex) {
        listOfRaces.remove(raceIndex);
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(ArrayList<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public void addItem(Item newItem){
        listOfItems.add(newItem);
    }

    public void removeItem(Item oldItem){
        listOfItems.remove(oldItem);
    }

    public void removeItem(int itemIndex){
        listOfItems.remove(itemIndex);
    }

    public ArrayList<Currency> getListOfCurrencies() {
        return listOfCurrencies;
    }

    public void setListOfCurrencies(ArrayList<Currency> listOfCurrencies) {
        this.listOfCurrencies = listOfCurrencies;
    }

    public void addCurrency(Currency newCurrency){
        listOfCurrencies.add(newCurrency);
    }

    public void removeCurrency(Currency oldCurrency){
        listOfCurrencies.remove(oldCurrency);
    }

    public void removeCurrency(int currencyIndex){
        listOfCurrencies.remove(currencyIndex);
    }

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
}
