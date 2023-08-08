package com.iluwatar.iterator.imitation.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 百宝箱集合类
 */
public class TreasureChest {
    public List<Item> items;

    public TreasureChest() {
        items = List.of(new Item(ItemType.POTION, "Potion of courage"),
                new Item(ItemType.RING, "Ring of shadows"),
                new Item(ItemType.POTION, "Potion of wisdom"),
                new Item(ItemType.POTION, "Potion of blood"),
                new Item(ItemType.WEAPON, "Sword of silver +1"),
                new Item(ItemType.POTION, "Potion of rust"),
                new Item(ItemType.POTION, "Potion of healing"));
    }

    // 集合类的迭代器,ItemType 可以指定迭代的子类型
    public TreasureChestIterator iterator(ItemType itemType) {
        return new TreasureChestIterator(this,itemType);
    }

    // 获取所有的集合元素
    public List<Item> items(){
        return new ArrayList<>(this.items);
    }
}
