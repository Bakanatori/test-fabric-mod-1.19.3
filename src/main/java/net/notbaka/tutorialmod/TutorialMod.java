package net.notbaka.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.notbaka.tutorialmod.item.ModItemGroup;
import net.notbaka.tutorialmod.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Very important comment
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		Moditems.registerModItems();

	}
}
