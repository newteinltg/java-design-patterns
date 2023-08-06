package com.iluwatar.builder.imitation;

/**
 * 头发颜色枚举类
 */
public enum HairColor {
    WHITE,
    BLOND,
    RED,
    BROWN,
    BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
