package com.legend.spl.frame.utils;

import android.content.Context;
import android.os.Environment;

/**
 * Created by legend on 17/7/31.
 */

public class FileUtils {
    private static final String PLUGIN_FILE_DIR = "plugins";
    private static String PluginPath;
    public String getPluginPath(Context context){
        return makePluginsDir(context);
    }
    public String makePluginsDir(Context context) {
        //this.getApplicationContext().getExternalFilesDir(M);
        //String fileDir = context.getFilesDir().getAbsolutePath();
        String fileDir = context.getExternalFilesDir(PLUGIN_FILE_DIR).getAbsolutePath();
        //context.getCacheDir()
        //File plugins = new File(fileDir + File.pathSeparator + "plugins");
        return fileDir;
    }

    public String getDiskCacheDir(Context context) {
        String cachePath = null;
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())
                || !Environment.isExternalStorageRemovable()) {
            cachePath = context.getExternalCacheDir().getPath();
        } else {
            cachePath = context.getCacheDir().getPath();
        }
        return cachePath;
    }
}
