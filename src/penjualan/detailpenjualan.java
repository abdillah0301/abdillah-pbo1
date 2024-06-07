/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

public class detailpenjualan extends briketarang {
    private int faktur;
    private int userId;
    private double disc;

    public detailpenjualan(int faktur, int userId, int id, String jenisBarang, String nama, String kualitas, double hargaJual, int jumlah, int stok, double disc) {
        super(id, jenisBarang, nama, kualitas, hargaJual, jumlah, stok);
        this.faktur = faktur;
        this.userId = userId;
        this.disc = disc;
    }

    // Getter dan Setter
    public int getFaktur() {
        return faktur;
    }

    public void setFaktur(int faktur) {
        this.faktur = faktur;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getDisc() {
        return disc;
    }

    public void setDisc(double disc) {
        this.disc = disc;
    }
    
    @Override
    public String toString() {
        return "Faktur: " + faktur + ", User ID: " + userId + ", " + super.toString() + ", Diskon: " + disc;
    }
}
