
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.blocvideos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import fr.blocblocthebloc.blocvideos.block.EcranSecondaireBlock;
import fr.blocblocthebloc.blocvideos.block.EcranPrincipalBlock;
import fr.blocblocthebloc.blocvideos.block.EcranJeuxBlock;
import fr.blocblocthebloc.blocvideos.block.BlocBlock;
import fr.blocblocthebloc.blocvideos.BlocvideosMod;

public class BlocvideosModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocvideosMod.MODID);
	public static final RegistryObject<Block> ECRAN_PRINCIPAL = REGISTRY.register("ecran_principal", () -> new EcranPrincipalBlock());
	public static final RegistryObject<Block> ECRAN_SECONDAIRE = REGISTRY.register("ecran_secondaire", () -> new EcranSecondaireBlock());
	public static final RegistryObject<Block> ECRAN_JEUX = REGISTRY.register("ecran_jeux", () -> new EcranJeuxBlock());
	public static final RegistryObject<Block> BLOC = REGISTRY.register("bloc", () -> new BlocBlock());
}
