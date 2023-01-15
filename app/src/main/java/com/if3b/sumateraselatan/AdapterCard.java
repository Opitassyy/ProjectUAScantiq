package com.if3b.sumateraselatan;
import android.net.Uri;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.KabupatenViewHolder> {

    private ArrayList<ModelData>dataKabupatenKota;
    private Context ctx;

    public AdapterCard(ArrayList<ModelData> dataKabupaten, Context ctx) {
        this.dataKabupatenKota = dataKabupaten;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public KabupatenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewKabupaten = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_kabupaten,parent,false);
        return new KabupatenViewHolder(viewKabupaten);
    }

    @Override
    public void onBindViewHolder(@NonNull KabupatenViewHolder holder, int position) {
        ModelData kabupaten = dataKabupatenKota.get(position);

        holder.tvNamaKab.setText(kabupaten.getNamakabupaten());
        holder.tvibuKota.setText(kabupaten.getIbukota());


        Glide
                .with(holder.itemView.getContext())
                .load(kabupaten.getFoto())
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(holder.ivFotoKab);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xNamaKabupaten,xIbuKota,xLuasWilayah,xDeskripsi,xFoto;
                xNamaKabupaten = kabupaten.getNamakabupaten();
                xIbuKota = kabupaten.getIbukota();
                xFoto=kabupaten.getFoto();
                xDeskripsi=kabupaten.getDeskripsi();
                xLuasWilayah= kabupaten.getLuaswilayah();


                Intent Kirim = new Intent(ctx, DetailActivity.class);
                Kirim.putExtra("xNamaKabupaten",xNamaKabupaten);
                Kirim.putExtra("xIbuKota",xIbuKota);
                Kirim.putExtra("xFoto",xFoto);
                Kirim.putExtra("xDeskripsi",xDeskripsi);
                Kirim.putExtra("xLuasWilayah",xLuasWilayah);




                ctx.startActivity(Kirim);


            }
        });

    }

    @Override
    public int getItemCount() {
        return dataKabupatenKota.size();
    }

    public class KabupatenViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivFotoKab;
        TextView tvNamaKab, tvibuKota,tvLuasWilayah;
        Button btnLokasi;


        public KabupatenViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFotoKab = itemView.findViewById(R.id.iv_fotoKab);
            tvNamaKab = itemView.findViewById(R.id.tv_nama_kabupaten);
            tvibuKota= itemView.findViewById(R.id.tv_ibu_kota);
            tvLuasWilayah = itemView.findViewById(R.id.tv_luas_wilayah);
            btnLokasi=itemView.findViewById(R.id.btn_lokasi);
        }
    }
}
