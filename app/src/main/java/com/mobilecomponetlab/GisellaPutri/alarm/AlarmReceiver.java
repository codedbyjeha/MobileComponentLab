package com.mobilecomponetlab.GisellaPutri.alarm;

import android.app.*;
import android.content.*;
import androidx.core.app.NotificationCompat;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context ctx, Intent intent) {
        String channelId = "alarm_channel";
        NotificationManager nm = (NotificationManager) ctx.getSystemService(Context.NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel ch = new NotificationChannel(channelId, "Alarm", NotificationManager.IMPORTANCE_HIGH);
            nm.createNotificationChannel(ch);
        }
        NotificationCompat.Builder nb = new NotificationCompat.Builder(ctx, channelId)
                .setSmallIcon(android.R.drawable.ic_lock_idle_alarm)
                .setContentTitle("Alarm Aktif")
                .setContentText("Sudah 5 detik berlalu!")
                .setAutoCancel(true);
        nm.notify(1, nb.build());
    }
}