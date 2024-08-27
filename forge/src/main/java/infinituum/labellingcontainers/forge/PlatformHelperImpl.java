package infinituum.labellingcontainers.forge;

import infinituum.labellingcontainers.forge.registration.resources.PlatformProvider;
import infinituum.labellingcontainers.utils.ContainerResource;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public final class PlatformHelperImpl {
    public static BlockEntity locateTargetBlockEntity(Level level, BlockPos blockPos, BlockState blockState) {
        return level.getBlockEntity(blockPos);
    }

    public static ContainerResource getPlatformSpecificProvider() {
        return new PlatformProvider();
    }
}