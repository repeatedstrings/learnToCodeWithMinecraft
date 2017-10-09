package com.repeatedstrings.mods.Bohr.StartLine;

//import com.repeatedstrings.mods.Bohr.BohrRecipe.BohrishRecipeHandler;
import com.repeatedstrings.mods.Bohr.Handlers.BohrBlockHandler;
import com.repeatedstrings.mods.Bohr.Handlers.BohrishArmorHandler;
import com.repeatedstrings.mods.Bohr.Handlers.BohrishHandler;
import com.repeatedstrings.mods.Bohr.Handlers.BohrishRecipeHandler;
import com.repeatedstrings.mods.BohrBlockGen.PlaceThatBohrBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 5/6/17.
 */
public class ReadySetGo {
    public void preInit() {
        BohrishHandler.init();
        BohrishHandler.register();

        BohrBlockHandler.init();
        BohrBlockHandler.register();

        GameRegistry.registerWorldGenerator(new PlaceThatBohrBlock(),0);

        BohrishRecipeHandler.init();

        BohrishArmorHandler.init();
        BohrishArmorHandler.register();
    }

    public void init() {
        BohrishHandler.registerRenders();

        BohrBlockHandler.registerRenders();

        BohrishArmorHandler.registerRenders();
    }

    public void postInit() {
    }
}
