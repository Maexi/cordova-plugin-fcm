package com.gae.scaffolder.plugin;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver ;
import android.util.Log;

public class FCMPluginDismissBroadcastReceiver extends BroadcastReceiver {
    private static String TAG = "FCMPlugin";

      @Override
      public void onReceive(Context context, Intent intent) {
            Log.d(TAG, "\treceived Dismiss BroadCast!");
      }
}