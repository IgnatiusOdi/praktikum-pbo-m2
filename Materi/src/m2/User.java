package m2;

import java.util.ArrayList;

public class User {
    private String username, password, nama, toko, alamat, tipe;
    private int saldo;

    public User(String username, String password, String nama, String toko, String alamat, String tipe) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.toko = toko;
        this.alamat = alamat;
        this.tipe = tipe;
        if(this.tipe.equals("Pembeli")){
            saldo = 100000;
        }
    }

    public void addPembeli(String username, String password, String nama, String alamat) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.tipe = "Pembeli";
    }

    public void addPenjual(String username, String password, String nama, String alamat){
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.toko = toko;
        this.alamat = alamat;
        this.tipe = "Penjual";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getToko() {
        return toko;
    }

    public void setToko(String toko) {
        this.toko = toko;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
