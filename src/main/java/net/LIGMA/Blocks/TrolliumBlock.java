package net.LIGMA.Blocks;

import net.minecraft.block.Block;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.LIGMA.ModInit;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class TrolliumBlock extends Block {

    public TrolliumBlock() {
        super(FabricBlockSettings.of(Material.METAL).breakByHand(false).strength(25f,1500f).breakByTool(FabricToolTags.PICKAXES, 4).build());
    }

}