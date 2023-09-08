
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.blocvideos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import fr.blocblocthebloc.blocvideos.item.TheBlocPhoneItem;
import fr.blocblocthebloc.blocvideos.BlocvideosMod;

public class BlocvideosModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BlocvideosMod.MODID);
	public static final RegistryObject<Item> THE_BLOC_PHONE = REGISTRY.register("the_bloc_phone", () -> new TheBlocPhoneItem());
	public static final RegistryObject<Item> ECRAN_PRINCIPAL = block(BlocvideosModBlocks.ECRAN_PRINCIPAL);
	public static final RegistryObject<Item> ECRAN_SECONDAIRE = block(BlocvideosModBlocks.ECRAN_SECONDAIRE);
	public static final RegistryObject<Item> ECRAN_JEUX = block(BlocvideosModBlocks.ECRAN_JEUX);
	public static final RegistryObject<Item> BLOC = block(BlocvideosModBlocks.BLOC);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
