package com.repeatedstrings.Bohr.Proxy;

//import com.repeatedstrings.Bohr.BohrRecipe.BohrishRecipeHandler;
import com.repeatedstrings.Bohr.Items.BohrishHandler;
import com.repeatedstrings.BohrBlock.items.BohrBlockHandler;
import com.repeatedstrings.BohrBlockGen.PlaceThatBohrBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 5/6/17.
 */
public class MyProxy {
    public void preInit() {
        BohrishHandler.init();
        BohrishHandler.register();

        BohrBlockHandler.init();
        BohrBlockHandler.register();

        GameRegistry.registerWorldGenerator(new PlaceThatBohrBlock(),0);



    }

    public void init() {
        BohrishHandler.registerRenders();
        BohrBlockHandler.registerRenders();
//        BohrishRecipeHandler.createBohrRecipe();
    }

    public void postInit() {
    }
}
