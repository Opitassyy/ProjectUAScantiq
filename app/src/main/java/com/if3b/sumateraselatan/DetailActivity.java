package com.if3b.sumateraselatan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private ImageView ivFotoKab;
    private TextView tvNamaKab, tvNamaKota,tvDeskripsi,tvLuas;
    private Button btnLokasi;

    private String yNamaKabupaten,yNamaKota,yDeskripsi,yFoto,yLuasWilayah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivFotoKab = findViewById(R.id.iv_fotoKab);
        tvNamaKab = findViewById(R.id.tv_nama_kabupaten);
        tvNamaKota = findViewById(R.id.tv_ibu_kota);
        tvDeskripsi = findViewById(R.id.tv_deskripsi);
        tvLuas = findViewById(R.id.tv_luas_wilayah);
        btnLokasi = findViewById(R.id.btn_lokasi);

        Intent getData = getIntent();
        yNamaKabupaten = getData.getStringExtra("xNamaKabupaten");
        yNamaKota = getData.getStringExtra("xIbuKota");
        yDeskripsi = getData.getStringExtra("xDeskripsi");
        yFoto = getData.getStringExtra("xFoto");
        yLuasWilayah = getData.getStringExtra("xLuasWilayah");

        Glide
                .with(DetailActivity.this)
                .load(yFoto)
                .into(ivFotoKab);

        tvNamaKab.setText(yNamaKabupaten);
        tvNamaKota.setText(yNamaKota);
        tvDeskripsi.setText(yDeskripsi);
        tvLuas.setText(yLuasWilayah);

        btnLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri lokasi = Uri.parse("geo:0,0?q="+yNamaKabupaten);
                Intent bukaMaps = new Intent(Intent.ACTION_VIEW,lokasi);
                startActivity(bukaMaps);
            }
        });
        getSupportActionBar().setTitle(yNamaKabupaten);






    }
}