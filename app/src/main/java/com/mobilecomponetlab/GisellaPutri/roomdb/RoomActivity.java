package com.mobilecomponetlab.GisellaPutri.roomdb;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.*;
import com.mobilecomponetlab.GisellaPutri.R;
import java.util.List;

public class RoomActivity extends AppCompatActivity {
    EditText edtNote; Button btnAdd; TextView txtList;
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        edtNote = findViewById(R.id.edtNote);
        btnAdd = findViewById(R.id.btnAdd);
        txtList = findViewById(R.id.txtList);

        db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "note_db")
                .allowMainThreadQueries()
                .build();

        btnAdd.setOnClickListener(v -> {
            Note n = new Note();
            n.text = edtNote.getText().toString();
            db.noteDao().insert(n);
            showAll();
        });

        showAll();
    }

    void showAll() {
        List<Note> notes = db.noteDao().getAll();
        StringBuilder sb = new StringBuilder();
        for (Note n : notes) sb.append(n.id).append(". ").append(n.text).append("\n");
        txtList.setText(sb.toString());
    }
}