package com.example.kudusfood.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.kudusfood.ModelKuliner;
import com.example.kudusfood.R;

import java.util.List;

public class AdapterMakananKhas extends RecyclerView.Adapter<AdapterMakananKhas.ViewHolder> {
    private Context context;
    private List<ModelKuliner> listData;
    private LayoutInflater mInflater;

    public AdapterMakananKhas(List<ModelKuliner> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterMakananKhas.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_view_makanankhas, parent, false);
        return new AdapterMakananKhas.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMakananKhas.ViewHolder holder, int position) {
        ModelKuliner items = this.listData.get(position);

        holder.tvMakananKhas.setText(items.getNama());
        holder.tvDeskripsi.setText(items.getDeskripsi());

        Glide.with(holder.itemView.getContext())
                .load(items.getImage())
                .into(holder.ivImageMakanan);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvMakananKhas, tvDeskripsi;
        ImageView ivImageMakanan;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMakananKhas = itemView.findViewById(R.id.tvNamaMakananKhas);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsiKhas);
            ivImageMakanan = itemView.findViewById(R.id.ivImageMakananKhas);
        }
    }



}
