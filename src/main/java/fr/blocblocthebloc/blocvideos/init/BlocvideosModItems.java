
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.blocvideos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import fr.blocblocthebloc.blocvideos.item.TheBlocPhoneItem;
import fr.blocblocthebloc.blocvideos.BlocvideosMod;

public class BlocvideosModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BlocvideosMod.MODID);
	public static final RegistryObject<Item> THE_BLOC_PHONE = REGISTRY.register("the_bloc_phone", () -> new TheBlocPhoneItem());
}
