package net.doppelr.lemonmates.entity;

import net.doppelr.lemonmates.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class LemonadeglassEntity extends BlockEntity {
    private int hasSlice; // 0 = none, 1 = orange, 2 = lemon
    private String lemonade; // none, citronFull, citronHalf, orangeFull, orangeHalf, raspberryFull, raspberryHalf, summerFull, summerHalf, watermelonFull, watermelonHalf
    private int umbrellaMain; // 0 = white, 1 = light gray, 2 = gray, 3 = black, 4 = brown, 5 = red, 6 = orange, 7 = yellow, 8 = lime, 9 = green, 10 = cyan, 11 = light blue, 12 = blue, 13 = purple, 14 = magenta, 15 = pink
    private int umbrellaSecondary; // 0 = white, 1 = light gray, 2 = gray, 3 = black, 4 = brown, 5 = red, 6 = orange, 7 = yellow, 8 = lime, 9 = green, 10 = cyan, 11 = light blue, 12 = blue, 13 = purple, 14 = magenta, 15 = pink
    private int straw; // 0 = none, 1 = red/white, 2 = ?, 3 = ?, 4 = ?, 5 = ?, 6 = ?, 7 = ?, 8 = ?, 9 = ?, 10 = ?, 11 = ?, 12 = ?, 13 = ?, 14 = ?, 15 = ?, 16 = ?, 17 = ?, 18 = ?, 19 = ?, 20 = ?

    public LemonadeglassEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.LEMONADE_GLASS_ENTITY.get(), pos, state);
    }

    @Override
    public void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        this.hasSlice = tag.getInt("hasSlice");
        this.lemonade = tag.getString("lemonade");
        this.umbrellaMain = tag.getInt("umbrellaMain");
        this.umbrellaSecondary = tag.getInt("umbrellaSecondary");
        this.straw = tag.getInt("straw");
    }

    @Override
    public void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putInt("hasSlice", this.hasSlice);
        tag.putString("lemonade", this.lemonade);
        tag.putInt("umbrellaMain", this.umbrellaMain);
        tag.putInt("umbrellaSecondary", this.umbrellaSecondary);
        tag.putInt("straw", this.straw);
    }
}
