package com.literallyprofessional.dnd.item

/**
 * This is a collection class that holds all the character's items. It contains the 
 * character's calculated weight limits (light load, heavy load, etc) and equipment
 * slots, such as equipped weapons, armor and shields.
 *
 * NOTE: The weight stuff (load class and such) will not be implemented this release
 * because the 3.5 core for light, medium and heavy fucking blooooooows. So we'll
 * figure that out in a later version.
 */

class Inventory implements Serializable{
    //currentLoadOut is all items associated with your character.
    private Item[] currentLoadOut;
    //currentlyEquipped is all items equipped by your character: armor, weapons, rings, trinkets etc.
    private Map<Slot, Item> currentlyEquipped;

    private Currency moneyOnPerson;
    private int onPersonWeight;
    private int currentLoadOutWeight;
    private int characterStrength;
//    private int lightLoad;
//    private int mediumLoad;
//    private int heavyLoad;

    public Inventory(int chaStr, Item[] inventory){
        currentLoadOut = inventory; //it can be an empty array, but it must be an array nonetheless.
        characterStrength = chaStr; //used to determine the weight limits
        currentlyEquipped = new HashMap<Slot, Item>(); //initialize this thing
//        setWeightConstraints();
    }

//    public void setWeightConstraints(){
//        //unfortunately, dungeons and dragons' weight constraints are not formulaic - that is, they fucking suck, so
//        //we have to do a huge, shitty switch statement.
//
//        switch(characterStrength){
//            case 1:
//                lightLoad =
//                heavyLoad = 7
//                break;
//            default: //the rule for all numbers > 29
//
//                break;
//        }
//    }

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

    public int getMediumLoad() {
        return mediumLoad
    }

    public int getHeavyLoad() {
        return heavyLoad
    }

    public Item[] getCurrentLoadOut(){
        return currentLoadOut;
    }

    Currency getMoneyOnPerson() {
        return moneyOnPerson
    }

    void setMoneyOnPerson(Currency moneyOnPerson) {
        this.moneyOnPerson = moneyOnPerson
    }

    //gingerly remove the item from the character's inventory.
    boolean unEquipItemFrom(Slot itemSlot){
        if(currentlyEquipped[itemSlot]){
            currentlyEquipped[itemSlot] = null;
            return true;
        }
        else{
            return false;
        }
    }

    String equipItemTo(Slot itemSlot, Item toEquip){
        if(currentlyEquipped[itemSlot]){ //if not null, that is
            Item existing = currentlyEquipped[itemSlot];
            currentlyEquipped[itemSlot] = toEquip;
            return "Replaced " + existing + " with " + toEquip + ".";
        }
        else{
            currentlyEquipped[itemSlot] = toEquip;
            return "Equipped " + toEquip;
        }
    }
}