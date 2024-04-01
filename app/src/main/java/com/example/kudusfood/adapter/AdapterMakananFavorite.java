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

public class AdapterMakananFavorite extends RecyclerView.Adapter<AdapterMakananFavorite.ViewHolder>{
    private Context context;
    private List<ModelKuliner> listData;
    private LayoutInflater mInflater;

    public AdapterMakananFavorite(List<ModelKuliner> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterMakananFavorite.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_view_makananfavorite, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMakananFavorite.ViewHolder holder, int position) {
        ModelKuliner items = this.listData.get(position);

        holder.tvMakananFavorite.setText(items.getNama());
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

        TextView tvMakananFavorite, tvDeskripsi;
        ImageView ivImageMakanan;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMakananFavorite = itemView.findViewById(R.id.tvNamaMakananFav);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsiFav);
            ivImageMakanan = itemView.findViewById(R.id.ivImageMakananFav);
        }

    }


}
