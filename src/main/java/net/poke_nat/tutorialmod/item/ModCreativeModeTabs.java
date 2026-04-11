package net.poke_nat.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.poke_nat.tutorialmod.TutorialMod;
import net.poke_nat.tutorialmod.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final Supplier<CreativeModeTab> ALEXANDRITE_ITEMS_TAB = CREATIVE_MODE_TAB.register("alexandrite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
            .title(Component.translatable("creativetab.tutorialmod.alexandrite_items"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.ALEXANDRITE);
                output.accept(ModItems.RAW_ALEXANDRITE);
                output.accept(ModItems.MAGICCHISEL);
                output.accept(ModItems.MAGIC_SUSHI);
                output.accept((ModItems.MGIC_COAL));
    }).build());

    public static final Supplier<CreativeModeTab> ALEXANDRITE_BLOCKS_TAB = CREATIVE_MODE_TAB.register("alexandrite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALEXANDRITE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID,"alexandrite_items_tab"))
            .title(Component.translatable("creativetab.tutorialmod.alexandrite_blocks"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModBlocks.ALEXANDRITE_BLOCK);
                output.accept(ModBlocks.ALEXANDRITE_ORE);
                output.accept(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE);
                output.accept(ModBlocks.MAGIC_BLOCK);
    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
