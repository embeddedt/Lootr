package noobanidus.mods.lootr.events;

import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.player.AdvancementEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import noobanidus.mods.lootr.Lootr;

@Mod.EventBusSubscriber(modid=Lootr.MODID)
public class HandleAdvancement {
  @SubscribeEvent
  public static void onAdvancement(AdvancementEvent event) {
    if (!event.getPlayer().level.isClientSide) {
      Lootr.ADVANCEMENT_PREDICATE.trigger((ServerPlayer) event.getPlayer(), event.getAdvancement().getId());
    }
  }
}
