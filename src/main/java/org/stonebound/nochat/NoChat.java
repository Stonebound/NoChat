package org.stonebound.nochat;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.Order;
import org.spongepowered.api.event.message.MessageChannelEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "nochat",
        name = "NoChat",
        description = "Cancels all player chat",
        version = "@version@",
        authors = {
                "phit"
        }
)
public class NoChat {
    @Listener(order = Order.LAST)
    public void onChat(MessageChannelEvent.Chat event) {
        Object root = event.getCause().root();
        if (root instanceof Player) {
            event.setCancelled(true);
        }
    }

}