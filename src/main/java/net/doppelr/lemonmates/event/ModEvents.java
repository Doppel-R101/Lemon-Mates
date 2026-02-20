package net.doppelr.lemonmates.event;

import net.doppelr.lemonmates.LemonMates;
import net.doppelr.lemonmates.block.ModBlocks;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.WandererTradesEvent;

import java.util.List;

@EventBusSubscriber(modid = LemonMates.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        genericTrades.add(new VillagerTrades.ItemsForEmeralds(ModBlocks.CITRON_SAPLING.asItem(), 5, 1, 8, 1));
        genericTrades.add(new VillagerTrades.ItemsForEmeralds(ModBlocks.ORANGE_SAPLING.asItem(), 5, 1, 8, 1));
    }
}
