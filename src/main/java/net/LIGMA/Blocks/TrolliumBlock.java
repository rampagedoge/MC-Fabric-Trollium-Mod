package net.LIGMA.Blocks;

import net.minecraft.block.Block;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class TrolliumBlock extends Block {

    public TrolliumBlock() {
        super(FabricBlockSettings.of(Material.METAL).breakByHand(false).strength(25f,1500f).breakByTool(FabricToolTags.PICKAXES, 5).build());
    }

}