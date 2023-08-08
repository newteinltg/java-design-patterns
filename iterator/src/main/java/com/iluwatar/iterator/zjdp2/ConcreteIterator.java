package com.iluwatar.iterator.zjdp2;

import java.util.Vector;

public class ConcreteIterator implements Iterator {

    // 集合列表
    private Vector vector = new Vector();
    // 集合中的游标
    private int cursor;

    // 迭代器的带参构造
    public ConcreteIterator(Vector _vector) {
        this.vector = _vector;
        cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor < vector.size();
    }

    // 获取当前游标的元素，并且将游标指向下一个元素
    @Override
    public Object next() {
        Object obj = null;
        if (hasNext()) obj = vector.get(cursor++);
        return obj;
    }

    // 删除当前游标指向的元素
    @Override
    public boolean remove() {
        vector.remove(this.cursor);
        return true;
    }
}
