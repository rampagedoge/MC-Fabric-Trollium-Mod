package net.LIGMA;

import net.LIGMA.Bases.PickaxeBase;
import net.LIGMA.Bases.ShovelBase;
import net.LIGMA.Bases.AxeBase;
import net.LIGMA.Bases.HoeBase;
import net.LIGMA.Bases.SwordBase;
import net.LIGMA.Blocks.TrolliumBlock;
import net.LIGMA.Blocks.TrolliumOre;
import net.LIGMA.Materials.TrolliumAxe;
import net.LIGMA.Materials.TrolliumHoe;
import net.LIGMA.Materials.TrolliumPick;
import net.LIGMA.Materials.TrolliumShovel;
import net.LIGMA.Materials.TrolliumSword;
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
    public static final Item TROLLIUM_PICKAXE = new PickaxeBase(new TrolliumPick());
    public static final Item TROLLIUM_AXE = new AxeBase(new TrolliumAxe());
    public static final Item TROLLIUM_SWORD = new SwordBase(new TrolliumSword());
    public static final Item TROLLIUM_HOE = new HoeBase(new TrolliumHoe());
    public static final Item TROLLIUM_SHOVEL = new ShovelBase(new TrolliumShovel());
    public static final Item TROLLIUM_TOOL_PART = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item RAW_TROLLIUM = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Block TROLLIUM_ORE = new TrolliumOre();
    public static final BlockItem TROLLIUM_ORE_ITEM = new BlockItem(TROLLIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item TROLLIUM_NUGGET = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item TROLLIUM_ELECTRIC_PART = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item TROLLIUM_CYLINDER = new Item(new Item.Settings().group(ItemGroup.MISC));

    private void RegisterItem(Identifier identity, Item item) {
        Registry.register(Registry.ITEM, identity, item); //strupid rergister
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
        //Register Items
        RegisterItem(new Identifier(MODID, "trollium_ingot"), TROLLIUM_INGOT);
        RegisterItem(new Identifier(MODID, "trollium_tool_part"), TROLLIUM_TOOL_PART);
        RegisterItem(new Identifier(MODID, "trollium_pickaxe"), TROLLIUM_PICKAXE);
        RegisterItem(new Identifier(MODID, "trollium_axe"), TROLLIUM_AXE);
        RegisterItem(new Identifier(MODID, "trollium_sword"), TROLLIUM_SWORD);
        RegisterItem(new Identifier(MODID, "trollium_hoe"), TROLLIUM_HOE);
        RegisterItem(new Identifier(MODID, "trollium_shovel"), TROLLIUM_SHOVEL);
        RegisterItem(new Identifier(MODID, "raw_trollium"), RAW_TROLLIUM);
        RegisterItem(new Identifier(MODID, "trollium_nugget"), TROLLIUM_NUGGET);
        RegisterItem(new Identifier(MODID, "trollium_electric_part"), TROLLIUM_ELECTRIC_PART);
        RegisterItem(new Identifier(MODID, "trollium_cylinder"), TROLLIUM_CYLINDER);
        //Register Blocks
        //Register Blocks and Block Items
        RegisterBlockWithItem(new Identifier(MODID, "trollium_block"), TROLLIUM_BLOCK, new Identifier(MODID, "trollium_block"), TROLLIUM_BLOCK_ITEM);
        RegisterBlockWithItem(new Identifier(MODID, "trollium_ore"), TROLLIUM_ORE, new Identifier(MODID, "trollium_ore"), TROLLIUM_ORE_ITEM);
    }
}