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
public class Film extends Disk {

    private String tahunRelease;
    private String sutradara;
    private int durasi;

    public Film(String JudulFilm, String tipeDisk, String tahunRelease, String sutradara, int durasi, int stok) {
        super(JudulFilm, tipeDisk, stok);
        this.tahunRelease = tahunRelease;
        this.sutradara = sutradara;
        this.durasi = durasi;
    }
    /*
     method getter berguna dalam fungsi pencarian
     */

    public String getTahunRelease() {
        return tahunRelease;
    }

    public int getDurasi() {
        return durasi;
    }

}
