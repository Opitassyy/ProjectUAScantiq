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

    private ArrayList<ModelData>dataKabupaten;
    private Context ctx;

    public AdapterCard(ArrayList<ModelData> dataKabupaten, Context ctx) {
        this.dataKabupaten = dataKabupaten;
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
        ModelData kabupaten = dataKabupaten.get(position);

        holder.tvNamaKab.setText(kabupaten.getNamakabupaten());
        holder.tvNamaKota.setText(kabupaten.getNamakota());


        Glide
                .with(holder.itemView.getContext())
                .load(kabupaten.getFoto())
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(holder.ivFotoKab);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xNamaKabupaten,xNamaKota,xDeskripsi,xFoto;
                xNamaKabupaten = kabupaten.getNamakabupaten();
                xNamaKota = kabupaten.getNamakota();
                xFoto=kabupaten.getFoto();

                Intent Kirim = new Intent(ctx, DetailActivity.class);
                Kirim.putExtra("xNamaKabupaten",xNamaKabupaten);
                Kirim.putExtra("xNamaKota",xNamaKota); //deskripsi
                Kirim.putExtra("xFoto",xFoto);

                ctx.startActivity(Kirim);


            }
        });

    }

    @Override
    public int getItemCount() {
        return dataKabupaten.size();
    }

    public class KabupatenViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivFotoKab;
        TextView tvNamaKab, tvNamaKota;
        Button btnLokasi;


        public KabupatenViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFotoKab = itemView.findViewById(R.id.iv_fotoKab);
            tvNamaKab = itemView.findViewById(R.id.tv_nama_kabupaten);
            tvNamaKota= itemView.findViewById(R.id.tv_nama_kota);
            btnLokasi=itemView.findViewById(R.id.btn_lokasi);
        }
    }
}
