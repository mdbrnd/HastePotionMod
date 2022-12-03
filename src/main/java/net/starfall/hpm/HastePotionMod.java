package net.starfall.hpm;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HastePotionMod implements ModInitializer {
	public static final String MOD_ID = "hpm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Haste Potion Mod");
	}
}
