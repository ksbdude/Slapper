package io.github.ksbdude;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class slapper extends JavaPlugin{
    @Override
    public void onEnable(){
        // TODO Insert logic to be performed when the plugin is enabled
    	getLogger().info("onEnable has been invoked!");
    }
 
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    	getLogger().info("onDisable has been invoked!");
    }
    public void onSignChange(SignChangeEvent event) {
        Player p = event.getPlayer();
        if(event.getLine(0).contains("joinslapper")){
             event.setLine(0, "�4 Slapper");
             event.setLine(1, "�2 join");
             p.sendMessage(ChatColor.BLUE + "MySign successfully created!");
        }
    }
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if(event.getClickedBlock().getTypeId() == 63 || event.getClickedBlock().getTypeId() == 68) {

                Sign sign = (Sign) event.getClickedBlock().getState();
                sign.setLine(0, "Boo Yeah");
                sign.update();

                // Do other stuff if you need to
            }
        }
 
}
}












