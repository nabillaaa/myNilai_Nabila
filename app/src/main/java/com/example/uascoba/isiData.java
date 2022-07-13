package com.example.uascoba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class isiData extends AppCompatActivity {
    EditText nim, nama, kehadiran, tugas, uts, uas;
    Button Bsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_data);

        nim = findViewById(R.id.eNim);
        nama = findViewById(R.id.eNama);
        kehadiran = findViewById(R.id.eKehadiran);
        tugas = findViewById(R.id.eTugas);
        uts = findViewById(R.id.eUTS);
        uas = findViewById(R.id.eUAS);

        Bsubmit = findViewById(R.id.btsubmit);
        Bsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(isiData.this, hitung_nilai.class);
                i.putExtra( "kehadiran", kehadiran.getText().toString());
                i.putExtra("tugas", tugas.getText().toString());
                i.putExtra("uts", uts.getText().toString());
                i.putExtra("uas", uas.getText().toString());
                startActivity(i);

                Intent intent = new Intent(isiData.this , tampil.class);
                i.putExtra("nama", nama.getText().toString());
                i.putExtra("nim", nim.getText().toString());
                startActivity(i);


            }
        });

    }


}