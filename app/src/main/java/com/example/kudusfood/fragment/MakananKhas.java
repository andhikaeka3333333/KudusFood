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
import com.example.kudusfood.adapter.AdapterMakananKhas;

import java.util.ArrayList;
import java.util.List;

public class MakananKhas extends Fragment{

    List<ModelKuliner> items;
    RecyclerView recyclerView;
    AdapterMakananKhas adapter;

    public MakananKhas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_makanan_khas, container, false);

        View view = inflater.inflate(R.layout.fragment_makanan_khas, container, false);

        items = new ArrayList<ModelKuliner>();

        // Add items to the list
        items.add(new ModelKuliner("Soto Kudus", "Soto Kudus dibuat dari daging kerbau yang dimasak dengan aneka bumbu rempah hingga aromanya wangi dan matang.", "https://o-cdn-cas.sirclocdn.com/parenting/images/makanan-khas-kudus.width-800.format-webp.webp"));
        items.add(new ModelKuliner("Lentog Tanjung", "Lentog tanjung dibuat dari bahan dasar lontong yang diiris, tahu cokelat yang dipotong, sayur gori, dan kani.", "https://o-cdn-cas.sirclocdn.com/parenting/images/Lentog_Tanjung.width-800.format-webp.webp"));
        items.add(new ModelKuliner("Opor Sunggingan", "Jadi, ayam akan dimasak dalam keadaan utuh dengan bumbu yang dimasukkan ke dalam rongga perut ayam, dan diberi kuah opor.", "https://o-cdn-cas.sirclocdn.com/parenting/images/Opor_Ayam_Bakar_Kudus.width-800.format-webp.webp"));
        items.add(new ModelKuliner("Jenang", "Jenang Kudus adalah makanan khas Kudus yang dibuat dari bahan dasar tepung beras ketan, dan diberi gula.", "https://www.wowkeren.com/display/images/photo/2021/01/07/00346668s2.jpg"));
        items.add(new ModelKuliner("Pecel Pakis", "makanan ini terbuat dari bahan dasar daun pakis yang tumbuh di lereng Gunung Muria, dan disiram menggunakan bumbu kacang.", "https://o-cdn-cas.sirclocdn.com/parenting/images/Pecel_Pakis_Colo.width-800.format-webp.webp"));
        items.add(new ModelKuliner("Nasi Pindang", "Nasi pindang ini dibuat dari bahan dasar daging kerbau yang dimasak dengan rempah-rempah dan diberi topping daun melinjo.", "https://o-cdn-cas.sirclocdn.com/parenting/images/Nasi_Pindang_Kudus.width-800.format-webp.webp"));

        // Find the RecyclerView in the fragment's layout
        recyclerView = view.findViewById(R.id.rvMakananKhas);

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new AdapterMakananKhas(items, requireContext());
        recyclerView.setAdapter(adapter);
        return view;
    }

}