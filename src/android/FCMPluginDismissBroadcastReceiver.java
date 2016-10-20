package com.gae.scaffolder.plugin;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

import java.util.Map;
import java.util.HashMap;

public class FCMPluginDismissBroadcastReceiver extends BroadcastReceiver {
    private static String TAG = "FCMPlugin";

      @Override
      public void onReceive(Context context, Intent intent) {
            Log.d(TAG, "\treceived Dismiss BroadCast!");
      }
}