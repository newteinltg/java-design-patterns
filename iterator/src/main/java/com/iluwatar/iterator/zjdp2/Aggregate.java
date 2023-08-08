package com.iluwatar.iterator.zjdp2;

/**
 * 抽象容器接口
 */
public interface Aggregate {
    // 每个集合都有添加的方法
    void add(Object object);

    // 减少元素
    void remove(Object obj);

    // 每个聚合类一般都会有迭代方法
    Iterator iterator();
}
