package com.example.exercise_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLg;
    Button btLgn;

    //Deklarasi variabel untuk EditText
    EditText iEmail, ipassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnLg = findViewById(R.id.buttons);
        btLgn = findViewById(R.id.buttonr);

        //Menghubungkan variabel edEmail dengan componen button pada layout
        iEmail = findViewById(R.id.inama);

        //Menghubungkan variabel edPassword dengan componen button pada layout
        ipassword = findViewById(R.id.ipass);

        //membuat fungsi one klik pada button btnLogin
        btnLg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edittext email kedalam variabel nama
                nama = iEmail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = ipassword.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: " + nama + " dan Password anda: " + password + "", Toast.LENGTH_LONG);
                Bundle b = new Bundle();

                b.putString("a", nama.trim());

                Intent login = new Intent(getApplicationContext(), wellcome.class);
                login.putExtras(b);
                startActivity(login);

                //memvalidasi inputan user
                if (nama.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                }

                //Menampilkan toast
                t.show();
            }
        });

        btLgn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent register = new Intent (getApplicationContext(),regis.class);
                startActivity(register);
            }
        });
    }
}