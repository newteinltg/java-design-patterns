package com.iluwatar.builder.imitation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class APP {
    public static void main(String[] args) {
        var mege = new Hero.Builder(Profession.MAGE, "Riobard")
                .whitHairColor(HairColor.BLACK)
                .withWeapon(Weapon.DAGGER)
                .build();
        LOGGER.info(mege.toString());

        var newteinltg = new Hero.Builder(Profession.MAGE,"Lee Aaron")
                .whitHairColor(HairColor.BLACK)
                .whitHairType(HairType.SHORT)
                .withWeapon(Weapon.SWORD)
                .withArmor(Armor.CLOTHES)
                .build();
        LOGGER.info(newteinltg.toString());
    }
}
