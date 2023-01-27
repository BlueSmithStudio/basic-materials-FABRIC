package bluesmith.basicmaterials.block;

import bluesmith.basicmaterials.BasicMaterials;
import bluesmith.basicmaterials.ItemGroups.ModItemGroups;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block RAW_DIAMOND_BLOCK = register("raw_diamond_block",
            new RawCrystalBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.DIAMOND_BLUE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block BUDDING_DIAMOND = register("budding_diamond",
            new BuddingDiamondBlock(FabricBlockSettings.of(Material.AMETHYST).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().dropsNothing()));
    public static final Block DIAMOND_CLUSTER = register("diamond_cluster",
            new CrystalClusterBlock(7, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 5;
            })));
    public static final Block LARGE_DIAMOND_BUD = register("large_diamond_bud",
            new CrystalClusterBlock(5, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 4;
            })));
    public static final Block MEDIUM_DIAMOND_BUD = register("medium_diamond_bud",
            new CrystalClusterBlock(4, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 2;
            })));
    public static final Block SMALL_DIAMOND_BUD = register("small_diamond_bud",
            new CrystalClusterBlock(3, 4, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 1;
            })));

    public static final Block RAW_ECHO_BLOCK = register("raw_echo_block",
            new RawCrystalBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.DIAMOND_BLUE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block BUDDING_ECHO= register("budding_echo",
            new BuddingEchoBlock(FabricBlockSettings.of(Material.AMETHYST).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().dropsNothing()));
    public static final Block ECHO_CLUSTER = register("echo_cluster",
            new CrystalClusterBlock(7, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 5;
            })));
    public static final Block LARGE_ECHO_BUD = register("large_echo_bud",
            new CrystalClusterBlock(5, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 4;
            })));
    public static final Block MEDIUM_ECHO_BUD = register("medium_echo_bud",
            new CrystalClusterBlock(4, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 2;
            })));
    public static final Block SMALL_ECHO_BUD = register("small_echo_bud",
            new CrystalClusterBlock(3, 4, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 1;
            })));

    public static final Block RAW_EMERALD_BLOCK = register("raw_emerald_block",
            new RawCrystalBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.DIAMOND_BLUE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block BUDDING_EMERALD= register("budding_emerald",
            new BuddingEmeraldBlock(FabricBlockSettings.of(Material.AMETHYST).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().dropsNothing()));
    public static final Block EMERALD_CLUSTER = register("emerald_cluster",
            new CrystalClusterBlock(7, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 5;
            })));
    public static final Block LARGE_EMERALD_BUD = register("large_emerald_bud",
            new CrystalClusterBlock(5, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 4;
            })));
    public static final Block MEDIUM_EMERALD_BUD = register("medium_emerald_bud",
            new CrystalClusterBlock(4, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 2;
            })));
    public static final Block SMALL_EMERALD_BUD = register("small_emerald_bud",
            new CrystalClusterBlock(3, 4, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 1;
            })));

    public static final Block RAW_LAPIS_BLOCK = register("raw_lapis_lazuli_block",
            new RawCrystalBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.DIAMOND_BLUE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block BUDDING_LAPIS= register("budding_lapis_lazuli",
            new BuddingLapisLazuliBlock(FabricBlockSettings.of(Material.AMETHYST).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().dropsNothing()));
    public static final Block LAPIS_CLUSTER = register("lapis_lazuli_cluster",
            new CrystalClusterBlock(7, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 5;
            })));
    public static final Block LARGE_LAPIS_BUD = register("large_lapis_lazuli_bud",
            new CrystalClusterBlock(5, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 4;
            })));
    public static final Block MEDIUM_LAPIS_BUD = register("medium_lapis_lazuli_bud",
            new CrystalClusterBlock(4, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 2;
            })));
    public static final Block SMALL_LAPIS_BUD = register("small_lapis_lazuli_bud",
            new CrystalClusterBlock(3, 4, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 1;
            })));

    public static final Block RAW_NETHERITE_BLOCK = register("raw_netherite_block",
            new RawCrystalBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.DIAMOND_BLUE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block BUDDING_NETHERITE= register("budding_netherite",
            new BuddingNetheriteBlock(FabricBlockSettings.of(Material.AMETHYST).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().dropsNothing()));
    public static final Block NETHERITE_CLUSTER = register("netherite_cluster",
            new CrystalClusterBlock(7, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 5;
            })));
    public static final Block LARGE_NETHERITE_BUD = register("large_netherite_bud",
            new CrystalClusterBlock(5, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 4;
            })));
    public static final Block MEDIUM_NETHERITE_BUD = register("medium_netherite_bud",
            new CrystalClusterBlock(4, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 2;
            })));
    public static final Block SMALL_NETHERITE_BUD = register("small_netherite_bud",
            new CrystalClusterBlock(3, 4, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 1;
            })));


    public static final Block RAW_QUARTZ_BLOCK = register("raw_quartz_block",
            new RawCrystalBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.DIAMOND_BLUE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block BUDDING_QUARTZ= register("budding_quartz",
            new BuddingQuartzBlock(FabricBlockSettings.of(Material.AMETHYST).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().dropsNothing()));
    public static final Block QUARTZ_CLUSTER = register("quartz_cluster",
            new CrystalClusterBlock(7, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 5;
            })));
    public static final Block LARGE_QUARTZ_BUD = register("large_quartz_bud",
            new CrystalClusterBlock(5, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 4;
            })));
    public static final Block MEDIUM_QUARTZ_BUD = register("medium_quartz_bud",
            new CrystalClusterBlock(4, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 2;
            })));
    public static final Block SMALL_QUARTZ_BUD = register("small_quartz_bud",
            new CrystalClusterBlock(3, 4, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 1;
            })));

    public static final Block RAW_REDSTONE_BLOCK = register("raw_redstone_block",
            new RawCrystalBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.DIAMOND_BLUE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block BUDDING_REDSTONE= register("budding_redstone",
            new BuddingRedstoneBlock(FabricBlockSettings.of(Material.AMETHYST).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().dropsNothing()));
    public static final Block REDSTONE_CLUSTER = register("redstone_cluster",
            new CrystalClusterBlock(7, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 5;
            })));
    public static final Block LARGE_REDSTONE_BUD = register("large_redstone_bud",
            new CrystalClusterBlock(5, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 4;
            })));
    public static final Block MEDIUM_REDSTONE_BUD = register("medium_redstone_bud",
            new CrystalClusterBlock(4, 3, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 2;
            })));
    public static final Block SMALL_REDSTONE_BUD = register("small_redstone_bud",
            new CrystalClusterBlock(3, 4, AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {
                return 1;
            })));

    private static Block register(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(BasicMaterials.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name,Block block){
        return Registry.register(Registries.ITEM,new Identifier(BasicMaterials.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        BasicMaterials.LOGGER.debug("Registering ModBlocks for: " + BasicMaterials.MOD_ID);
        renderLayer();
        addCreative();

    }

    public static void addCreative(){
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,Blocks.AMETHYST_BLOCK);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,Blocks.BUDDING_AMETHYST);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,Blocks.AMETHYST_CLUSTER);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,Blocks.LARGE_AMETHYST_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,Blocks.MEDIUM_AMETHYST_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,Blocks.SMALL_AMETHYST_BUD);

        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,RAW_DIAMOND_BLOCK);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,BUDDING_DIAMOND);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,DIAMOND_CLUSTER);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,LARGE_DIAMOND_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,MEDIUM_DIAMOND_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,SMALL_DIAMOND_BUD);

        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,RAW_ECHO_BLOCK);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,BUDDING_ECHO);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,ECHO_CLUSTER);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,LARGE_ECHO_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,MEDIUM_ECHO_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,SMALL_ECHO_BUD);

        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,RAW_EMERALD_BLOCK);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,BUDDING_EMERALD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,EMERALD_CLUSTER);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,LARGE_EMERALD_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,MEDIUM_EMERALD_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,SMALL_EMERALD_BUD);

        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,RAW_LAPIS_BLOCK);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,BUDDING_LAPIS);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,LAPIS_CLUSTER);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,LARGE_LAPIS_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,MEDIUM_LAPIS_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,SMALL_LAPIS_BUD);

        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,RAW_NETHERITE_BLOCK);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,BUDDING_NETHERITE);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,NETHERITE_CLUSTER);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,LARGE_NETHERITE_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,MEDIUM_NETHERITE_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,SMALL_NETHERITE_BUD);

        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,RAW_QUARTZ_BLOCK);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,BUDDING_QUARTZ);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,QUARTZ_CLUSTER);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,LARGE_QUARTZ_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,MEDIUM_QUARTZ_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,SMALL_QUARTZ_BUD);

        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,RAW_REDSTONE_BLOCK);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,BUDDING_REDSTONE);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,REDSTONE_CLUSTER);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,LARGE_REDSTONE_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,MEDIUM_REDSTONE_BUD);
        ModItemGroups.addToItemGroup(ModItemGroups.BASIC_MATERIALS_GEODES,SMALL_REDSTONE_BUD);
    }
    private static void renderLayer(){
        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_DIAMOND_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MEDIUM_DIAMOND_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(LARGE_DIAMOND_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(DIAMOND_CLUSTER, RenderLayer.getCutoutMipped());

        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_ECHO_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MEDIUM_ECHO_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(LARGE_ECHO_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ECHO_CLUSTER, RenderLayer.getCutoutMipped());

        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_EMERALD_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MEDIUM_EMERALD_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(LARGE_EMERALD_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(EMERALD_CLUSTER, RenderLayer.getCutoutMipped());

        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_LAPIS_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MEDIUM_LAPIS_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(LARGE_LAPIS_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(LAPIS_CLUSTER, RenderLayer.getCutoutMipped());

        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_NETHERITE_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MEDIUM_NETHERITE_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(LARGE_NETHERITE_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(NETHERITE_CLUSTER, RenderLayer.getCutoutMipped());

        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_QUARTZ_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MEDIUM_QUARTZ_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(LARGE_QUARTZ_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(QUARTZ_CLUSTER, RenderLayer.getCutoutMipped());

        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_REDSTONE_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MEDIUM_REDSTONE_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(LARGE_REDSTONE_BUD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(REDSTONE_CLUSTER, RenderLayer.getCutoutMipped());

    }

}
