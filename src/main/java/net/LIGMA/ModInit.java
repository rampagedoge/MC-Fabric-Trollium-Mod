package net.LIGMA;

import net.LIGMA.Bases.PickaxeBase;
import net.LIGMA.Blocks.TrolliumBlock;
import net.LIGMA.Materials.ToolMaterialTrollium;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.block.Block;

public class ModInit implements ModInitializer {

    public static final String MODID = "cock";

    public static final Item TROLLIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Block TROLLIUM_BLOCK = new TrolliumBlock();
    public static final BlockItem TROLLIUM_BLOCK_ITEM = new BlockItem(TROLLIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item TROLLIUM_PICKAXE = new PickaxeBase(new ToolMaterialTrollium());
    public static final Item TROLLIUM_TOOL_PART = new Item(new Item.Settings().group(ItemGroup.MISC));

    private void RegisterItem(Identifier identity, Item item) {
        Registry.register(Registry.ITEM, identity, item);
    }
    private void RegisterBlock(Identifier identity, Block block) {
        Registry.register(Registry.BLOCK, identity, block);
    }
    
    private void RegisterBlockWithItem(Identifier blockIdentity, Block block, Identifier itemIdentity, BlockItem blockItem) {
        RegisterBlock(blockIdentity, block);
        RegisterItem(itemIdentity, blockItem);
    }

    @Override
    public void onInitialize() {
        RegisterItem(new Identifier(MODID, "trollium_ingot"), TROLLIUM_INGOT);
        RegisterItem(new Identifier(MODID, "trollium_tool_part"), TROLLIUM_TOOL_PART);
        RegisterItem(new Identifier(MODID, "trollium_pickaxe"), TROLLIUM_PICKAXE);
        RegisterBlockWithItem(new Identifier(MODID, "trollium_block"), TROLLIUM_BLOCK, new Identifier(MODID, "trollium_block"), TROLLIUM_BLOCK_ITEM);
    }
}