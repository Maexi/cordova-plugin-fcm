package com.gae.scaffolder.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class FCMPluginDismissBroadcastReceiver extends BroadcastReceiver {
        private static final String TAG = "FCMPlugin";
        
        @Override
        public void onReceive(Context context, Intent intent) {
                Log.d(TAG, "==> FCMPluginDismissBroadcastReceiver onReceive");
        }
}