package com.mobilecomponetlab.GisellaPutri.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mobilecomponetlab.GisellaPutri.R;
import java.util.Arrays;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));

        List<String> items = Arrays.asList("Belajar XML", "Ngoding Java", "Testing App");
        rv.setAdapter(new SimpleAdapter(items));
    }
}