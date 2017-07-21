package com.builtbroken.obsidianbucket;

import com.builtbroken.mc.fluids.FluidModule;
import com.builtbroken.mc.fluids.api.reg.BucketMaterialRegistryEvent;
import com.builtbroken.mc.fluids.bucket.BucketMaterialHandler;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Simple skin addon for VE-FluidModule bucket
 *
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 7/21/2017.
 */
@Mod(modid = ObsidianBucket.DOMAIN, name = "Obsidian Bucket", version = "@MAJOR@.@MINOR@.@REVIS@.@BUILD@", dependencies = "after:vefluids")
@Mod.EventBusSubscriber(modid = ObsidianBucket.DOMAIN)
public class ObsidianBucket
{
    public static final String DOMAIN = "obsidianbucket";
    public static final String PREFIX = DOMAIN + ":";

    public static ObsidianBucketMaterial material;

    @SubscribeEvent
    public static void registerBucketMaterials(BucketMaterialRegistryEvent.Pre event)
    {
        BucketMaterialHandler.addMaterial("obsidian", material = new ObsidianBucketMaterial());
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        //TODO add crafting recipes for milk bucket
        ResourceLocation location = new ResourceLocation(DOMAIN, DOMAIN);
        event.getRegistry().register(new ShapedOreRecipe(location, new ItemStack(FluidModule.bucket, 1, material.metaValue),
                " s ",
                "wcw",
                " w ",
                'w', Blocks.OBSIDIAN,
                's', "stickWood", //TODO change to something that can't catch fire, possibly ore-dictionary to VE rods
                'c', "dye").setRegistryName("bucket.wood.oak"));

    }
}
