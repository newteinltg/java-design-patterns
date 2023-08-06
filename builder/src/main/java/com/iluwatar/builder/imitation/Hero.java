package com.iluwatar.builder.imitation;


/**
 * Hero , record类
 */
public record Hero(Profession profession, String name, HairType hairType, HairColor hairColor, Armor armor,
                   Weapon weapon) {
    // Hero的全参构造器，使用Builder实例进行赋值
    private Hero(Builder builder) {
        this(builder.profession, builder.name, builder.hairType, builder.hairColor, builder.armor, builder.weapon);
    }

    @Override
    public String toString() {

        var sb = new StringBuilder();
        sb.append("This is a ")
                .append(profession)
                .append(" named ")
                .append(name);
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor).append(' ');
            }
            if (hairType != null) {
                sb.append(hairType).append(' ');
            }
            sb.append(hairType != HairType.BALD ? "hair" : "head");
        }
        if (armor != null) {
            sb.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ").append(weapon);
        }
        sb.append('.');
        return sb.toString();
    }

    /**
     * 内部静态类，目的是构造 Hero 对象
     */
    public static class Builder {
        private final Profession profession;
        private final String name;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;

        // 构造器
        public Builder(Profession profession, String name) {
            if (profession == null || name == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.profession = profession;
            this.name = name;
        }

        // 设置一个参数，然后返回当前实例，是链式调用的基础，这样减少了构造器的参数长度
        public Builder whitHairType(HairType hariType) {
            this.hairType = hairType;
            return this;
        }

        public Builder whitHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        // build 方法是用来创建Hero实例的
        public Hero build() {
            return new Hero(this);
        }
    }
}
