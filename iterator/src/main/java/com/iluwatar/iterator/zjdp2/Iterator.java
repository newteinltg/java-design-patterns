package com.iluwatar.iterator.zjdp2;

/**
 * 迭代器接口
 */
public interface Iterator {
    // 是否还有其它元素
    boolean hasNext();
    // 下一个元素
    Object next();
    // 移除当前游标指向的元素
    boolean remove();
}
