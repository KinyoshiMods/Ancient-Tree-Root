package net.minecraft.src;
import java.util.Random;

public class BlockAncientTreeRoot extends Block
{
public BlockAncientTreeRoot(int par1)
{
         super(par1, Material.wood);
         this.setCreativeTab(CreativeTabs.tabBlock);
}
    
public int idDropped(int par1, Random par2Random, int par3)
{
	
         return mod_AncientTreeRoot.ItemAncientTreeRoot.itemID;
}
    public int quantityDropped(Random r)
    {
                return 1 + r.nextInt(3);
    }
    
    /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
 //   public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
 //   {
 //       if (!par1World.isRemote && par2EntityPlayer.getCurrentEquippedItem() != null && par2EntityPlayer.getCurrentEquippedItem().itemID == Item.shears.itemID)
 //       {
 //           par2EntityPlayer.addStat(StatList.mineBlockStatArray[this.blockID], 1);
 //           this.dropBlockAsItem_do(par1World, par3, par4, par5, new ItemStack(Block.deadBush, 1, par6));
 //       }
 //       else
 //       {
 //           super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
 //       }
 //   }
    
    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
    {
    	
        if (!par1World.isRemote && par2EntityPlayer.getCurrentEquippedItem() != null && par2EntityPlayer.getCurrentEquippedItem().itemID == Item.axeWood.itemID)
        {
            par2EntityPlayer.addStat(StatList.mineBlockStatArray[this.blockID], 1);
            this.dropBlockAsItem_do(par1World, par3, par4, par5, new ItemStack(Item.seeds, 1, par6));
        }
        else	
        {
            super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
        }
    }
}