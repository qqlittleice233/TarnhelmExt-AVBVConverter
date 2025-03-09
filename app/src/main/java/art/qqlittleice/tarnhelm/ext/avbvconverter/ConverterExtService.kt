package art.qqlittleice.tarnhelm.ext.avbvconverter

import cn.ac.lz233.tarnhelm.extension.api.ExtContext
import cn.ac.lz233.tarnhelm.extension.api.ExtService

class ConverterExtService(extContext: ExtContext): ExtService(extContext) {

    enum class Type {
        AV,
        BV
    }

    override fun onExtInstall() {}

    override fun handleLoadString(charSequence: CharSequence): String {
        val matchResult = match(charSequence)
        if (matchResult.isSuccess) {
            val pair = matchResult.getOrNull()!!
            val replace = pair.second.replace(Common.start, "")
            return when (pair.first) {
                Type.AV -> {
                    charSequence.toString().replace(pair.second, "${Common.start}${av2bv(replace)}")
                }
                Type.BV -> {
                    charSequence.toString().replace(pair.second, "${Common.start}${bv2av(replace)}")
                }
            }
        }
        return charSequence.toString()
    }

    private fun av2bv(av: String): String {
        return AVBVConverter.av2bv(av.replace("av", "").toLong())
    }

    private fun bv2av(bv: String): String {
        return "av${AVBVConverter.bv2av(bv)}"
    }

    private fun match(charSequence: CharSequence): Result<Pair<Type, String>> {
        val avRegex = Regex(Common.avRegex)
        val bvRegex = Regex(Common.bvRegex)
        val avMatch = avRegex.find(charSequence)
        val bvMatch = bvRegex.find(charSequence)
        if ((avMatch != null) and (bvMatch != null)) {
            return Result.failure(Exception("Both av and bv found"))
        }
        if (avMatch != null) {
            return Result.success(Pair(Type.AV, avMatch.groupValues[0]))
        }
        if (bvMatch != null) {
            return Result.success(Pair(Type.BV, bvMatch.groupValues[0]))
        }
        return Result.failure(Exception("No av or bv found"))
    }

    override fun onExtUninstall() {}

    override fun checkUpdate(): String {
        return "https://github.com/qqlittleice233/TarnhelmExt-AVBVConverter"
    }

}