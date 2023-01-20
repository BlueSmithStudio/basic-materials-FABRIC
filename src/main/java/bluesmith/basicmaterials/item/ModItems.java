package bluesmith.basicmaterials.item;

import bluesmith.basicmaterials.BasicMaterials;
import bluesmith.basicmaterials.ItemGroups.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {

    public static final Item AMETHYST_DUST = registerItem("amethyst_dust",
            new Item(new FabricItemSettings()));
    public static final Item AMETHYST_NUGGET = registerItem("amethyst_nugget",
            new Item(new FabricItemSettings()));
    public static final Item AMETHYST_INGOT = registerItem("amethyst_ingot",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,new Identifier(BasicMaterials.MOD_ID,name), item);
    }


    public static void registerModItems(){
        BasicMaterials.LOGGER.debug("Registering Mod Items for: " + BasicMaterials.MOD_ID);
    }

    public static void addCreative(){
        ModItemGroups.addAfterBasicMaterial(Items.AMETHYST_SHARD,AMETHYST_DUST);
        ModItemGroups.addAfterIngredients(Items.GUNPOWDER,AMETHYST_DUST);
        ModItemGroups.addAfterBasicMaterial(AMETHYST_DUST,AMETHYST_NUGGET);
        ModItemGroups.addAfterIngredients(Items.GOLD_NUGGET,AMETHYST_NUGGET);
        ModItemGroups.addAfterBasicMaterial(AMETHYST_NUGGET,AMETHYST_INGOT);
        ModItemGroups.addAfterIngredients(Items.GOLD_INGOT,AMETHYST_INGOT);
    }

}
