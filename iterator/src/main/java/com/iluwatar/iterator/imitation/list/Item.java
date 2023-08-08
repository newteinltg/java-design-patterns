package com.iluwatar.iterator.imitation.list;

/**
 * 法器和法器的描述
 */
public class Item {
    private ItemType itemType;
    private String name;

    public Item(ItemType itemType, String name) {
        this.itemType = itemType;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public ItemType getItemType() {
        return this.itemType;
    }

    @Override
    public String toString() {
        return name;
    }
}
