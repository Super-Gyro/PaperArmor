package com.supergyro.paperarmor.blocks;

import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import static com.supergyro.paperarmor.blocks.ModBlocks.FIRSTBLOCK_TILE;

public class FirstBlockTile extends TileEntity implements ITickableTileEntity {

    public FirstBlockTile() {
            super(FIRSTBLOCK_TILE);
    }

    @Override
    public void tick() {
        if (world.isRemote) {
            System.out.println("FirstBlockTile.tick");
        }
    }


}
