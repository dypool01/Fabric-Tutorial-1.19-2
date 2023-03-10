package net.dypool01.tutorialmod;

import net.dypool01.tutorialmod.block.ModBlocks;
import net.dypool01.tutorialmod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;
import net.dypool01.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();
	}
}
