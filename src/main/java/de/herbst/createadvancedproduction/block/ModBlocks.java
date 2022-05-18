package de.herbst.createadvancedproduction.block;

import de.herbst.createadvancedproduction.Createadvancedproduction;
import net.minecraft.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Createadvancedproduction.MODID);

    private static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
