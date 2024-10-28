package com.appgramming.homesoftly;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class HomeSoftlyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent arg1) {
        Intent i = new Intent(context, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }

}
