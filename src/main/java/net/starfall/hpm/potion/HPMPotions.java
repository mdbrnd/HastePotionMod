package net.starfall.hpm.potion;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.starfall.hpm.HastePotionMod;
import net.starfall.hpm.mixin.BrewingRecipeRegistryMixin;

public class HPMPotions {
    public static Potion HASTE_POTION;

    public static Potion registerPotion(String name, StatusEffect statusEffect, int duration, int amplifier) {
        return Registry.register(Registry.POTION, new Identifier(HastePotionMod.MOD_ID, name),
                new Potion(new StatusEffectInstance(statusEffect, duration, amplifier)));
    }

    public static void registerPotions() {
        HASTE_POTION = registerPotion("haste_potion", StatusEffects.HASTE,20*60*10, 1);
        registerPotionRecipes();
    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.EMERALD_BLOCK, HASTE_POTION);
    }
}
