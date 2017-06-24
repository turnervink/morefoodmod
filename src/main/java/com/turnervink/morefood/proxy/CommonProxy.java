package com.turnervink.morefood.proxy;

import com.turnervink.morefood.handlers.BlockHandler;
import com.turnervink.morefood.handlers.CraftingHandler;
import com.turnervink.morefood.handlers.ItemHandler;
import com.turnervink.morefood.handlers.SmeltingHandler;

/**
 * Created by turner on 2017-06-24.
 */
public class CommonProxy implements IProxy {

    public void preInit() {

        BlockHandler.init();
        BlockHandler.register();

        ItemHandler.init();
        ItemHandler.register();

    }

    public void init() {

    }

    public void postInit() {

        CraftingHandler.init();
        SmeltingHandler.init();

    }

}
