package com.example.kudusfood.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kudusfood.ModelKuliner;
import com.example.kudusfood.R;
import com.example.kudusfood.adapter.AdapterMakananFavorite;

import java.util.ArrayList;
import java.util.List;

public class MakananFavorite extends Fragment implements AdapterMakananFavorite.ItemClickListener{

    List<ModelKuliner> items;
    RecyclerView recyclerView;
    AdapterMakananFavorite adapter;

    public MakananFavorite() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_makanan_favorite, container, false);

        View view = inflater.inflate(R.layout.fragment_makanan_favorite, container, false);

        items = new ArrayList<ModelKuliner>();

        // Add items to the list
        items.add(new ModelKuliner("Nasi Goreng", "Nasi yang digoreng dengan bumbu spesial dan diberi topping berupa telur maupun ayam.", "https://miro.medium.com/v2/resize:fit:670/0*HFS5StgmAiZGwqHd.jpg"));
        items.add(new ModelKuliner("Ayam Goreng", "Ayam yang digoreng dengan bumbu tradisional sehingga menghasilkan cita rasa gurih.", "https://www.astronauts.id/blog/wp-content/uploads/2023/04/Resep-Ayam-Goreng-Serundeng-ala-Rumahan-yang-Nggak-Kalah-Enak-dari-Restoran.jpg"));
        items.add(new ModelKuliner("Bubur Ayam", "Nasi yang dimasak hingga menjadi bubur kemudian diberi suwiran ayam dan berbagai macam topping.", "https://www.sasa.co.id/medias/page_medias/bubur_ayam.jpg"));
        items.add(new ModelKuliner("Bakso", "Olahan daging sapi yang memiliki bentuk bulat dengan kuah spesial.", "https://cdn0-production-images-kly.akamaized.net/ZGgx--GJNOoEn4XNmkAXkknlqwk=/800x450/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/2763419/original/071857300_1553761217-shutterstock_1148354906.jpg"));
        items.add(new ModelKuliner("Soto Ayam", "Olahan ayam yang disajikan dengan bumbu kuah dan biasanya disajikan dengan nasi.", "https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2023/07/17043644/Praktis-dan-Simpel-Ini-Resep-Soto-Ayam-Lamongan-yang-Menggugah-Selera-.jpg"));
        items.add(new ModelKuliner("Cheese Burger", "Daging yang dipadukan dengan keju meleleh menjadikan rasa makanan gurih dan juicy.", "https://barapigrill.com/wp-content/uploads/2017/07/barachiz-burger-jakarta.jpg"));

        // Find the RecyclerView in the fragment's layout
        recyclerView = view.findViewById(R.id.rvMakananFav);

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new AdapterMakananFavorite(items, requireContext());
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        return view;

    }
    @Override
    public void onItemClick(View view, int position) {
    }
}