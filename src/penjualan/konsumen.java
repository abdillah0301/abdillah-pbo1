/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author asus
 */
public class konsumen {
    private int id;
    private int user; // Changed from noKTP to user
    private String nama; // Changed from namaKonsumen to nama
    private String telpon; // Changed from hpKonsumen to telpon
    private String alamat; // Changed from alamatKonsumen to alamat

    public konsumen(int id, int user, String nama, String telpon, String alamat) {
        this.id = id;
        this.user = user;
        this.nama = nama;
        this.telpon = telpon;
        this.alamat = alamat;
    }

    public int getId() {
        return id;
    }

    public int getUser() {
        return user;
    }

    public String getNama() {
        return nama;
    }

    public String getTelpon() {
        return telpon;
    }

    public String getAlamat() {
        return alamat;
    }
}

