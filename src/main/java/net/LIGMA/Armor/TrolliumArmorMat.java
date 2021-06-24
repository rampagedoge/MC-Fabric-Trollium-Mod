package net.LIGMA.Armor;

import net.LIGMA.ModInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class TrolliumArmorMat implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {999999999, 999999999, 999999999, 999999999};
    private static final int[] PROTECTION_AMOUNTS = new int[] {7, 12, 11, 6};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_AMOUNTS[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 999999999;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_END_PORTAL_SPAWN;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModInit.TROLLIUM_INGOT);
    }

    @Override
    public String getName() {
        return "trollium";
    }

    @Override
    public float getToughness() {
        return 999999999;
    }

    @Override
    public float getKnockbackResistance() {
        return 999999999;
    }
    
}
