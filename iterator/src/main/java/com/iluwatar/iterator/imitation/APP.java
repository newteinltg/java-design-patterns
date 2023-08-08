package com.iluwatar.iterator.imitation;

import com.iluwatar.iterator.imitation.list.ItemType;
import com.iluwatar.iterator.imitation.list.TreasureChest;
import com.iluwatar.iterator.imitation.list.TreasureChestIterator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class APP {
    public static void main(String[] args) {
        LOGGER.info("-----------start iterator potion------------");
        TreasureChest treasureChest = new TreasureChest();
        TreasureChestIterator it = treasureChest.iterator(ItemType.POTION);
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
        LOGGER.info("-----------end iterator potion-------------");
    }
}
