package ikguana.nukkitplugin.kotlinexample

import cn.nukkit.plugin.PluginBase

class MainClass : PluginBase() {
    override fun onEnable() {
        logger.info("플러그인을 로딩하는중입니다.")
        server.pluginManager.registerEvents(KListenerClass(), this)
        logger.info("이벤트리스너가 등록되었습니다.")
    }
}