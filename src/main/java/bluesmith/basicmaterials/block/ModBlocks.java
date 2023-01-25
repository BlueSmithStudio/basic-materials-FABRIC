package bluesmith.basicmaterials.block;

import bluesmith.basicmaterials.BasicMaterials;
import bluesmith.basicmaterials.ItemGroups.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RAW_DIAMOND_BLOCK = registerBlock("raw_diamond_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f).hardness(1.5f)));
    public static final Block BUDDING_DIAMOND = registerBlock("budding_diamond",
            new Block(FabricBlockSettings.of(Material.AMETHYST).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f).hardness(1.5f).ticksRandomly()));

    private static Block registerBlock(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(BasicMaterials.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name,Block block){
        return Registry.register(Registries.ITEM,new Identifier(BasicMaterials.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        BasicMaterials.LOGGER.debug("Registering ModBlocks for: " + BasicMaterials.MOD_ID);
        addCreative();

    }

    public static void addCreative(){
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,RAW_DIAMOND_BLOCK);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS,BUDDING_DIAMOND);
    }
}
