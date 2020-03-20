package com.supergyro.paperarmor.items;

import com.supergyro.paperarmor.PaperArmor;
import net.minecraft.item.Item;

public class FirstItem extends Item {

    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(PaperArmor.setup.itemGroup));
        setRegistryName("firstitem");
    }
}
