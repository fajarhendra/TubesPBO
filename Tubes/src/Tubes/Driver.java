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
public class Driver {

    public static void main(String[] args) {

        Film F1 = new Film("Insidious", "Film", "2012", "asdf", 120, 5);
        Film F2 = new Film("Fast Forious 7", "Film", "2015", "asdf", 120, 1);
        Film F3 = new Film("Cinderella", "Film", "2015", "asdf", 120, 1);
        AlbumMusik A1 = new AlbumMusik("V", "Lagu", 2);
        AlbumMusik A2 = new AlbumMusik("M", "Lagu", 2);
        Lagu l1 = new Lagu("Sugar", "Maroon 5", "2013");
        Lagu l2 = new Lagu("Animal", "Maroon 5", "2013");
        Lagu l3 = new Lagu("Maps", "Maroon 5", "2013");
        A1.addLagu(l1);
        A1.addLagu(l2);
        A1.addLagu(l3);
        DaftarDisk dd = new DaftarDisk();
        System.out.println("DaftarDisk");
        dd.addDisk(A2);
        System.out.println(A2.getIdDisk());
        dd.addDisk(A1);
        System.out.println(A1.getIdDisk());
        dd.addDisk(F1);
        System.out.println(F1.getIdDisk());
        dd.addDisk(F2);
        System.out.println(F2.getIdDisk());
        dd.addDisk(F3);
        System.out.println(F3.getIdDisk());
        System.out.println(dd.toString());
        System.out.println(A1.toString());
        DaftarMember dm = new DaftarMember();
        Member member1 = new Member("Mufidah");
        System.out.println(member1.getNama());
        dm.addMember(member1);
        System.out.println(dm);
        System.out.println(member1.getIdMember());
        System.out.println(F1.toString());
        System.out.println(A1.tampilSemuaLagu());
        System.out.println("DataMember");
        System.out.println(dm.toString());
        Peminjaman p1 = new Peminjaman();
        Peminjaman p2 = new Peminjaman();
        Peminjaman p3 = new Peminjaman();
        p1.tambahPeminjaman("Mufidah", dm);
        p2.tambahPeminjaman("Mufidah", dm);
        p3.tambahPeminjaman("Mufidah", dm);
        System.out.println("TambahDisk");// ini kenapa isinya selalu Disk sudah di pinjam semua??
        p1.tambahDisk("M",dd);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        /*
         yang belum: 
         exception
         benerin null
        
         */

    }
}
