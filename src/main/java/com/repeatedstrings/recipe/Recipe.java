package com.repeatedstrings.recipe;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentFireAspect;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = com.repeatedstrings.recipe.Recipe.MODID, version = com.repeatedstrings.recipe.Recipe.VERSION)
public class Recipe {

    public static final String MODID = "recepie";
    public static final String VERSION = "1";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(">>>>>>>  Adding leaf apple <<<<<<<<<");
        GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_APPLE),
                "XXX",
                "XXX",
                "XXX",
                'X', Blocks.LEAVES);

        // sapeless Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND_HELMET),
                Items.BUCKET, Items.DIAMOND);

        // shapeless, +2 chickens
        GameRegistry.addShapelessRecipe(new ItemStack(Items.CHICKEN,2),
                Items.EGG, Items.EGG);

        //magic singing sword
        ItemStack magicSword = new ItemStack(Items.DIAMOND_SWORD);
        magicSword.addEnchantment(Enchantment.getEnchantmentByID(19),1);
        magicSword.addEnchantment(Enchantment.getEnchantmentByID(50),99);

        GameRegistry.addShapelessRecipe(magicSword, Items.WOODEN_SWORD, Items.DIAMOND);

        // smelting
        GameRegistry.addSmelting(Blocks.STONE, new ItemStack(Blocks.BRICK_BLOCK), 1F);
    }

}