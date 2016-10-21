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

                /*Map<String, Object> data = new HashMap<String, Object>();
                if (intent.getExtras() != null) {
	            Log.d(TAG, "==> USER TAPPED NOTFICATION");
		    for (String key : intent.getExtras().keySet()) {
                        String value = intent.getExtras().getString(key);
                        Log.d(TAG, "\tKey: " + key + " Value: " + value);
		        data.put(key, value);
                    }
                }

                FCMPlugin.sendPushPayload( data );*/
        }
}