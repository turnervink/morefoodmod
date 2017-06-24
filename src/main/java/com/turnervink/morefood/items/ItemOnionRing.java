package com.turnervink.morefood.items;

import net.minecraft.item.ItemFood;

/**
 * Created by turner on 2017-06-24.
 */
public class ItemOnionRing extends ItemFood {

    public ItemOnionRing(String name, int restoreAmount, float saturation, boolean isWolfFood) {
        super(restoreAmount, saturation, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

}
