package io.github.noololly.minecralt;

import net.fabricmc.api.ModInitializer;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Minecralt implements ModInitializer {
	public static final String MOD_ID = "minecralt";

	public static final Logger MINECRALT_LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MINECRALT_LOGGER.info("Hello! Starting Minecralt!");
		ModBlocks.initialize();
		ModItems.initialize();
	}
}