package cn.ac.lz233.tarnhelm.ext.template

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import cn.ac.lz233.tarnhelm.extension.api.ExtContext
import cn.ac.lz233.tarnhelm.extension.api.ExtService
import cn.ac.lz233.tarnhelm.extension.api.ExtSharedPreferences
import cn.ac.lz233.tarnhelm.extension.api.IExtConfigurationPanel

class ExampleExtService(extContext: ExtContext): ExtService(extContext), IExtConfigurationPanel {

    override fun onExtInstall() {
        // TODO: Add your code here
    }

    override fun handleLoadString(charSequence: CharSequence?): String {
        // TODO: Add your code here
        TODO()
    }

    override fun onExtUninstall() {
        // TODO: Add your code here
    }

    override fun checkUpdate(): String {
        // TODO: Add your code here
        TODO()
    }

    override fun onRequestConfigurationPanel(
        context: Context?,
        sharedPreferences: ExtSharedPreferences?
    ): View {
        /*
        * Sample code below:
        * */
//        val linearLayout = LinearLayout(context)
//        linearLayout.orientation = LinearLayout.VERTICAL
//        val textView = TextView(context)
//        textView.text = "Hello, Tarnhelm!"
//        linearLayout.addView(textView)
//        return linearLayout

        // TODO: Add your code here
        TODO()
    }

}