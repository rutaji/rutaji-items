package com.rutaji.rutaji_items.blockEntity;

import com.rutaji.rutaji_items.RutajiItems;
import com.rutaji.rutaji_items.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntity {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RutajiItems.MOD_ID);
    public static void register(IEventBus bus)
    {
        BLOCK_ENTITIES.register(bus);
    }

    public static final RegistryObject<BlockEntityType<?>> AIR_LIGHT_BLOCK_ENTITY = BLOCK_ENTITIES.register("air_light_block_entity", () -> BlockEntityType.Builder.of(AirLightBlockEntity::new, ModBlocks.AIR_LIGHT.get()).build(null));
}
