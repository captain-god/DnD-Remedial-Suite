package com.literallyprofessional.dnd.character;

import com.literallyprofessional.dnd.core.*
import com.literallyprofessional.dnd.item.Inventory;

/**
 * A Character Class to house all our neat character info.
 * "Why is money, armor or weapon not present?"
 * -It's all accounted for inside of Inventory
 */
class Character implements Serializable{
    String          playerName;
    String          characterName;
    String          characterDescription;
    String          characterBio;
    Race            characterRace;
    CharacterClass  characterClass;
    CharacterClass  characterMultiClass;
    int             characterHitPoints;
    Feat[]          characterFeats;
    Ability[]       characterAbilities;
    Spell[]         characterSpells;
    Skill[]         characterSkills;
    Inventory       characterInventory;

    //God Bless IntelliJ and the Generate thingy it has. I made this whole class in like 1 minute.
    Character(String playerName, String characterName, String characterDescription, String characterBio,
              Race characterRace, CharacterClass characterClass, CharacterClass characterMultiClass,
              int characterHitPoints, Feat[] characterFeats, Ability[] characterAbilities, Spell[] characterSpells,
              Skill[] characterSkills, Inventory characterInventory) {
        this.playerName = playerName
        this.characterName = characterName
        this.characterDescription = characterDescription
        this.characterBio = characterBio
        this.characterRace = characterRace
        this.characterClass = characterClass
        this.characterMultiClass = characterMultiClass
        this.characterHitPoints = characterHitPoints
        this.characterFeats = characterFeats
        this.characterAbilities = characterAbilities
        this.characterSpells = characterSpells
        this.characterSkills = characterSkills
        this.characterInventory = characterInventory
    }

    String getPlayerName() {
        return playerName
    }

    void setPlayerName(String playerName) {
        this.playerName = playerName
    }

    String getCharacterName() {
        return characterName
    }

    void setCharacterName(String characterName) {
        this.characterName = characterName
    }

    String getCharacterDescription() {
        return characterDescription
    }

    void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription
    }

    String getCharacterBio() {
        return characterBio
    }

    void setCharacterBio(String characterBio) {
        this.characterBio = characterBio
    }

    Race getCharacterRace() {
        return characterRace
    }

    void setCharacterRace(Race characterRace) {
        this.characterRace = characterRace
    }

    CharacterClass getCharacterClass() {
        return characterClass
    }

    void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass
    }

    CharacterClass getCharacterMultiClass() {
        return characterMultiClass
    }

    void setCharacterMultiClass(CharacterClass characterMultiClass) {
        this.characterMultiClass = characterMultiClass
    }

    int getCharacterHitPoints() {
        return characterHitPoints
    }

    void setCharacterHitPoints(int characterHitPoints) {
        this.characterHitPoints = characterHitPoints
    }

    Feat[] getCharacterFeats() {
        return characterFeats
    }

    void setCharacterFeats(Feat[] characterFeats) {
        this.characterFeats = characterFeats
    }

    Ability[] getCharacterAbilities() {
        return characterAbilities
    }

    void setCharacterAbilities(Ability[] characterAbilities) {
        this.characterAbilities = characterAbilities
    }

    Spell[] getCharacterSpells() {
        return characterSpells
    }

    void setCharacterSpells(Spell[] characterSpells) {
        this.characterSpells = characterSpells
    }

    Skill[] getCharacterSkills() {
        return characterSkills
    }

    void setCharacterSkills(Skill[] characterSkills) {
        this.characterSkills = characterSkills
    }

    Inventory getCharacterInventory() {
        return characterInventory
    }

    void setCharacterInventory(Inventory characterInventory) {
        this.characterInventory = characterInventory
    }
}
