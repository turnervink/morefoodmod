package com.turnervink.morefood;

import com.turnervink.morefood.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Ref.MODID, name=Ref.NAME, version=Ref.VERSION)

/**
 * Created by turner on 2017-06-24.
 */
public class MoreFoodMod {

    @SidedProxy(clientSide=Ref.CLIENT_PROXY, serverSide=Ref.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

}
