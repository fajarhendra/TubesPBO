package Tubes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class AlbumMusik extends Disk {

    private Lagu lagu[] = new Lagu[10];
    private int nLagu = 0;
    private Scanner s;

    public AlbumMusik(String judulDisk, String tipeDisk, int stokDisk) {
        super(judulDisk, tipeDisk, stokDisk);
    }

    public void addLagu(Lagu l) {
        /*
         menambahkan lagu kedalam array class Lagu + exception
         */
        try {
            if (nLagu <= 9) {
                lagu[nLagu] = l;
                nLagu++;
            } else {
                throw new IllegalArgumentException("Daftar Lagu Sudah Penuh");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getnLagu() {
        return nLagu;
    }

    public String tampilSemuaLagu() {//menampilkan daftar data lagu.
        String s = "";
        for (int i = 0; i < nLagu; i++) {
            s = s + lagu[i].toString() + "\n";
        }
        return s;
    }

}
