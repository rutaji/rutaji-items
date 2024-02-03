package com.rutaji.rutaji_items.blockEntity;

import com.rutaji.rutaji_items.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class AirLightBlockEntity extends BlockEntity {
    public AirLightBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntity.AIR_LIGHT_BLOCK_ENTITY.get(), pPos, pBlockState);
    }
    private int live = 0;
    public static final int MAX_TIME_LIVE = 5;

    public void Refresh(){live = 0;}
    public static void tick(Level level, BlockPos pos, BlockState state, BlockEntity blockEntity) {
        if (blockEntity instanceof AirLightBlockEntity airLightBlockEntity)
        {
            if(airLightBlockEntity.live++  > MAX_TIME_LIVE && level.getBlockState(pos).getBlock() == ModBlocks.AIR_LIGHT.get())
            {
                level.setBlock(pos, Blocks.AIR.defaultBlockState(),3);
            }
        }
    }

}
