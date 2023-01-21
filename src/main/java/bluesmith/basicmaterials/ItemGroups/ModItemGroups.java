package bluesmith.basicmaterials.ItemGroups;


import bluesmith.basicmaterials.BasicMaterials;
import bluesmith.basicmaterials.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    private static final ItemGroup BASIC_MATERIALS = FabricItemGroup.builder(new Identifier(BasicMaterials.MOD_ID, "basic_materials"))
            .icon(() -> new ItemStack(ModItems.AMETHYST_GEM))
            .build();

    public static void registerModItemGroups(){
        BasicMaterials.LOGGER.debug("Registering Mod ItemGroups for: " + BasicMaterials.MOD_ID);
        addBasicMaterial();
    }

    public static void addBasicMaterial(){
        ItemGroupEvents.modifyEntriesEvent(BASIC_MATERIALS).register(content -> {
            content.add(ModItems.AMETHYST_GEM);
        });
    }

    public static void addAfterBuildingBlocks(Item addAfter, Item item){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(addAfter, item);
        });
    }

    public static void addAfterColoredBlocks(Item addAfter, Item item){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {
            content.addAfter(addAfter, item);
        });
    }

    public static void addAfterNatural(Item addAfter, Item item){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(addAfter, item);
        });
    }

    public static void addAfterIngredients(Item addAfter, Item item){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(addAfter, item);
        });
    }

    public static void addAfterCombat(Item addAfter, Item item){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.addAfter(addAfter, item);
        });
    }

    public static void addAfterFoodAndDrink(Item addAfter, Item item){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.addAfter(addAfter, item);
        });
    }

    public static void addAfterFunctional(Item addAfter, Item item){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(addAfter, item);
        });
    }

    public static void addAfterRedstone(Item addAfter, Item item){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(content -> {
            content.addAfter(addAfter, item);
        });
    }



    public static void addAfterBasicMaterial(Item addAfter, Item item){
        ItemGroupEvents.modifyEntriesEvent(BASIC_MATERIALS).register(content -> {
            content.addAfter(addAfter,item);
        });
    }
}
