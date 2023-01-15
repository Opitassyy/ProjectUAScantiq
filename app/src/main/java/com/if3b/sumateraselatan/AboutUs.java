package com.if3b.sumateraselatan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {
    private TextView tvNamaRapli,tvNamaDhea,tvNamaSilpi,tvNamaOpita;
    private TextView tvNpmRapli,tvNpmDhea,tvNpmSilpi,tvNpmOpita;
    private ImageView ivlogo;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        getSupportActionBar().setTitle("About Us");

        ivlogo = findViewById(R.id.iv_logo_about);

        tvNamaRapli = findViewById(R.id.nama_rafly);
        tvNamaDhea = findViewById(R.id.nama_dhea);
        tvNamaSilpi = findViewById(R.id.nama_silvi);
        tvNamaOpita = findViewById(R.id.nama_opita);

        tvNpmRapli = findViewById(R.id.npm_rafly);
        tvNpmDhea = findViewById(R.id.npm_dhea);
        tvNpmSilpi = findViewById(R.id.npm_silvi);
        tvNpmOpita = findViewById(R.id.npm_opita);

    }
}