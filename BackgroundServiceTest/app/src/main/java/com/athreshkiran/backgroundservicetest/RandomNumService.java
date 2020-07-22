package com.athreshkiran.backgroundservicetest;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import java.security.Provider;

import static com.athreshkiran.backgroundservicetest.App.CHANNEL_ID;

public class RandomNumService extends android.app.Service {
    public static final double RandomNumber=Math.round(Math.random()*100000);
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Notification notification =new NotificationCompat.Builder(this,CHANNEL_ID)
                .setContentText(Double.toString(RandomNumber))
                .setContentTitle("Random Number Service")
                .setSmallIcon(R.drawable.ic_baseline_call_made_24)
                .build();
        startForeground(1,notification);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
