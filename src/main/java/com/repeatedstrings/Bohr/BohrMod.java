package com.repeatedstrings.Bohr;

import com.repeatedstrings.Bohr.Config.Config;
import com.repeatedstrings.Bohr.Proxy.MyProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by james on 5/6/17.
 */
@Mod(modid= Config.MODID, name=Config.NAME, version=Config.VERSION)
public class BohrMod {
    @SidedProxy(clientSide = Config.CLIENT_PROXY, serverSide = Config.SERVER_PROXY)
    public static MyProxy myProxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        myProxy.preInit();


    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        myProxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        myProxy.postInit();
    }
}
