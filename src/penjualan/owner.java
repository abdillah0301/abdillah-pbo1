/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author asus
 */
public class owner {
    private int idOwner; // Changed from idKonsumen to idOwner
    private String namaOwner; // Changed from namaKonsumen to namaOwner
    private String email; // Changed from noKTP to email
    private int password; // Changed from hpKonsumen to password
    private String noTelpon; // Changed from alamatKonsumen to noTelpon
    private String alamat; // Changed from alamatKonsumen to alamat

    public owner(int idOwner, String namaOwner, String email, int password, String noTelpon, String alamat) {
        this.idOwner = idOwner;
        this.namaOwner = namaOwner;
        this.email = email;
        this.password = password;
        this.noTelpon = noTelpon;
        this.alamat = alamat;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public String getNamaOwner() {
        return namaOwner;
    }

    public String getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public String getAlamat() {
        return alamat;
    }
}

