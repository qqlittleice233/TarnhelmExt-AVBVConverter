package cn.ac.lz233.tarnhelm.ext.template

import android.os.Build
import cn.ac.lz233.tarnhelm.extension.api.ExtContext
import cn.ac.lz233.tarnhelm.extension.api.ExtService
import cn.ac.lz233.tarnhelm.extension.api.ITarnhelmExt

class ExampleExtImpl: ITarnhelmExt {

    // TODO: Change your own extension information
    override fun extensionInfo(): ITarnhelmExt.ExtInfo = object : ITarnhelmExt.ExtInfo {
        override fun id(): String = "cn.ac.lz233.tarnhelm.ext.example"

        override fun author(): String = "lz233"

        override fun name(): String = "Example Extension"

        override fun description(): String = "An example extension"

        override fun extensionURL(): String? = null

        override fun versionCode(): Int = 1

        override fun versionName(): String = "SDK 1.0.0"

        override fun hasConfigurationPanel(): Boolean = true

        override fun minTarnhelmSdkVersion(): Int = 1

        override fun minAndroidSdkVersion(): Int = Build.VERSION_CODES.O_MR1

        override fun regexes(): Array<String> = arrayOf(".*")
    }

    // TODO: Change your own extension service
    override fun createExtensionService(extContext: ExtContext): ExtService = ExampleExtService(extContext)

}