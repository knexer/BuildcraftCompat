package buildcraft.compat.forestry.schematics;

import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicBlock;
import net.minecraft.item.ItemStack;

/**
 * Overrides metadata value for cost and result.
 */
public class SchematicForestrySoil extends SchematicBlock {
    private int overrideMeta;

    public SchematicForestrySoil(int overrideMeta) {
        this.overrideMeta = overrideMeta;
    }
    @Override
    public void initializeFromObjectAt(IBuilderContext context, int x, int y, int z) {
        super.initializeFromObjectAt(context, x, y, z);

        meta = overrideMeta;
    }

    @Override
    public void storeRequirements(IBuilderContext context, int x, int y, int z) {
        storedRequirements = new ItemStack[] { new ItemStack(block, 1, meta) };
    }
}
