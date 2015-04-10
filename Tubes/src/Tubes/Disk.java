package Tubes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Disk extends DaftarDisk {

    private String idDisk;
    private String judul;
    private String tipe;
    private long harga;
    private int stok;

    public Disk(String judulDisk, String tipeDisk, int stokDisk) {

        if ((tipeDisk.equals("Film")) || (tipeDisk.equals("Lagu"))) {
            this.judul = judulDisk;
            this.stok = stok;
            this.tipe = tipeDisk;
        } else {
            throw new IllegalArgumentException("Tipe Disk harus di isi 'Film' atau 'Lagu'");
        }
    }

    public String getJudul() {
        return judul;
    }

    public int getStok() {
        return stok;
    }

    public String getTipe() {
        return tipe;
    }

    public String getIdDisk() {
        return idDisk;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setIdDisk(String idDisk) {
        this.idDisk = idDisk;
    }

    @Override
    public String toString() {//untuk menampilkan Disk saja.
        return "CD_DVD{" + "idDisk=" + idDisk + ", judul=" + judul + ", tipe=" + tipe + ", harga=" + harga + ", stok=" + stok + '}';
    }

}
