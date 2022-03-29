package com.example.exercise_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class regis extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnregis;

    //Deklarasi variabel untuk EditText
    EditText inama, iEmail, ipassword, irepass;

    //Deklarasi variabel untuk menyimpan nama, email dan password
    String nama, email, password, repassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regis);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnregis = findViewById(R.id.signup);

        //Menghubungkan variabel ednama dengan componen button pada layout
        inama = findViewById(R.id.nama1);

        //Menghubungkan variabel edEmail dengan componen button pada layout
        iEmail = findViewById(R.id.email1);

        //Menghubungkan variabel edPassword dengan componen button pada layout
        ipassword = findViewById(R.id.pass1);

        //Menghubungkan variabel edPassword dengan componen button pada layout
        irepass = findViewById(R.id.repass);

        //membuat fungsi one klik pada button btnLogin
        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edittext nama kedalam variabel nama
                nama = inama.getText().toString();

                //Menyimpan input user di edittext email kedalam variabel email
                email = iEmail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = ipassword.getText().toString();

                //Menyimpan input user di edittext re password kedalam variabel re password
                repassword = irepass.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama email dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "nama anda: " + nama + "email anda: " + email  + " Password anda: " + password + " rePassword anda: " + repassword , Toast.LENGTH_LONG);

                //memvalidasi inputan user
                if (nama.isEmpty() || password.isEmpty()) {
                    Toast.makeText(regis.this, "Login Gagal", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(regis.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                }

                //Menampilkan toast
                t.show();
            }
        });
    }
}
