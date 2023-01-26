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
    public static final Item EMERALD_SHARD = registerItem("emerald_shard",
            new Item(new FabricItemSettings()));
    public static final Item GOLD_COIN = registerItem("gold_coin",
            new Item(new FabricItemSettings()));
    public static final Item GOLD_DUST = registerItem("gold_dust",
            new Item(new FabricItemSettings()));
    public static final Item IRON_COIN = registerItem("iron_coin",
            new Item(new FabricItemSettings()));
    public static final Item IRON_DUST= registerItem("iron_dust",
            new Item(new FabricItemSettings()));
    public static final Item LAPIS_LAZULI_DUST= registerItem("lapis_lazuli_dust",
            new Item(new FabricItemSettings()));
    public static final Item LAPIS_LAZULI_GEM= registerItem("lapis_lazuli_gem",
            new Item(new FabricItemSettings()));
    public static final Item LAPIS_LAZULI_INGOT = registerItem("lapis_lazuli_ingot",
            new Item(new FabricItemSettings()));
    public static final Item LAPIS_LAZULI_NUGGET = registerItem("lapis_lazuli_nugget",
            new Item(new FabricItemSettings()));
    public static final Item LAPIS_LAZULI_SHARD= registerItem("lapis_lazuli_shard",
            new Item(new FabricItemSettings()));
    public static final Item NETHERITE_DUST = registerItem("netherite_dust",
            new Item(new FabricItemSettings()));
    public static final Item NETHERITE_GEM = registerItem("netherite_gem",
            new Item(new FabricItemSettings()));
    public static final Item NETHERITE_NUGGET= registerItem("netherite_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NETHERITE_SHARD= registerItem("netherite_shard",
            new Item(new FabricItemSettings()));
    public static final Item QUAURTZ_DUST= registerItem("quartz_dust",
            new Item(new FabricItemSettings()));
    public static final Item QUAURTZ_GEM = registerItem("quartz_gem",
            new Item(new FabricItemSettings()));
    public static final Item QUAURTZ_INGOT = registerItem("quartz_ingot",
            new Item(new FabricItemSettings()));
    public static final Item QUAURTZ_NUGGET= registerItem("quartz_nugget",
            new Item(new FabricItemSettings()));
    public static final Item QUAURTZ_SHARD= registerItem("quartz_shard",
            new Item(new FabricItemSettings()));
    public static final Item RAW_IRON_DUST = registerItem("raw_iron_dust",
            new Item(new FabricItemSettings()));
    public static final Item RAW_IRON_INGOT= registerItem("raw_iron_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAW_IRON_NUGGET= registerItem("raw_iron_nugget",
            new Item(new FabricItemSettings()));
    public static final Item REDSTONE_INGOT = registerItem("redstone_ingot",
            new Item(new FabricItemSettings()));
    public static final Item REDSTONE_NUGGET= registerItem("redstone_nugget",
            new Item(new FabricItemSettings()));
    public static final Item REDSTONE_SHARD= registerItem("redstone_shard",
            new Item(new FabricItemSettings()));
    public static final Item REDSTONE_GEM= registerItem("redstone_gem",
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

        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,AMETHYST_GEM);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.AMETHYST_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,AMETHYST_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,AMETHYST_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,AMETHYST_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,AMETHYST_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.COAL);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,COAL_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,COAL_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,COAL_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.RAW_COPPER);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,COPPER_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,COPPER_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.COPPER_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,COPPER_COIN);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.DIAMOND);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,DIAMOND_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,DIAMOND_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,DIAMOND_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,DIAMOND_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,ECHO_GEM);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.ECHO_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,ECHO_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,ECHO_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,ECHO_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.EMERALD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,EMERALD_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,EMERALD_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,EMERALD_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,EMERALD_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.RAW_GOLD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,GOLD_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.GOLD_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.GOLD_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,GOLD_COIN);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.RAW_IRON);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,RAW_IRON_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,IRON_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,RAW_IRON_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.IRON_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,RAW_IRON_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.IRON_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,IRON_COIN);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.LAPIS_LAZULI);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,LAPIS_LAZULI_GEM);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,LAPIS_LAZULI_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,LAPIS_LAZULI_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,LAPIS_LAZULI_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,LAPIS_LAZULI_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.NETHERITE_SCRAP);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,NETHERITE_GEM);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,NETHERITE_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,NETHERITE_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,NETHERITE_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.NETHERITE_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.QUARTZ);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,QUAURTZ_GEM);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,QUAURTZ_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,QUAURTZ_DUST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,QUAURTZ_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,QUAURTZ_INGOT);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,REDSTONE_GEM);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,REDSTONE_SHARD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,Items.REDSTONE);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,REDSTONE_NUGGET);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_ITEMS,REDSTONE_INGOT);

        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,Items.DIAMOND,AMETHYST_GEM);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,AMETHYST_GEM,ECHO_GEM);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,ECHO_GEM,LAPIS_LAZULI_GEM);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,LAPIS_LAZULI_GEM,NETHERITE_GEM);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,NETHERITE_GEM,QUAURTZ_GEM);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,QUAURTZ_GEM,REDSTONE_GEM);

        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,Items.GUNPOWDER,AMETHYST_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,AMETHYST_DUST,COAL_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,COAL_DUST,COPPER_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,COPPER_DUST,DIAMOND_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,DIAMOND_DUST,ECHO_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,ECHO_DUST,EMERALD_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,EMERALD_DUST,GOLD_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,GOLD_DUST,RAW_IRON_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,RAW_IRON_DUST,IRON_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,IRON_DUST,LAPIS_LAZULI_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,LAPIS_LAZULI_DUST,NETHERITE_DUST);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,NETHERITE_DUST,QUAURTZ_DUST);

        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,Items.GOLD_NUGGET,AMETHYST_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,AMETHYST_NUGGET,COAL_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,COAL_NUGGET,COPPER_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,COPPER_NUGGET,DIAMOND_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,DIAMOND_NUGGET,ECHO_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,ECHO_NUGGET,EMERALD_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,EMERALD_NUGGET,LAPIS_LAZULI_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,LAPIS_LAZULI_NUGGET,NETHERITE_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,NETHERITE_NUGGET,QUAURTZ_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,QUAURTZ_NUGGET,RAW_IRON_NUGGET);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,RAW_IRON_NUGGET,REDSTONE_NUGGET);

        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,Items.GOLD_INGOT,AMETHYST_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,AMETHYST_INGOT,COAL_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,COAL_INGOT,DIAMOND_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,DIAMOND_INGOT,ECHO_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,ECHO_INGOT,EMERALD_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,EMERALD_INGOT,LAPIS_LAZULI_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,LAPIS_LAZULI_INGOT,QUAURTZ_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,QUAURTZ_INGOT,RAW_IRON_INGOT);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,RAW_IRON_INGOT,REDSTONE_INGOT);

        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,Items.AMETHYST_SHARD,DIAMOND_SHARD);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,DIAMOND_SHARD,EMERALD_SHARD);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,EMERALD_SHARD,LAPIS_LAZULI_SHARD);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,LAPIS_LAZULI_SHARD,NETHERITE_SHARD);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,NETHERITE_SHARD,QUAURTZ_SHARD);
        ModItemGroups.addAfterInItemGroup(ItemGroups.INGREDIENTS,QUAURTZ_SHARD,REDSTONE_SHARD);
    }

}
