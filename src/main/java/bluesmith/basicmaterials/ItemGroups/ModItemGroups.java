package bluesmith.basicmaterials.ItemGroups;


import bluesmith.basicmaterials.BasicMaterials;
import bluesmith.basicmaterials.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup BASIC_MATERIALS = FabricItemGroup.builder(new Identifier(BasicMaterials.MOD_ID, "basic_materials"))
            .icon(() -> new ItemStack(ModItems.AMETHYST_GEM))
            .build();

    public static void registerModItemGroups() {
        BasicMaterials.LOGGER.debug("Registering Mod ItemGroups for: " + BasicMaterials.MOD_ID);
    }

    public static void addToItemGroup(ItemGroup itemGroup, Item item) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.add(item);
        });
    }

    public static void addToItemGroup(ItemGroup itemGroup, Block block) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.add(block);
        });
    }

    public static void addAfterInItemGroup(ItemGroup itemGroup, Item addAfter, Item item) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.addAfter(addAfter, item);
        });
    }

    public static void addAfterInItemGroup(ItemGroup itemGroup, Block addAfter, Item item) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.addAfter(addAfter, item);
        });
    }

    public static void addAfterInItemGroup(ItemGroup itemGroup, Item addAfter, Block block) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.addAfter(addAfter, block);
        });
    }
    public static void addAfterInItemGroup(ItemGroup itemGroup, Block addAfter, Block block) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.addAfter(addAfter, block);
        });
    }
}

