package io.github.noololly.minecralt;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks{
    public static void initialize(){}

    public static final RegistryKey<Block> COCOON_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(Minecralt.MOD_ID, "cocoon")
    );

    public static final Block COCOON = register(
            new Block(AbstractBlock.Settings.create().registryKey(COCOON_KEY)
                    .sounds(BlockSoundGroup.METAL)),
            COCOON_KEY
    );

    public static Block register(Block block, RegistryKey<Block> blockKey){
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());

        BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, blockItem);
        return Registry.register(Registries.BLOCK, blockKey, block);
    }
}
