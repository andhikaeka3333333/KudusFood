package com.example.kudusfood;

public class ModelKuliner {
    String nama,image,deskripsi;

    public ModelKuliner(String nama, String deskripsi, String image) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }
    public String getImage() {
        return image;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
