package net.poke_nat.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties MAGIC_SUSHI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .alwaysEdible().effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1f).build();

}
