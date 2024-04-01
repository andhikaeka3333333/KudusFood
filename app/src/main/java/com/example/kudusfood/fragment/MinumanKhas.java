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
import com.example.kudusfood.adapter.AdapterMinumanKhas;

import java.util.ArrayList;
import java.util.List;

public class MinumanKhas extends Fragment implements AdapterMinumanKhas.ItemClickListener {

    List<ModelKuliner> items;
    RecyclerView recyclerView;
    AdapterMinumanKhas adapter;
    public MinumanKhas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_minuman_khas, container, false);

        View view = inflater.inflate(R.layout.fragment_minuman_khas, container, false);

        items = new ArrayList<ModelKuliner>();

        // Add items to the list
        items.add(new ModelKuliner("Wedang Coro", "Wedang coro terbuat dari campuran rempah lainnya seperti gula aren, jahe, sereh, cengkeh, tepung beras, dan gara.", "https://img-z.okeinfo.net/okz/500/library/images/2023/11/08/6g83tytieteyc9j702j3_21211.JPG"));
        items.add(new ModelKuliner("Kopi Jetak", "Kopi jetak diproses dengan metode pembuatannya digoreng yang menghasilkan warna hitam", "https://static.promediateknologi.id/crop/0x0:0x0/750x500/webp/photo/2023/01/21/2453723392.jpg"));
        items.add(new ModelKuliner("Wedang Blung", "Terbuat dari air, santan, gula merah, dan jahe, wedang blung merupakan minuman hangat yang berasal dari Kudus", "https://img-z.okeinfo.net/okz/500/library/images/2023/11/08/k5qdkmpaqixhjdoy5gz9_17198.JPG"));
        items.add(new ModelKuliner("Wedang Pejuh", "Minuman ini terbuat dari jeruk pamelo, jahe, sereh, dan susu kental manis, yang disajikan dalam bentuk minuman hangat.", "https://img-z.okeinfo.net/okz/500/library/images/2023/11/08/tr9psb4lhd4598okfuhr_15410.JPG"));

        // Find the RecyclerView in the fragment's layout
        recyclerView = view.findViewById(R.id.rvMinumanKhas);

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new AdapterMinumanKhas(items, requireContext());
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}