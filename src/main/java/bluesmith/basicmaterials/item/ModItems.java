package bluesmith.basicmaterials.item;

import bluesmith.basicmaterials.BasicMaterials;
import bluesmith.basicmaterials.ItemGroups.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {

    public static final Item AMETHYST_GEM = registerItem("amethyst_gem",
            new Item(new FabricItemSettings()));
    public static final Item AMETHYST_DUST = registerItem("amethyst_dust",
            new Item(new FabricItemSettings()));
    public static final Item AMETHYST_NUGGET = registerItem("amethyst_nugget",
            new Item(new FabricItemSettings()));
    public static final Item AMETHYST_INGOT = registerItem("amethyst_ingot",
            new Item(new FabricItemSettings()));
    public static final Item COAL_DUST = registerItem("coal_dust",
            new Item(new FabricItemSettings()));
    public static final Item COAL_NUGGET = registerItem("coal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item COAL_INGOT = registerItem("coal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item COPPER_DUST = registerItem("copper_dust",
            new Item(new FabricItemSettings()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings()));
    public static final Item COPPER_COIN = registerItem("copper_coin",
            new Item(new FabricItemSettings()));
    public static final Item DIAMOND_SHARD = registerItem("diamond_shard",
            new Item(new FabricItemSettings()));
    public static final Item DIAMOND_DUST = registerItem("diamond_dust",
            new Item(new FabricItemSettings()));
    public static final Item DIAMOND_NUGGET = registerItem("diamond_nugget",
            new Item(new FabricItemSettings()));
    public static final Item DIAMOND_INGOT= registerItem("diamond_ingot",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,new Identifier(BasicMaterials.MOD_ID,name), item);
    }


    public static void registerModItems(){
        BasicMaterials.LOGGER.debug("Registering Mod Items for: " + BasicMaterials.MOD_ID);
        registerFuels();
        addCreative();
    }

    public static void registerFuels(){
        FuelRegistry.INSTANCE.add(COAL_DUST, 20);
        FuelRegistry.INSTANCE.add(COAL_NUGGET, 180);
        FuelRegistry.INSTANCE.add(COAL_INGOT, 1620);
    }

    public static void addCreative(){

        ModItemGroups.addAfterBasicMaterial(AMETHYST_GEM,Items.AMETHYST_SHARD);
        ModItemGroups.addAfterBasicMaterial(Items.AMETHYST_SHARD,AMETHYST_DUST);
        ModItemGroups.addAfterBasicMaterial(AMETHYST_DUST,AMETHYST_NUGGET);
        ModItemGroups.addAfterBasicMaterial(AMETHYST_NUGGET,AMETHYST_INGOT);
        ModItemGroups.addAfterBasicMaterial(AMETHYST_INGOT,Items.COAL);
        ModItemGroups.addAfterBasicMaterial(Items.COAL,COAL_DUST);
        ModItemGroups.addAfterBasicMaterial(COAL_DUST,COAL_NUGGET);
        ModItemGroups.addAfterBasicMaterial(COAL_NUGGET,COAL_INGOT);
        ModItemGroups.addAfterBasicMaterial(COAL_INGOT,Items.RAW_COPPER);
        ModItemGroups.addAfterBasicMaterial(Items.RAW_COPPER,COPPER_DUST);
        ModItemGroups.addAfterBasicMaterial(COPPER_DUST,COPPER_NUGGET);
        ModItemGroups.addAfterBasicMaterial(COPPER_NUGGET,Items.COPPER_INGOT);
        ModItemGroups.addAfterBasicMaterial(Items.COPPER_INGOT,COPPER_COIN);
        ModItemGroups.addAfterBasicMaterial(COPPER_COIN,Items.DIAMOND);
        ModItemGroups.addAfterBasicMaterial(Items.DIAMOND,DIAMOND_SHARD);
        ModItemGroups.addAfterBasicMaterial(DIAMOND_SHARD,DIAMOND_DUST);
        ModItemGroups.addAfterBasicMaterial(DIAMOND_DUST,DIAMOND_NUGGET);
        ModItemGroups.addAfterBasicMaterial(DIAMOND_NUGGET,DIAMOND_INGOT);

        ModItemGroups.addAfterIngredients(Items.DIAMOND,AMETHYST_GEM);
        ModItemGroups.addAfterIngredients(Items.GUNPOWDER,AMETHYST_DUST);
        ModItemGroups.addAfterIngredients(Items.GOLD_NUGGET,AMETHYST_NUGGET);
        ModItemGroups.addAfterIngredients(Items.GOLD_INGOT,AMETHYST_INGOT);
        ModItemGroups.addAfterIngredients(AMETHYST_DUST,COAL_DUST);
        ModItemGroups.addAfterIngredients(AMETHYST_NUGGET,COAL_NUGGET);
        ModItemGroups.addAfterIngredients(AMETHYST_INGOT,COAL_INGOT);
        ModItemGroups.addAfterIngredients(COAL_DUST,COPPER_DUST);
        ModItemGroups.addAfterIngredients(COAL_NUGGET,COPPER_NUGGET);
        ModItemGroups.addAfterIngredients(Items.AMETHYST_SHARD,DIAMOND_SHARD);
        ModItemGroups.addAfterIngredients(COPPER_DUST,DIAMOND_DUST);
        ModItemGroups.addAfterIngredients(COPPER_NUGGET,DIAMOND_NUGGET);
        ModItemGroups.addAfterIngredients(COAL_INGOT,DIAMOND_INGOT);

    }

}
