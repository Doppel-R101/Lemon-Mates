package net.doppelr.lemonmates.entity;

import net.doppelr.lemonmates.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class LemonadeglassEntity extends BlockEntity {
    private int hasSlice; // 0 = none, 1 = orange, 2 = lemon

    public LemonadeglassEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.LEMONADE_GLASS_ENTITY.get(), pos, state);
    }

    @Override
    public void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        this.hasSlice = tag.getInt("hasSlice");
    }

    @Override
    public void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putInt("hasSlice", this.hasSlice);
    }
}
