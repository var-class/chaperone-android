package me.chaperone.chaperone;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.content.Intent;

/**
 * Created by mischka on 11/22/14.
 */
public class GcmBroadcastReceiver extends WakefulBroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        // Explicitly specify that GcmIntentService will handle the intent.
        ComponentName comp = new ComponentName(context.getPackageName(),
                GcmIntentService.class.getName());
        // Start the service, keeping the device awake while it is launching.
        startWakefulService(context, (intent.setComponent(comp)));
        setResultCode(Activity.RESULT_OK);
    }
}
