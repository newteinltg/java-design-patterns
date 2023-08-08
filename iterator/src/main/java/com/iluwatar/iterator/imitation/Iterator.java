package com.iluwatar.iterator.imitation;

/**
 * 迭代器接口
 * 可以被不同数据结构的迭代器实现。
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
