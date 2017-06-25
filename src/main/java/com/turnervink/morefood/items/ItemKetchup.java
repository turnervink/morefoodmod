package com.turnervink.morefood.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by turner on 2017-06-24.
 */
public class ItemKetchup extends Item {

    public ItemKetchup(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);

    }

}
