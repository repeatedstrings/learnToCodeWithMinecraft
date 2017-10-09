package com.repeatedstrings.mods.mod1;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Mod1.MODID, version = Mod1.VERSION)
public class Mod1 {

    public static final String MODID =  "mod1";
    public static final String VERSION = "1";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Anvil >> "+ Blocks.ANVIL.getUnlocalizedName());
    }

}
