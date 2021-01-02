package ikguana.nukkitplugin.kotlinexample

import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerJoinEvent

class KListenerClass : Listener {
    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        event.player.sendMessage(event.player.name + "님 서버에 접속하신것을 환영합니다.")
    }
}
