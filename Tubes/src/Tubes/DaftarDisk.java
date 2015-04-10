package Tubes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author A46C
 */
public class DaftarDisk {

    private Disk disk[] = new Disk[1000];
    private int jumlahLagu = 0;/*
     ini angkanya harus 3
     */

    private int jumlahFilm = 0;/*
     ini angkanya harus 3
     */

    private int jumlahDisk = 0;/*
     ini angkanya harus 3
     */


    public void addDisk(Disk d) {

        if (d.getTipe() == "Lagu") {
            disk[jumlahDisk] = d;
            jumlahDisk++;
            jumlahLagu++;
            String id = "LG" + jumlahLagu;
            d.setIdDisk(id);/*
             ini angkanya harus 3
             */

        } else if (d.getTipe() == "Film") {
            disk[jumlahDisk] = d;
            jumlahDisk++;
            jumlahFilm++;
            String id = "FL" + jumlahFilm;
            d.setIdDisk(id);/*
             ini angkanya harus 3
             */

        }

    }

    public Disk cariDisk(String judul) {
        int indeks = -1;
        for (int i = 0; i < jumlahDisk; i++) {
            if (disk[i].getJudul() == judul) {
                indeks = i;
            }
        }
        if (indeks == -1) {
            return null;
        } else {
            return disk[indeks];
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < jumlahDisk; i++) {
            s = s + disk[i].toString() + "\n";
        }
        return s;
    }
}
