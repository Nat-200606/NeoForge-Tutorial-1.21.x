package net.poke_nat.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.poke_nat.tutorialmod.TutorialMod;
import net.poke_nat.tutorialmod.item.custom.MagicChiselItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MOD_ID);

    public static final DeferredItem<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGICCHISEL = ITEMS.register("magic_chisel",
            () -> new MagicChiselItem(new Item.Properties().durability(64)));
    public static final DeferredItem<Item> MAGIC_SUSHI = ITEMS.register("magic_sushi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MAGIC_SUSHI)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
