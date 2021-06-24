package net.LIGMA.Materials;

import net.LIGMA.ModInit;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TrolliumHoe implements ToolMaterial {

    @Override
    public int getDurability() {
        return 999999999;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 21f;
    }

    @Override
    public float getAttackDamage() {
        return 18.1f;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModInit.TROLLIUM_INGOT);
    }
    
}
