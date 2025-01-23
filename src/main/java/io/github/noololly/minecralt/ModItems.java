package io.github.noololly.minecralt;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final RegistryKey<ItemGroup> MINECRALT_ITEM_GROUP_KEY =
            RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Minecralt.MOD_ID, "minecralt_item_group"));

    public static final ItemGroup MINECRALT_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.COCOON.asItem()))
                    .displayName(Text.translatable("itemGroup.minecralt"))
            .build();



    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, MINECRALT_ITEM_GROUP_KEY, MINECRALT_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(MINECRALT_ITEM_GROUP_KEY).register(itemGroup ->{
            itemGroup.add(ModBlocks.COCOON.asItem());
        });
    }

    /*
    public static Item register(Item item, RegistryKey<Item> registryKey){
        return Registry.register(Registries.ITEM, registryKey.getValue(), item);
    }

     */
}
