package net.nathan.testmod;

import net.fabricmc.api.ModInitializer;
import net.nathan.testmod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();

	}
}
