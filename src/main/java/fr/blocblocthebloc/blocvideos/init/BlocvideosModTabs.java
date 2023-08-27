
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.blocvideos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import fr.blocblocthebloc.blocvideos.BlocvideosMod;

public class BlocvideosModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlocvideosMod.MODID);
	public static final RegistryObject<CreativeModeTab> BVU = REGISTRY.register("bvu",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.blocvideos.bvu")).icon(() -> new ItemStack(Blocks.BLACK_CANDLE_CAKE)).displayItems((parameters, tabData) -> {
				tabData.accept(BlocvideosModItems.THE_BLOC_PHONE.get());
			})

					.build());
}
