/*
 *
 * HomeSoftly
 * http://www.appgramming.com/homesoftly/
 * Copyright (C) 2013 Appgramming. All Rights Reserved.
 *
 */

package com.appgramming.homesoftly;

import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;

public class MainActivity extends Activity {

    /*
     * Creates and shows the Go Home notification.
     */ 
    @SuppressWarnings("deprecation")
    private void createGoHomeNotification() {

        // Create the Go Home intent
        Intent sendingIntent = new Intent(Intent.ACTION_MAIN);
        sendingIntent.addCategory(Intent.CATEGORY_HOME);
        PendingIntent pIntent = PendingIntent.getActivity(this, 0, sendingIntent, PendingIntent.FLAG_UPDATE_CURRENT); 		

        // Create the notification
        Notification.Builder builder = new Notification.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentIntent(pIntent) 
                .setContentTitle(getString(R.string.app_name))
                .setContentText(getString(R.string.app_tip))
                .setOngoing(true);

        // Show the notification
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
       	manager.notify(0, builder.getNotification());     
    }

    /*
     * When the activity is started, create and show the Go Home notification, than close the activity
     */ 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create and show the Go Home notification
        createGoHomeNotification();

        // Tell the system that the activity should now be closed
        finish();
    }
}