package com.iluwatar.iterator.imitation.list;

import com.iluwatar.iterator.imitation.Iterator;

import java.util.List;

public class TreasureChestIterator implements Iterator<Item> {
    private TreasureChest chest;
    private ItemType type;
    private int idx; // 记录当前的索引


    public TreasureChestIterator(TreasureChest treasureChest, ItemType itemType) {
        this.chest = treasureChest;
        this.type = itemType;
        this.idx = -1;
    }

    // （从当前索引开始）判断集合是否有下一个元素
    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    // （从当前索引开始）获取集合中的下一个元素
    @Override
    public Item next() {
        idx = findNextIdx();
        if (idx != -1) {
            return chest.items().get(idx);
        }
        return null;
    }

    /**
     * 如果没有下一个元素，返回 -1；
     * 如果有下一个元素，返回被查类型（可以指定类型）的索引，一般的集合按照顺序返回下一个元素的索引。
     * @return int
     */
    private int findNextIdx() {
        var items = chest.items();
        var tempIds = idx;
        while (true) {
            tempIds++;
            if (tempIds >= items.size()) {
                tempIds = -1;
                break;
            }

            if (type.equals(ItemType.ANY) || items.get(tempIds).getItemType().equals(type)) {
                break;
            }
        }
        return tempIds;
    }
}
