package com.if3b.sumateraselatan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvKabupaten;
    private ArrayList<ModelData>data=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Kabupaten & Kota Sumatera Selatan");

        rvKabupaten = findViewById(R.id.rv_kabupaten);
        rvKabupaten.setHasFixedSize(true);

        data.addAll(dataKabupatenKota.ambilDataKabupaten());
        tampilData();


    }
    private void tampilData(){
        rvKabupaten.setLayoutManager(new LinearLayoutManager(this));
        AdapterCard varAdapter = new AdapterCard(data,MainActivity.this);
        rvKabupaten.setAdapter(varAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about_us,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about_us:
                Intent pindah = new Intent(MainActivity.this,AboutUs.class);
                startActivity(pindah);
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}