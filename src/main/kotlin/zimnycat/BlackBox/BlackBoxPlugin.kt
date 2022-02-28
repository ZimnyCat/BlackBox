package zimnycat.BlackBox

import com.lambda.client.plugin.api.Plugin
import zimnycat.BlackBox.modules.BlackBox

internal object BlackBoxPlugin : Plugin() {

    override fun onLoad() {
        modules.add(BlackBox)
    }

}