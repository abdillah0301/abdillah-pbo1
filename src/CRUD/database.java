
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.Statement;
 
/** 
 * 
 * @author abdlh 
 */ 
public class database { 
    private String databaseName = "abdillah_2210010306"; 
    private String username = "root"; 
    private String password = ""; 
    public static Connection connectionDB; 
     
    public database(){ 
        try { 
           String location = "jdbc:mysql://localhost/"+databaseName; 
           Class.forName("com.mysql.jdbc.Driver"); 
            
           connectionDB = DriverManager.getConnection(location, username, password);     
           System.out.println("Sistem Terkoneksi"); 
        } 
        catch (Exception e){ 
            System.out.println(e.getMessage()); 
        } 
    }
    public void simpanKonsumen(int id, int user, String nama, String alamat, String telpon){
    try{
        String sql = "insert into konsumen (id, user, nama, alamat, telpon) values (?,?,?,?,?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, id);
        perintah.setInt(2, user);
        perintah.setString(3, nama);
        perintah.setString(4, alamat);
        perintah.setString(5, telpon);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Disimpan");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
public void ubahKonsumen(int id, int user, String nama, String alamat, String telpon){
    try{
        String sql = "update konsumen set user = ?, nama = ?, alamat = ?, user = ? where id = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, user);
        perintah.setString(2, nama);
        perintah.setString(3, alamat);
        perintah.setString(4, telpon);
        perintah.setInt(5, id);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Diubah");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
public void hapusKonsumen(int id){
    try{
        String sql = "delete from konsumen where id = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, id);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void cariKonsumen(int id){
        try{
            String sql = "select*from konsumen where id=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id);
            ResultSet data  = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID Konsumen  : "+data.getString("id"));
                System.out.println("Username     : "+data.getString("user"));
		System.out.println("Nama Konsumen: "+data.getString("nama"));
		System.out.println("Alamat       : "+data.getString("alamat"));
	        System.out.println("Telepon      : "+data.getString("telpon"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void showKonsumen(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from konsumen order by id  asc");
            while(baris.next()){
                System.out.println(baris.getString("id")+" | "+
                                   baris.getString("user")+" | "+
                                   baris.getString("nama")+" | "+
                                   baris.getString("alamat")+" | "+
                                   baris.getString("telpon"));
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
public void simpanUser(int idUser, int owner, int password, String email, String namaUser){
    try{
        String sql = "insert into user (id_user, owner, password, email, nama_user) values (?,?,?,?,?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idUser);
        perintah.setInt(2, owner);
        perintah.setInt(3, password);
        perintah.setString(4, email);
        perintah.setString(5, namaUser);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Disimpan");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
public void ubahUser(int idUser, int owner, int password, String email, String namaUser){
    try{
        String sql = "update user set owner = ?, password = ?, email = ?, nama_user = ? where id_user = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, owner);
        perintah.setInt(2, password);
        perintah.setString(3, email);
        perintah.setString(4, namaUser);
        perintah.setInt(5, idUser);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Diubah");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
public void hapusUser(int idUser){
    try{
        String sql = "delete from user where id_user = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idUser);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void cariUser(int idUser){
        try{
            String sql = "select*from user where id_user=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, idUser);
            ResultSet data  = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID User  : "+data.getString("id_user"));
                System.out.println("Owner    : "+data.getString("owner"));
		System.out.println("Password : "+data.getString("password"));
		System.out.println("Email    : "+data.getString("email"));
	        System.out.println("Nama User: "+data.getString("nama_user"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void showUser(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from user order by id_user  asc");
            while(baris.next()){
                System.out.println(baris.getString("id_user")+" | "+
                                   baris.getString("owner")+" | "+
                                   baris.getString("password")+" | "+
                                   baris.getString("email")+" | "+
                                   baris.getString("nama_user"));
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
public void simpanOwner(int idOwner, String namaOwner, String email, int password, String noTelpon, String alamat){
    try{
        String sql = "insert into owner (id_owner, nama_owner, email, password, no_telpon, alamat) values (?,?,?,?,?,?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idOwner);
        perintah.setString(2, namaOwner);
        perintah.setString(3, email);
        perintah.setInt(4, password);
        perintah.setString(5, noTelpon);
        perintah.setString(6, alamat);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Disimpan");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
public void ubahOwner(int idOwner, String namaOwner, String email, int password, String noTelpon, String alamat){
    try{
        String sql = "update owner set nama_owner = ?, email = ?, password = ?, no_telpon = ?, alamat = ? where id_owner = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, namaOwner);
        perintah.setString(2, email);
        perintah.setInt(3, password);
        perintah.setString(4, noTelpon);
        perintah.setString(5, alamat);
        perintah.setInt(6, idOwner);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Diubah");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
public void hapusOwner(int idOwner){
    try{
        String sql = "delete from owner where id_owner = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idOwner);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void cariOwner(int idOwner){
        try{
            String sql = "select*from owner where id_owner=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, idOwner);
            ResultSet data  = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID Owner     : "+data.getString("id_owner"));
                System.out.println("Nama Owner   : "+data.getString("nama_owner"));
		System.out.println("Email        : "+data.getString("email"));
		System.out.println("Password     : "+data.getString("password"));
	        System.out.println("Telepon      : "+data.getString("no_telpon"));
	        System.out.println("Alamat       : "+data.getString("alamat"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void showOwner(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from owner order by id_owner  asc");
            while(baris.next()){
                System.out.println(baris.getString("id_owner")+" | "+
                                   baris.getString("nama_owner")+" | "+
                                   baris.getString("email")+" | "+
                                   baris.getString("password")+" | "+
                                   baris.getString("no_telpon")+" | "+
                                   baris.getString("alamat"));
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
public void simpanJenisBarang(int id, String jenisBarang){
    try{
        String sql = "insert into jenisbarang (id, jenisbarang) values (?,?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, id);
        perintah.setString(2, jenisBarang);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Disimpan");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
public void ubahJenisBarang(int id, String jenisBarang){
    try{
        String sql = "update jenisbarang set jenisbarang = ? where id = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, jenisBarang);
        perintah.setInt(2, id);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Diubah");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
public void hapusJenisBarang(int id){
    try{
        String sql = "delete from jenisbarang where id = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, id);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
public void cariJenisBarang(int id){
        try{
            String sql = "select*from jenisbarang where id=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id);
            ResultSet data  = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID           : "+data.getString("id"));
                System.out.println("Jenis Barang : "+data.getString("jenisbarang"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void showJenisBarang(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from jenisbarang order by id  asc");
            while(baris.next()){
                System.out.println(baris.getString("id")+" | "+
                                   baris.getString("jenisbarang"));
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
