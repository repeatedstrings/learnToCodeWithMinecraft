package com.repeatedstrings.mods.Bohr.Handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 5/16/17.
 *
 * issues: another stringindexout of bounds, 8.. I added ammount:1, didn't fix
 * commented out to pickaxe, pickaxe works
 *
 * it was sword, i had "X " --> didn't have " X "
 * array count from 0, so 9 slots, it didn't have enough slots.
 */
public class BohrishRecipeHandler {

    public static void init() {
        GameRegistry.addSmelting(BohrishHandler.bohrOre, new ItemStack(BohrishHandler.bohrite), 1);

        GameRegistry.addRecipe(new ItemStack(BohrishHandler.bohrPickaxe,1),
                "XXX",
                " Y ",
                " Y ",
                'X', BohrishHandler.bohrite,
                'Y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(BohrishHandler.bohrShovel,1),
                " X ",
                " Y ",
                " Y ",
                'X', BohrishHandler.bohrite,
                'Y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(BohrishHandler.bohrHoe,1),
                "XX ",
                " Y ",
                " Y ",
                'X', BohrishHandler.bohrite,
                'Y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(BohrishHandler.bohrAxe,1),
                "XX ",
                "XY ",
                " Y ",
                'X', BohrishHandler.bohrite,
                'Y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(BohrishHandler.bohrSword,1),
                " X ",
                " X ",
                " Y ",
                'X', BohrishHandler.bohrite,
                'Y', Items.STICK);
    }
}
