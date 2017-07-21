package com.builtbroken.obsidianbucket;

import com.builtbroken.mc.fluids.bucket.BucketMaterial;
import net.minecraft.util.ResourceLocation;

/**
 * Handles settings and logic for the bucket material
 *
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 7/21/2017.
 */
public class ObsidianBucketMaterial extends BucketMaterial
{
    public ObsidianBucketMaterial()
    {
        super(ObsidianBucket.PREFIX + "ObsidianBucket", new ResourceLocation(ObsidianBucket.DOMAIN, "items/bucket"));
        preventHotFluidUsage = false;
        damageBucketWithHotFluid = false;
        burnEntityWithHotFluid = false;
        enableFluidLeaking = false;
        allowLeakToCauseFires = false;
    }
}
