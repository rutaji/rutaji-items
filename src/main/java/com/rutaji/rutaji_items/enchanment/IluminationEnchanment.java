package com.rutaji.rutaji_items.enchanment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class IluminationEnchanment extends Enchantment {
    public IluminationEnchanment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(Enchantment.Rarity.UNCOMMON,EnchantmentCategory.ARMOR_HEAD, pApplicableSlots);
    }
    @Override
    public int getMinCost(int pEnchantmentLevel) {
        return 7;
    }
    @Override
    public int getMaxCost(int pEnchantmentLevel) {
        return 35;
    }
    @Override
    public int getMaxLevel() {
        return 1;
    }
    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return stack.getItem() instanceof ArmorItem armoritem && armoritem.getEquipmentSlot() == EquipmentSlot.HEAD;
    }


}
