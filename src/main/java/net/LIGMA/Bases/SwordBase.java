package net.LIGMA.Bases;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial material) {
        super(material, -1, -0.7f, new Item.Settings().group(ItemGroup.COMBAT));
    }
    
}
