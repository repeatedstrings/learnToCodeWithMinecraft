package com.repeatedstrings.Bohr.BohrRecipe;

import com.repeatedstrings.Bohr.Items.BohrishHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 5/16/17.
 */
public class BohrishRecipeHandler {
    public static void createBohrRecipe() {
        GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_PICKAXE),
                "XXX",
                " Y ",
                " Y ",
                'X', BohrishHandler.bohrOre,
                'Y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_SHOVEL),
                " X ",
                " Y ",
                " Y ",
                'X', BohrishHandler.bohrOre,
                'Y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_HOE),
                "XX ",
                " Y ",
                " Y ",
                'X', BohrishHandler.bohrOre,
                'Y', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(BohrishHandler.bohrAxe),
                "XX ",
                "XY ",
                " Y ",
                'X', BohrishHandler.bohrOre,
                'Y', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_SWORD),
                "X ",
                " X ",
                " Y ",
                'X', BohrishHandler.bohrOre,
                'Y', Items.STICK);
    }

}
