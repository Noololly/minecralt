package io.github.noololly.minecralt.entity;

import io.github.noololly.minecralt.Minecralt;
import io.github.noololly.minecralt.entity.custom.EndBugEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final RegistryKey<EntityType<?>> END_BUG_KEY =
            RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(Minecralt.MOD_ID, "end_bug"));


    public static final EntityType<EndBugEntity> END_BUG =
            Registry.register(Registries.ENTITY_TYPE,
                    Identifier.of(Minecralt.MOD_ID, "end_bug"),
                    EntityType.Builder.create(EndBugEntity::new, SpawnGroup.CREATURE)
                            .dimensions(0.25F,0.25F).build(END_BUG_KEY));

    public static void registerModEntities() {
        Minecralt.MINECRALT_LOGGER.info("Registering Mod Entities for " + Minecralt.MOD_ID);



    }

}
