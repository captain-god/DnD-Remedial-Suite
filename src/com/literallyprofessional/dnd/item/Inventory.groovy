package com.literallyprofessional.dnd.item

/**
 * This is a collection class that holds all the character's items. It contains the 
 * character's calculated weight limits (light load, heavy load, etc) and equipment
 * slots, such as equipped weapons, armor and shields.
 */
 
class Inventory {
    //currentLoadOut is all items associated with your character.
    Item[] currentLoadOut = new Item[25]();
    //on person is all gear and items not equipped, excluding money.
    Item[] onPerson = new Item[25]();
    //currentlyEquipped is all items equipped - weapons, armor and trinkets
    Map<String, Item> currentlyEquipped = new HashMap<String, Item>();

    int onPersonWeight;
    int currentLoadOutWeight;
    int characterStrength;
    int lightLoad;
    int mediumLoad;
    int heavyLoad;
    int maxLoad;

    int getMaxLoad() {
        return maxLoad
    }

    void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad
    }

    int getOnPersonWeight() {
        return onPersonWeight
    }

    void setOnPersonWeight(int onPersonWeight) {
        this.onPersonWeight = onPersonWeight
    }

    int getCurrentLoadOutWeight() {
        return currentLoadOutWeight
    }

    void setCurrentLoadOutWeight(int currentLoadOutWeight) {
        this.currentLoadOutWeight = currentLoadOutWeight
    }

    int getCharacterStrength() {
        return characterStrength
    }

    void setCharacterStrength(int characterStrength) {
        this.characterStrength = characterStrength
    }

    int getLightLoad() {
        return lightLoad
    }

    void setLightLoad(int lightLoad) {
        this.lightLoad = lightLoad
    }

    int getMediumLoad() {
        return mediumLoad
    }

    void setMediumLoad(int mediumLoad) {
        this.mediumLoad = mediumLoad
    }

    int getHeavyLoad() {
        return heavyLoad
    }

    void setHeavyLoad(int heavyLoad) {
        this.heavyLoad = heavyLoad
    }
    
    public Inventory(int chaStr){
        currentLoadOut = null;
        characterStrength = chaStr;
    }
    
    public Inventory(int chaStr, Item[] inventory){
        currentLoadOut = inventory;
        characterStrength=chaStr;
    }
    
    public Item[] getCurrentLoadOut(){
        return currentLoadOut;
    }
}
