package art.qqlittleice.tarnhelm.ext.avbvconverter

import android.os.Build
import cn.ac.lz233.tarnhelm.extension.api.ExtContext
import cn.ac.lz233.tarnhelm.extension.api.ExtService
import cn.ac.lz233.tarnhelm.extension.api.ITarnhelmExt

class ConverterExtImpl: ITarnhelmExt {

    override fun extensionInfo(): ITarnhelmExt.ExtInfo = object : ITarnhelmExt.ExtInfo {
        override fun id(): String = "art.qqlittleice.tarnhelm.ext.avbvconverter"

        override fun author(): String = "QQlittleice233"

        override fun name(): String = "BiliBili av/bv Converter"

        override fun description(): String = "A bilibili av/bv converter"

        override fun extensionURL(): String = "https://github.com/qqlittleice233/TarnhelmExt-AVBVConverter"

        override fun versionCode(): Int = 1

        override fun versionName(): String = "1.0.0"

        override fun hasConfigurationPanel(): Boolean = false

        override fun minTarnhelmSdkVersion(): Int = 1

        override fun minAndroidSdkVersion(): Int = Build.VERSION_CODES.O_MR1

        override fun regexes(): Array<String> = arrayOf(
            Common.avRegex,
            Common.bvRegex
        )
    }

    override fun createExtensionService(extContext: ExtContext): ExtService = ConverterExtService(extContext)

}