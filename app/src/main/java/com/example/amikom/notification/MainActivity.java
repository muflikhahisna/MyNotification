package com.example.amikom.notification;

import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final int NOTIF_ID = 1;Button pencet;
    //coba
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pencet = (Button) findViewById(R.id.btn_Send);

        pencet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder notifBuilder = (NotificationCompat.Builder) new
                        NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.drawable.ic_access_alarms_black_36dp)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources()
                                , R.drawable.ic_access_alarms_black_36dp))

                        .setContentTitle(getResources().getString(R.string.content_title))

                        .setContentTitle(getResources().getString(R.string.content_text))
                        .setSubText(getResources().getString(R.string.subtext))
                        .setAutoCancel(true);

                NotificationManagerCompat ncm =
                        NotificationManagerCompat.from(getApplicationContext());
                ncm.notify(NOTIF_ID, notifBuilder.build());
            }
        });
    }


}
