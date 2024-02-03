package com.rutaji.rutaji_items.enchanment;

import com.rutaji.rutaji_items.RutajiItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, RutajiItems.MOD_ID);

    public static final RegistryObject<Enchantment> ILUMINATION = ENCHANTMENTS.register("ilumination",() -> new IluminationEnchanment
            (Enchantment.Rarity.UNCOMMON,EnchantmentCategory.ARMOR_HEAD, EquipmentSlot.HEAD));
    public static void register(IEventBus eventBus){
        ENCHANTMENTS.register(eventBus);
    }
}
