package bluesmith.basicmaterials;

import bluesmith.basicmaterials.ItemGroups.ModItemGroups;
import bluesmith.basicmaterials.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicMaterials implements ModInitializer {
	public static final String MOD_ID = "basicmaterials";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.addBasicMaterial();

		ModItems.registerModItems();
		ModItems.addCreative();

		LOGGER.info("Hello Fabric world!");
	}
}