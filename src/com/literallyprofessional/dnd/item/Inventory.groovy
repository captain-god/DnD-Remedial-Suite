package com.literallyprofessional.dnd.item

/**
 * This is a collection class that holds all the character's items. It contains the 
 * character's calculated weight limits (light load, heavy load, etc) and equipment
 * slots, such as equipped weapons, armor and sheilds.
 */
 
class Inventory {
    Map<String, Item> currentLoadout = new Map<String, Item>();
    //add a slot for all equipable areas using the key as the location and the item
    //as the item to be added
    
    Item[] onPerson = new Item[];
    
    public class Inventory(){
        currentLoadout = null;
    }
    
    public class Inventory(Item[] inventory){
        onPerson = inventory;
    }
    
    public Item[] getCurrentLoadout(){
        Item[] currentLoadout = new Item[(onPerson.length + currentLoadout.size)];
    }
}
