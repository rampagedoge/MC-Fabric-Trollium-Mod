package net.LIGMA.Materials;

import net.LIGMA.ModInit;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TrolliumAxe implements ToolMaterial {

    @Override
    public int getDurability() {
        return 999999999;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 17f;
    }

    @Override
    public float getAttackDamage() {
        return 26.1f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
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
