package com.repeatedstrings.mods.Bohr;

import com.repeatedstrings.mods.Bohr.Config.Config;
import com.repeatedstrings.mods.Bohr.Handlers.BohrBlockHandler;
import com.repeatedstrings.mods.Bohr.Handlers.BohrishArmorHandler;
import com.repeatedstrings.mods.Bohr.Handlers.BohrishHandler;
import com.repeatedstrings.mods.Bohr.Handlers.BohrishRecipeHandler;
import com.repeatedstrings.mods.BohrBlockGen.PlaceThatBohrBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 5/6/17.
 */
@Mod(modid= Config.MODID, name=Config.NAME, version=Config.VERSION)
public class BohrMod {
//    @SidedProxy(clientSide = Config.CLIENT_PROXY, serverSide = Config.SERVER_PROXY)
//    public static ReadySetGo readySetGo;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        BohrishHandler.init();
        BohrishHandler.register();

        BohrBlockHandler.init();
        BohrBlockHandler.register();

        GameRegistry.registerWorldGenerator(new PlaceThatBohrBlock(),0);

        BohrishRecipeHandler.init();

        BohrishArmorHandler.init();
        BohrishArmorHandler.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        {
            BohrishHandler.registerRenders();

            BohrBlockHandler.registerRenders();
            BohrishArmorHandler.registerRenders();
        }
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
