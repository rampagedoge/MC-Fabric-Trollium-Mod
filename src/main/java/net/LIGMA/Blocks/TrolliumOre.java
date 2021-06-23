package net.LIGMA.Blocks;

import net.minecraft.block.Block;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class TrolliumOre extends Block {

    public TrolliumOre() {
        super(FabricBlockSettings.of(Material.METAL).breakByHand(false).strength(25f,1500f).breakByTool(FabricToolTags.PICKAXES, 4).build());
    }

}