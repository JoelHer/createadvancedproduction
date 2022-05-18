package de.herbst.createadvancedproduction.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup CAP_GROUP = new ItemGroup("Create Advanced Production") {
        @Override
        public ItemStack createIcon() {
        return new ItemStack(ModItems.OIL_BUCKET.get());
        }
    };
}
