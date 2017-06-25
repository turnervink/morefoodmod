package com.turnervink.morefood.items;

import net.minecraft.item.ItemSword;

/**
 * Created by turner on 2017-06-24.
 */
public class ItemKitchenKnife extends ItemSword {

    public ItemKitchenKnife(String name) {
        super(ToolMaterial.IRON);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

}
