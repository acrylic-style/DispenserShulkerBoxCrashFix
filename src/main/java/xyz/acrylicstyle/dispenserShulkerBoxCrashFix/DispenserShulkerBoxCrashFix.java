package xyz.acrylicstyle.dispenserShulkerBoxCrashFix;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.plugin.java.JavaPlugin;

// why i wasn't able to think better name
public class DispenserShulkerBoxCrashFix extends JavaPlugin implements Listener {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onBlockDispense(BlockDispenseEvent e) {
        if (e.getBlock().getLocation().getBlockY() == 255 && e.getItem().getType().name().endsWith("SHULKER_BOX")) {
            e.setCancelled(true);
        }
    }
}
