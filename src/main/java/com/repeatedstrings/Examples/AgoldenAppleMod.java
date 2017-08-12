package com.repeatedstrings.Examples;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 8/5/17.
 */

@Mod(modid = com.repeatedstrings.Examples.AgoldenAppleMod.MODID,
        version = com.repeatedstrings.Examples.AgoldenAppleMod.VERSION)

public class AgoldenAppleMod {
    public static final String MODID = "agoldenapplemod";
    public static final String VERSION = "1";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("<<<<<<< Golden Apple Mod  >>>>>>");
        GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_APPLE),
                "NNN",
                "NPN",
                " N ", 'N', Blocks.GRAVEL, 'P', Blocks.LEAVES
                );
    }
}
