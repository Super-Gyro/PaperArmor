package com.supergyro.paperarmor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockPaper extends Block {

    public BlockPaper() {
        super(Properties.create(Material.BAMBOO)
                .sound(SoundType.SAND)
                .hardnessAndResistance(2.0f)
        );
        setRegistryName("blockpaper");
    }
}
