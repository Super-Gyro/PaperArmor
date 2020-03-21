package com.supergyro.paperarmor.blocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {
    @ObjectHolder("paperarmor:firstblock")
    public static FirstBlock FIRSTBLOCK;

    @ObjectHolder("paperarmor:firstblock")
    public static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;
}
