package com.example.exercise_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class wellcome extends AppCompatActivity {
    //Deklarasi variabel untuk button
    FloatingActionButton btnfl;

    //Deklarasi variabel untuk EditText
    EditText itask, ijenis, itime;

    //Deklarasi variabel untuk menyimpan nama, email dan password
    String task, jenis, time, bundle;

    TextView namaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wellcome);

        //Menghubungkan variabel btnplus dengan componen button pada layout
        namaa = findViewById(R.id.namee);
        btnfl = findViewById(R.id.buttonfl);

        //Menghubungkan variabel edtask dengan componen button pada layout
        itask = findViewById(R.id.nama2);

        //Menghubungkan variabel edjenis dengan componen button pada layout
        ijenis = findViewById(R.id.jenis);

        //Menghubungkan variabel edtime dengan componen button pada layout
        itime = findViewById(R.id.time);

        Bundle a = getIntent().getExtras();
        bundle = a.getString("a");

        namaa.setText(bundle);

        //membuat fungsi one klik pada button btnLogin
        btnfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edittext task kedalam variabel task
                task = itask.getText().toString();

                //Menyimpan input user di edittext email kedalam variabel email
                jenis = ijenis.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                time = itime.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama email dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "masukkan task: " + task + "masukkan jenis task: " + jenis + " masukkan lama task: " + time, Toast.LENGTH_LONG);

                Bundle b = new Bundle();

                b.putString("task", task.trim());

                b.putString("jenis", jenis.trim());

                b.putString("time", time.trim());

                Intent wellcome = new Intent(getApplicationContext(), todoapp.class);

                wellcome.putExtras(b);

                startActivity(wellcome);

                //memvalidasi inputan user

                if (task.isEmpty() || jenis.isEmpty()) {
                    Toast.makeText(wellcome.this, "Login Gagal", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(wellcome.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                }

                //Menampilkan toast
                t.show();
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.sub){
            task = itask.getText().toString();
            jenis = ijenis.getText().toString();
            time = itime.getText().toString();


            Toast.makeText(getApplicationContext(),
                    "Berhasil", Toast.LENGTH_LONG).show();

            Bundle b = new Bundle();

            b.putString("task", task.trim());

            b.putString("jenis", jenis.trim());

            b.putString("time", time.trim());

            Intent hasil = new Intent(getApplicationContext(), todoapp.class);

            hasil.putExtras(b);

            startActivity(hasil);
        }
        else {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
