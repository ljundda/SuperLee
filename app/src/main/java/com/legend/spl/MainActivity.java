package com.legend.spl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.qihoo360.replugin.RePlugin;
import com.legend.spl.frame.utils.FileUtils;

import java.io.File;

/**
 * Created by legend on 17/9/14.
 */

public class MainActivity extends Activity {
    private String apkPathDir;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        apkPathDir = new FileUtils().getPluginPath(this);
        findViewById(R.id.btn_intall_all).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                installApks();
            }
        });
        findViewById(R.id.btn_intall_comn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RePlugin.startActivity(MainActivity.this, RePlugin.createIntent("com.legend.comn","com.legend.comn.ComnMainActivity"));
            }
        });
        findViewById(R.id.btn_intall_module1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RePlugin.startActivity(MainActivity.this, RePlugin.createIntent("com.legend.module1","com.legend.module1.Module1MainActivity"));
            }
        });
        findViewById(R.id.btn_intall_module2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RePlugin.startActivity(MainActivity.this, RePlugin.createIntent("com.legend.module2","com.legend.module2.Module2MainActivity"));
            }
        });
    }

    private void installApks(){
        String path = apkPathDir + File.separator + "comn-debug.apk";
        RePlugin.install(path);
        String path1 = apkPathDir + File.separator + "module1-debug.apk";
        RePlugin.install(path1);
        String path2 = apkPathDir + File.separator + "module2-debug.apk";
        RePlugin.install(path2);
    }
}
