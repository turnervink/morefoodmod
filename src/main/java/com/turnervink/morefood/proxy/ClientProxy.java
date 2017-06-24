package com.turnervink.morefood.proxy;

import com.turnervink.morefood.handlers.BlockHandler;
import com.turnervink.morefood.handlers.ItemHandler;

/**
 * Created by turner on 2017-06-24.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void init() {

        BlockHandler.registerRenders();
        ItemHandler.registerRenders();

    }
}
