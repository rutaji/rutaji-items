package com.rutaji.rutaji_items.block;

import com.rutaji.rutaji_items.RutajiItems;
import com.rutaji.rutaji_items.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RutajiItems.MOD_ID);

    public static final RegistryObject<Block> AIR_LIGHT = BLOCKS.register("air_light",() -> new AirLight(BlockBehaviour.Properties.of().replaceable().noCollission().noLootTable().air()
            .randomTicks().lightLevel((x) -> {return 15;}).noLootTable().air()));
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name,RegistryObject<T> block){
        ModItems.ITEMS.register(name,()-> new BlockItem(block.get(),new Item.Properties()));
    }
    public static final RegistryObject<Block> BIG_SPONGE =registerBlock("big_sponge",() -> new BigSponge(BlockBehaviour.Properties.copy(Blocks.SPONGE)));




}
