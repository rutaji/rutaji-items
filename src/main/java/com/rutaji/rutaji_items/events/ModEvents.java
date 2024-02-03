package com.rutaji.rutaji_items.events;

import com.rutaji.rutaji_items.RutajiItems;
import com.rutaji.rutaji_items.block.ModBlocks;
import com.rutaji.rutaji_items.blockEntity.AirLightBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import com.rutaji.rutaji_items.enchanment.ModEnchantments;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RutajiItems.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void IlluminationEvent(LivingEvent.LivingTickEvent event)
    {
        if (event.getEntity() instanceof Player player)
        {

            ItemStack helmet = player.getInventory().armor.get(3);
            if(helmet != ItemStack.EMPTY && helmet.getEnchantmentLevel(ModEnchantments.ILUMINATION.get()) > 0){
                Level level = player.level();
                BlockPos pos = player.blockPosition().above();
                BlockPos posForward = pos.relative(player.getDirection());
                Block block = level.getBlockState(pos).getBlock();
                Block blockForward = level.getBlockState(posForward).getBlock();

                if (blockForward == ModBlocks.AIR_LIGHT.get())
                {
                    if (level.getBlockEntity(posForward) instanceof AirLightBlockEntity airLightBlockEntity)
                    {
                        airLightBlockEntity.Refresh();
                    }
                    return;
                }
                if (block == ModBlocks.AIR_LIGHT.get())
                {
                   if (level.getBlockEntity(pos) instanceof AirLightBlockEntity airLightBlockEntity)
                   {
                       airLightBlockEntity.Refresh();
                   }
                   return;
                }
                if (blockForward == Blocks.AIR)
                {
                    level.setBlock(posForward, ModBlocks.AIR_LIGHT.get().defaultBlockState(), 3);
                    return;
                }
                if (block == Blocks.AIR)
                {
                    level.setBlock(pos, ModBlocks.AIR_LIGHT.get().defaultBlockState(), 3);
                    return;
                }





            }
        }

    }
}
