/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

public class briketarang {
    private int id;
    private String jenisBarang;
    private String nama;
    private String kualitas;
    private double hargaJual;
    private int jumlah;
    private int stok;

    public briketarang(int id, String jenisBarang, String nama, String kualitas, double hargaJual, int jumlah, int stok) {
        this.id = id;
        this.jenisBarang = jenisBarang;
        this.nama = nama;
        this.kualitas = kualitas;
        this.hargaJual = hargaJual;
        this.jumlah = jumlah;
        this.stok = stok;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKualitas() {
        return kualitas;
    }

    public void setKualitas(String kualitas) {
        this.kualitas = kualitas;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Jenis: " + jenisBarang + ", Nama: " + nama + ", Kualitas: " + kualitas + 
               ", Harga Jual: " + hargaJual + ", Jumlah: " + jumlah + ", Stok: " + stok;
    }
}

