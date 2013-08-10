package net.minecraft.src;

import java.util.Random;
import java.io.*;
import java.util.*;
import net.minecraft.client.Minecraft;

public class mod_AncientTreeRoot extends BaseMod
{
 	
 public mod_AncientTreeRoot()
    {
   // 	readWriteProperties();
    	
        BlockAncientTreeRoot = new BlockAncientTreeRoot(BlockAncientTreeRootID).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("BlockAncientTreeRoot").setHardness(0.3F).setResistance(0.3F).setLightValue(0.0F);
        ItemAncientTreeRoot = new Item(ItemAncientTreeRootID).setUnlocalizedName("ItemAncientTreeRoot");
        ModLoader.addName(BlockAncientTreeRoot, "Ancient Tree Root");
        BlockAncientTreeRoot.setCreativeTab(CreativeTabs.tabBlock); 
        	
        ModLoader.addName(ItemAncientTreeRoot, "Ancient Tree Root");
        ItemAncientTreeRoot.setCreativeTab(CreativeTabs.tabMaterials);

        ModLoader.addSmelting(ItemAncientTreeRoot.itemID, new ItemStack(Item.coal, 1, 1), 0.1F);
        ModLoader.addRecipe(new ItemStack(Item.stick, 1), new Object[] {"W", 'W', ItemAncientTreeRoot});
        ModLoader.addShapelessRecipe(new ItemStack(Block.sapling, 1), new Object[] {Item.seeds, ItemAncientTreeRoot});      
    }
        
	public void readWriteProperties() {
		Properties properties = new Properties();
		try
		{	
            File file = new File((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/mods/AncientTreeRoot.config").toString());
            boolean flag = file.createNewFile();
            if(flag)
            {
                FileOutputStream fileoutputstream = new FileOutputStream(file);
                properties.setProperty("BlockAncientTreeRootID", Integer.toString(231));
                properties.setProperty("ItemAncientTreeRootID", Integer.toString(2043));
                properties.setProperty("ShouldMoreOreSpawn", Boolean.toString(false));
                properties.store(fileoutputstream, "Change the ID's to fix ID incompatibilities.");
                fileoutputstream.close();
            }
            properties.load(new FileInputStream((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/mods/AncientTreeRoot.config").toString()));
            BlockAncientTreeRootID = Integer.parseInt(properties.getProperty("BlockAncientTreeRootID"));
            ItemAncientTreeRootID = Integer.parseInt(properties.getProperty("ItemAncientTreeRootID"));
            ShouldMoreOreSpawn = Boolean.parseBoolean(properties.getProperty("ShouldMoreOreSpawn"));
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
            BlockAncientTreeRootID = 231;
            ItemAncientTreeRootID = 2043;
            ShouldMoreOreSpawn = false;
        }
	}
	
	public static Block BlockAncientTreeRoot;
    public static int BlockAncientTreeRootID;
	public static Item ItemAncientTreeRoot;
    public static int ItemAncientTreeRootID;
    public static boolean ShouldMoreOreSpawn;
    
    public String getVersion()
    {
        return "MineCraft1.5.2__AncientTreeRoot1.5.2r1";
    }
    
public void generateSurface(World world, Random r, int i, int j)
{
	if (ShouldMoreOreSpawn == true)
	{
	    for(int k = 0; k < 5 + r.nextInt(14); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         //stone
         (new WorldGenMinable(BlockAncientTreeRoot.blockID, 5 + r.nextInt(10))).generate(world, r, randPosX, randPosY, randPosZ);
    }
	
    for(int k = 0; k < 9 + r.nextInt(16); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         //dirt
         (new WorldGenAncientTreeRoot(BlockAncientTreeRoot.blockID, 7 + r.nextInt(14))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
    for(int k = 0; k < 8 + r.nextInt(16); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         //grass
         (new WorldGenAncientTreeRoot2(BlockAncientTreeRoot.blockID, 9 + r.nextInt(17))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
    for(int k = 0; k < 9 + r.nextInt(18); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         //sand
         (new WorldGenAncientTreeRoot3(BlockAncientTreeRoot.blockID, 7 + r.nextInt(14))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    }
    else
    {
	    for(int k = 0; k < 3 + r.nextInt(5); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         //stone
         (new WorldGenMinable(BlockAncientTreeRoot.blockID, 2 + r.nextInt(4))).generate(world, r, randPosX, randPosY, randPosZ);
    }
	
    for(int k = 0; k < 6 + r.nextInt(9); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         //dirt
         (new WorldGenAncientTreeRoot(BlockAncientTreeRoot.blockID, 3 + r.nextInt(7))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
    for(int k = 0; k < 6 + r.nextInt(9); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         //grass
         (new WorldGenAncientTreeRoot2(BlockAncientTreeRoot.blockID, 4 + r.nextInt(6))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
    for(int k = 0; k < 8 + r.nextInt(12); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         //sand
         (new WorldGenAncientTreeRoot3(BlockAncientTreeRoot.blockID, 3 + r.nextInt(5))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    }
}

public int addFuel(int par1, int par2)
    {
        if(par1 == ItemAncientTreeRoot.itemID)
        {
            return 800;
        }
        return 0;
    }
    public void load() 
    	{
    	      ModLoader.registerBlock(BlockAncientTreeRoot);	
        }
}