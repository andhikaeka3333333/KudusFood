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

public class AdapterMinumanKhas extends RecyclerView.Adapter<AdapterMinumanKhas.ViewHolder> {
    private Context context;
    private List<ModelKuliner> listData;
    private LayoutInflater mInflater;


    public AdapterMinumanKhas(List<ModelKuliner> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterMinumanKhas.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_view_minumankhas, parent, false);
        return new AdapterMinumanKhas.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMinumanKhas.ViewHolder holder, int position) {
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
            tvMakananKhas = itemView.findViewById(R.id.tvNamaMinumanKhas);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsiMinumanKhas);
            ivImageMakanan = itemView.findViewById(R.id.ivImageMinumanKhas);

        }
    }

}
