/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author asus
 */
public class user {
    private int idUser; // Changed from idKonsumen to idUser
    private int owner; // New field to replace noKTP
    private int password; // New field to replace namaKonsumen
    private String email; // Changed from hpKonsumen to email
    private String namaUser; // Changed from alamatKonsumen to namaUser

    public user(int idUser, int owner, int password, String email, String namaUser) {
        this.idUser = idUser;
        this.owner = owner;
        this.password = password;
        this.email = email;
        this.namaUser = namaUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getOwner() {
        return owner;
    }

    public int getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getNamaUser() {
        return namaUser;
    }
}

