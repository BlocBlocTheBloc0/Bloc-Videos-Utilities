
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.blocvideos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import fr.blocblocthebloc.blocvideos.BlocvideosMod;

public class BlocvideosModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlocvideosMod.MODID);
	public static final RegistryObject<CreativeModeTab> BVU = REGISTRY.register("bvu",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.blocvideos.bvu")).icon(() -> new ItemStack(BlocvideosModItems.THE_BLOC_PHONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BlocvideosModItems.THE_BLOC_PHONE.get());
				tabData.accept(BlocvideosModBlocks.ECRAN_PRINCIPAL.get().asItem());
				tabData.accept(BlocvideosModBlocks.ECRAN_SECONDAIRE.get().asItem());
				tabData.accept(BlocvideosModBlocks.ECRAN_JEUX.get().asItem());
				tabData.accept(BlocvideosModBlocks.BLOC.get().asItem());
			})

					.build());
}
