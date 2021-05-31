package com.wyze.wlibrary;

public class Info {

    final static public String TEXT = getBuildInfo();

    private static String getBuildInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Wlibrary build info:").append("\n");
        sb.append(BuildConfig.BUILD_TYPE).append("\n");
        sb.append(BuildConfig.WYZE_PLUGIN_VERSION_CODE).append("\n");
        sb.append(BuildConfig.WYZE_PLUGIN_VERSION_NAME).append("\n");
        sb.append(BuildConfig.BASE_BUILD_GRADLE_NAME).append("\n");
        return sb.toString();
    }
}
