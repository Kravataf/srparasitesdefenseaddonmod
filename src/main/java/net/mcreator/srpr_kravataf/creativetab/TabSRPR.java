
package net.mcreator.srpr_kravataf.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.srpr_kravataf.ElementsScapeandRunReinforced;

@ElementsScapeandRunReinforced.ModElement.Tag
public class TabSRPR extends ElementsScapeandRunReinforced.ModElement {
	public TabSRPR(ElementsScapeandRunReinforced instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabsrpr") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.CHAINMAIL_HELMET, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
