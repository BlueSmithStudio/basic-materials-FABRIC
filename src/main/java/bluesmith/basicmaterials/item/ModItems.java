package bluesmith.basicmaterials.item;

import bluesmith.basicmaterials.BasicMaterials;
import bluesmith.basicmaterials.ItemGroups.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
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
    public static final Item ECHO_GEM = registerItem("echo_gem",
            new Item(new FabricItemSettings()));
    public static final Item ECHO_DUST = registerItem("echo_dust",
            new Item(new FabricItemSettings()));
    public static final Item ECHO_NUGGET = registerItem("echo_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ECHO_INGOT= registerItem("echo_ingot",
            new Item(new FabricItemSettings()));
    public static final Item EMERALD_DUST= registerItem("emerald_dust",
            new Item(new FabricItemSettings()));
    public static final Item EMERALD_INGOT = registerItem("emerald_ingot",
            new Item(new FabricItemSettings()));
    public static final Item EMERALD_NUGGET = registerItem("emerald_nugget",
            new Item(new FabricItemSettings()));
    public static final Item EMERALD_SHARD= registerItem("emerald_shard",
            new Item(new FabricItemSettings()));
    public static final Item GOLD_COIN= registerItem("gold_coin",
            new Item(new FabricItemSettings()));
    public static final Item GOLD_DUST = registerItem("gold_dust",
            new Item(new FabricItemSettings()));
    public static final Item IRON_COIN = registerItem("iron_coin",
            new Item(new FabricItemSettings()));
    public static final Item IRON_DUST= registerItem("iron_dust",
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
        FuelRegistry.INSTANCE.add(COAL_DUST, 50);
        FuelRegistry.INSTANCE.add(COAL_NUGGET, 200);
        FuelRegistry.INSTANCE.add(COAL_INGOT, 3200);
    }

    public static void addCreative(){

        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,AMETHYST_GEM);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.AMETHYST_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,AMETHYST_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,AMETHYST_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,AMETHYST_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,AMETHYST_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.COAL);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,COAL_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,COAL_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,COAL_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.RAW_COPPER);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,COPPER_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,COPPER_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.COPPER_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,COPPER_COIN);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.DIAMOND);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,DIAMOND_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,DIAMOND_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,DIAMOND_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,DIAMOND_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,ECHO_GEM);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.ECHO_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,ECHO_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,ECHO_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,ECHO_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.EMERALD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,EMERALD_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,EMERALD_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,EMERALD_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,EMERALD_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.RAW_GOLD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,GOLD_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.GOLD_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.GOLD_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,GOLD_COIN);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.RAW_IRON);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,IRON_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.IRON_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,Items.IRON_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,IRON_COIN);


        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,Items.DIAMOND,AMETHYST_GEM);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,AMETHYST_GEM,ECHO_GEM);

        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,Items.GUNPOWDER,AMETHYST_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,AMETHYST_DUST,COAL_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,COAL_DUST,COPPER_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,COPPER_DUST,DIAMOND_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,DIAMOND_DUST,ECHO_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,ECHO_DUST,EMERALD_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,EMERALD_DUST,GOLD_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,GOLD_DUST,IRON_DUST);

        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,Items.GOLD_NUGGET,AMETHYST_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,AMETHYST_NUGGET,COAL_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,COAL_NUGGET,COPPER_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,COPPER_NUGGET,DIAMOND_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,DIAMOND_NUGGET,ECHO_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,ECHO_NUGGET,EMERALD_NUGGET);

        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,Items.GOLD_INGOT,AMETHYST_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,AMETHYST_INGOT,COAL_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,COAL_INGOT,DIAMOND_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,DIAMOND_INGOT,ECHO_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,ECHO_INGOT,EMERALD_INGOT);

        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,Items.AMETHYST_SHARD,DIAMOND_SHARD);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,DIAMOND_SHARD,EMERALD_SHARD);
    }

}
