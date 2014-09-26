package com.literallyprofessional.dnd.item

/**
 * This is a collection class that holds all the character's items. It contains the 
 * character's calculated weight limits (light load, heavy load, etc) and equipment
 * slots, such as equipped weapons, armor and shields.
 */
 
class Inventory {
    //currentLoadOut is all items associated with your character.
    private Item[] currentLoadOut;
    //on person is all gear and items not equipped, excluding money.
    private Item[] onPerson;
    //currentlyEquipped is all items equipped - weapons, armor and trinkets
    private Map<String, Item> currentlyEquipped;

    private int onPersonWeight;
    private int currentLoadOutWeight;
    private int characterStrength;
    private int lightLoad;
    private int mediumLoad;
    private int heavyLoad;
    private int maxLoad;

    public Inventory(int chaStr){
        currentLoadOut = new Item[25]();
        onPerson = new Item[25]();
        setUpEquipSlots();
        characterStrength = chaStr;
    }

    public Inventory(int chaStr, Item[] inventory){
        currentLoadOut = inventory;
        onPerson = new Item[25]();
        setUpEquipSlots();
        characterStrength=chaStr;
    }

    private setUpEquipSlots(){
        currentlyEquipped = new HashMap<String, Item>();
        currentlyEquipped["head"]=null;
        currentlyEquipped["chest"]=null;
        currentlyEquipped["legs"]=null;
        currentlyEquipped["feet"]=null;
        currentlyEquipped["hands"]=null;
        currentlyEquipped["waist"]=null;
        currentlyEquipped["neck"]=null;
        currentlyEquipped["ring1"]=null;
        currentlyEquipped["ring2"]=null;
        //more to come?
    }

    public int getMaxLoad() {
        return maxLoad
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad
    }

    public int getOnPersonWeight() {
        return onPersonWeight
    }

    public void setOnPersonWeight(int onPersonWeight) {
        this.onPersonWeight = onPersonWeight
    }

    public  int getCurrentLoadOutWeight() {
        return currentLoadOutWeight
    }

    public void setCurrentLoadOutWeight(int currentLoadOutWeight) {
        this.currentLoadOutWeight = currentLoadOutWeight
    }

    public int getCharacterStrength() {
        return characterStrength
    }

    public void setCharacterStrength(int characterStrength) {
        this.characterStrength = characterStrength
    }

    public int getLightLoad() {
        return lightLoad
    }

    public void setLightLoad(int lightLoad) {
        this.lightLoad = lightLoad
    }

    public int getMediumLoad() {
        return mediumLoad
    }

    public void setMediumLoad(int mediumLoad) {
        this.mediumLoad = mediumLoad
    }

    public int getHeavyLoad() {
        return heavyLoad
    }

    public void setHeavyLoad(int heavyLoad) {
        this.heavyLoad = heavyLoad
    }

    public Item[] getCurrentLoadOut(){
        return currentLoadOut;
    }
}
