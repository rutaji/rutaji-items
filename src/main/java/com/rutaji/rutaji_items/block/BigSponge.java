package com.rutaji.rutaji_items.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BigSponge extends Block {
    public BigSponge(Properties pProperties) {
        super(pProperties);
    }
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        if (!pOldState.is(pState.getBlock())) {
            //this.tryAbsorbWater(pLevel, pPos);


        }
    }
    public boolean TryPlace2x2(Level pLevel, BlockPos pPos)
    {
        int maxY =  pLevel.getBlockState(pPos.above()).canBeReplaced() ? pPos.getY() + 1 :  pPos.getY();
        int minY =  pLevel.getBlockState(pPos.below()).canBeReplaced() ? pPos.getY() - 1 :  pPos.getY();

        int maxZ =  pLevel.getBlockState(pPos.north()).canBeReplaced() ? pPos.getZ() + 1 :  pPos.getZ();
        int minZ =  pLevel.getBlockState(pPos.south()).canBeReplaced() ? pPos.getZ() - 1 :  pPos.getZ();

        int maxX =  pLevel.getBlockState(pPos.east()).canBeReplaced() ? pPos.getX() + 1 :  pPos.getX();
        int minX =  pLevel.getBlockState(pPos.west()).canBeReplaced() ? pPos.getX() - 1 :  pPos.getX();

        if (maxY == minY || maxX == minX || maxZ == minZ){return false;}

        for(;minY <= maxX;minY++)
        {
            for(;minZ < maxZ;minZ++)
            {
                for(;minX < maxX;minX++)
                {

                }
            }
        }
    }
    public boolean Place2x2(Level pLevel,BlockPos pPos, BlockPos mainpPos)
    {
        for()
    }
}
