/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author asus
 */
public class jenisbarang {
    private int id; // Changed from idKonsumen to id
    private String jenisBarang; // Changed to jenisBarang and use String to represent enum values

    public jenisbarang(int id, String jenisBarang) {
        this.id = id;
        this.jenisBarang = jenisBarang;
    }

    public int getId() {
        return id;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }
}
