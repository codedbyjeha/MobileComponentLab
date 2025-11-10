package com.mobilecomponetlab.GisellaPutri;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.mobilecomponetlab.GisellaPutri.sharedprefs.SharedPrefsActivity;
import com.mobilecomponetlab.GisellaPutri.recyclerview.RecyclerViewActivity;
import com.mobilecomponetlab.GisellaPutri.roomdb.RoomActivity;
import com.mobilecomponetlab.GisellaPutri.alarm.AlarmActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btnPrefs);
        Button btn2 = findViewById(R.id.btnRecycler);
        Button btn3 = findViewById(R.id.btnRoom);
        Button btn4 = findViewById(R.id.btnAlarm);

        btn1.setOnClickListener(v -> startActivity(new Intent(this, SharedPrefsActivity.class)));
        btn2.setOnClickListener(v -> startActivity(new Intent(this, RecyclerViewActivity.class)));
        btn3.setOnClickListener(v -> startActivity(new Intent(this, RoomActivity.class)));
        btn4.setOnClickListener(v -> startActivity(new Intent(this, AlarmActivity.class)));
    }
}