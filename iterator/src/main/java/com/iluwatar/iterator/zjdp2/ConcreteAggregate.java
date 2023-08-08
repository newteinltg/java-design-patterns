package com.iluwatar.iterator.zjdp2;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {

    private Vector vector = new Vector();

    @Override
    public void add(Object object) {
        vector.add(object);
    }

    @Override
    public void remove(Object obj) {
        vector.remove(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(vector);
    }
}
