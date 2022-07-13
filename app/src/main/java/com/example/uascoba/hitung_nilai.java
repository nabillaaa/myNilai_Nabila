package com.example.uascoba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitung_nilai extends AppCompatActivity {

    EditText nKdran, ntgs, nuts, nuas;

    Double hadir, tugas, uts, uas, nakhir;
    String grade;
    TextView tAkhir, nGrade;
    Button bHitung, Btnext2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_nilai);

        String kehadiran = getIntent().getExtras().getString("kehadiran");
        String tugas = getIntent().getExtras().getString("tugas");
        String uts = getIntent().getExtras().getString("uts");
        String uas = getIntent().getExtras().getString("uas");


        nKdran = findViewById(R.id.nKehadiran);
        nKdran.setText(kehadiran);

        ntgs = findViewById(R.id.nTugas);
        ntgs.setText(tugas);

        nuts = findViewById(R.id.nUTS);
        nuts.setText(uts);

        nuas = findViewById(R.id.nUAS);
        nuas.setText(uas);




        tAkhir = findViewById(R.id.takhir);
        nGrade = findViewById(R.id.tgrade);
        bHitung = findViewById(R.id.bthitung);
        Btnext2 = findViewById(R.id.bnext2);


    }


    public void hitung(View view) {
        hadir = Double.parseDouble(nKdran.getText().toString());
        tugas = Double.parseDouble(ntgs.getText().toString());
        uts = Double.parseDouble(nuts.getText().toString());
        uas = Double.parseDouble(nuas.getText().toString());

        nakhir = (hadir * 0.1) + (tugas * 0.3) + (uts * 0.3) + (uas * 0.3);

        if (nakhir >= 90 && nakhir <= 100) {
            grade = "A";
        } else if (nakhir >= 80 && nakhir <= 89) {
            grade = "B";
        } else if (nakhir >= 60 && nakhir <= 69) {
            grade = "C";
        } else {
            grade = "E";
        }

        tAkhir.setText("" + nakhir);
        nGrade.setText(" " + grade);

        tAkhir = findViewById(R.id.takhir);
        nGrade = findViewById(R.id.tgrade);

        Btnext2 = findViewById(R.id.bnext2);
        Btnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hitung_nilai.this, tampil.class);
                i.putExtra("akhir", tAkhir.getText().toString());
                i.putExtra("grade", nGrade.getText().toString());
                startActivity(i);

            }
        });

    }
}

