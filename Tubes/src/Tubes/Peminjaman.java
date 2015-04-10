package Tubes;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author A46C
 */
public class Peminjaman {

    private String idPeminjaman;
    private Date tglPinjam;
    private Date tglKembali;
    private String idMember;
    private float totalHarga;
    private float denda;
    private Disk[] pinjam;
    private final int maxDisk = 4;
    private int nPinjam = 0;
    private Member member;
    //private DaftarMember dataM;
    private DaftarDisk dataD;
    private static int jmlPeminjaman = 0;

    public Peminjaman() {
    }

    public void tambahPeminjaman(String nama, DaftarMember dataM) {
        member = dataM.cariMember(nama);
        idMember = member.getIdMember();
        if (idMember != null) {
            jmlPeminjaman++;
            idPeminjaman = "P" + jmlPeminjaman;
            tglPinjam = new Date();
            pinjam = new Disk[5];
        } else {
            throw new IllegalArgumentException("Member belum terdaftar, daftar terlebih dahulu !!");
        }
    }

    public void tambahDisk(String judul, DaftarDisk dd) {
        try {
            if (nPinjam <= maxDisk) {
                if (dd.cariDisk(judul) != null) {
                    if (dd.cariDisk(judul).getStok() != 0) {
                        pinjam[nPinjam] = dd.cariDisk(judul);
                        nPinjam++;
                        int stok = dd.cariDisk(judul).getStok() - 1;
                        dd.cariDisk(judul).setStok(stok);
                    } else {
                        throw new IllegalArgumentException("Disk sudah dipinjam semua");
                    }
                } else {
                    throw new IllegalArgumentException("Disk yang dicari tidak ditemukan");
                }
            } else {
                throw new IllegalArgumentException("Anda sudah meminjam 5 disk");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public Disk cariDisk(String judul) {
        int indeks = -1;
        for (int i = 0; i < maxDisk; i++) {
            if (pinjam[i].getJudul() == judul) {
                indeks = i;
            }
        }
        if (indeks == -1) {
            return null;
        } else {
            return pinjam[indeks];
        }
    }

    public void kembalikanDisk(String judul) {
        Disk kembali = cariDisk(judul);
        try {
            if (kembali != null) {
                int stok = dataD.cariDisk(judul).getStok() + 1;
                dataD.cariDisk(judul).setStok(stok);
                kembali = null;
                tglKembali = new Date();
            } else {
                throw new IllegalArgumentException("Disk yang mau dikembalikan tidak dipinjam");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public long hitungDenda() {
        long hari1 = tglPinjam.getTime();
        long hari2 = tglKembali.getTime();
        long selisih = hari1 - hari2;
        long lama = selisih / (24 * 60 * 60);
        if (lama <= 3) {
            return 0;
        } else {
            return (lama - 3) * 2000;
        }
    }

    public long totalBiaya() {
        long total = 0;
        for (int i = 0; i <= nPinjam; i++) {
            if (pinjam[i].getTipe().equals("Lagu")) {
                total = total + 5000;
            } else if (pinjam[i].getTipe().equals("Film")) {
                total = total + 7000;
            } else {
                throw new IllegalArgumentException("Tipe salah");
            }
        }
        return total + hitungDenda();
    }

    @Override
    public String toString() {
        return "Peminjaman{" + "idPeminjaman=" + idPeminjaman + ", tglPinjam=" + tglPinjam + ", idMember=" + idMember + '}';
    }

}
