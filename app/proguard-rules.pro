# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-keep class TarnhelmExtEntry {
    public static java.lang.String entryClassName;
}

-keep class * extends cn.ac.lz233.tarnhelm.extension.api.ITarnhelmExt {
    <init>();
    <clinit>();
    cn.ac.lz233.tarnhelm.extension.api.ITarnhelmExt$ExtInfo extensionInfo();
    cn.ac.lz233.tarnhelm.extension.api.ExtService createExtensionService(cn.ac.lz233.tarnhelm.extension.api.ExtContext);
}

-keep class * extends cn.ac.lz233.tarnhelm.extension.api.ITarnhelmExt$ExtInfo {
    <init>();
    <clinit>();
    java.lang.String id();
    java.lang.String author();
    java.lang.String name();
    java.lang.String description();
    java.lang.String extensionURL();
    int versionCode();
    java.lang.String versionName();
    boolean hasConfigurationPanel();
    int minTarnhelmSdkVersion();
    int minAndroidSdkVersion();
    java.lang.String[] regexes();
}

-keep class * extends cn.ac.lz233.tarnhelm.extension.api.ExtService {
    <init>();
    <init>(cn.ac.lz233.tarnhelm.extension.api.ExtContext);
    <clinit>();
    void onExtInstall();
    void onExtUninstall();
    java.lang.String handleLoadString(java.lang.CharSequence);
    java.lang.String checkUpdate();
}

-keep class * extends cn.ac.lz233.tarnhelm.extension.api.IExtConfigurationPanel {
    <init>();
    <clinit>();
    android.view.View onRequestConfigurationPanel(android.content.Context, cn.ac.lz233.tarnhelm.extension.api.ExtSharedPreferences);
}