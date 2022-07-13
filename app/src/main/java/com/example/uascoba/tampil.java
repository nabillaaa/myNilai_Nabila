package com.example.uascoba;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


public class tampil extends AppCompatActivity {

    EditText Enim, Enama, nakhir, gnilai;
    Spinner smatkul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);


        Enim = findViewById(R.id.ednim);
        Enama = findViewById(R.id.ednama);
        nakhir= findViewById(R.id.edAkhir);
        gnilai = findViewById(R.id.edGrade);

        String akhir = getIntent().getExtras().getString("akhir");
        String grade = getIntent().getExtras().getString("grade");

        nakhir.findViewById(R.id.edAkhir);
        nakhir.setText(akhir);

        gnilai.findViewById(R.id.edGrade);
        gnilai.setText(grade);

        String nim = getIntent().getExtras().getString("nim");
        String nama = getIntent().getExtras().getString("nama");


        Enim.findViewById(R.id.ednim);
        Enim.setText(nim);

        Enama.findViewById(R.id.ednama);
        Enama.setText(nama);





    }
}