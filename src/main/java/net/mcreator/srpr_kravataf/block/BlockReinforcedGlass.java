
package net.mcreator.srpr_kravataf.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.BlockRenderLayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.srpr_kravataf.creativetab.TabSRPR;
import net.mcreator.srpr_kravataf.ElementsScapeandRunReinforced;

@ElementsScapeandRunReinforced.ModElement.Tag
public class BlockReinforcedGlass extends ElementsScapeandRunReinforced.ModElement {
	@GameRegistry.ObjectHolder("srpr_kravataf:reinforcedglass")
	public static final Block block = null;
	public BlockReinforcedGlass(ElementsScapeandRunReinforced instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("reinforcedglass"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("srpr_kravataf:reinforcedglass", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.GLASS);
			setUnlocalizedName("reinforcedglass");
			setSoundType(SoundType.GLASS);
			setHardness(100F);
			setResistance(1000F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabSRPR.tab);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getBlockLayer() {
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}
	}
}
