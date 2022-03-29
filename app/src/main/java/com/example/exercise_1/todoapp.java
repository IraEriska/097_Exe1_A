package com.example.exercise_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class todoapp extends AppCompatActivity {

    //Deklarasi variabel untuk menyimpan nama, email dan password
    String edtask, edjenis, edtime;

    TextView task, jenis, time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todoapp);

        setContentView(R.layout.todoapp);
        task = findViewById(R.id.hasiltask);
        jenis = findViewById(R.id.jenistask);
        time = findViewById(R.id.timetask);
        Bundle bundle = getIntent().getExtras();
        edtask = bundle.getString("task");
        edjenis = bundle.getString("jenis");
        edtime = bundle.getString("time");
        task.setText(edtask);
        jenis.setText(edjenis);
        time.setText(edtime);
    }
}