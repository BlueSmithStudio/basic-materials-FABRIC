package bluesmith.basicmaterials.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class BuddingQuartzBlock extends RawCrystalBlock {
    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingQuartzBlock(Settings settings) {
        super(settings);
    }

    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.DESTROY;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);
            Block block = null;
            if (canGrowIn(blockState)) {
                block = ModBlocks.SMALL_QUARTZ_BUD;
            } else if (blockState.isOf(ModBlocks.SMALL_QUARTZ_BUD) && blockState.get(CrystalClusterBlock.FACING) == direction) {
                block = ModBlocks.MEDIUM_QUARTZ_BUD;
            } else if (blockState.isOf(ModBlocks.MEDIUM_QUARTZ_BUD) && blockState.get(CrystalClusterBlock.FACING) == direction) {
                block = ModBlocks.LARGE_QUARTZ_BUD;
            } else if (blockState.isOf(ModBlocks.LARGE_QUARTZ_BUD) && blockState.get(CrystalClusterBlock.FACING) == direction) {
                block = ModBlocks.QUARTZ_CLUSTER;
            }

            if (block != null) {
                BlockState blockState2 = (BlockState)((BlockState)block.getDefaultState().with(CrystalClusterBlock.FACING, direction)).with(CrystalClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
                world.setBlockState(blockPos, blockState2);
            }

        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }
}
