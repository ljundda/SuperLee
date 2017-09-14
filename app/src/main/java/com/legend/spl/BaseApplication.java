package com.legend.spl;

import android.app.Application;
import android.content.Context;

import com.qihoo360.replugin.RePlugin;

/**
 * Created by legend on 17/9/14.
 */

public class BaseApplication extends Application {
    @Override
    public void attachBaseContext(Context base){
        super.attachBaseContext(base);
        RePlugin.App.attachBaseContext(this);
    }

    @Override
    public void onCreate(){
        super.onCreate();
        RePlugin.App.onCreate();
    }
}
