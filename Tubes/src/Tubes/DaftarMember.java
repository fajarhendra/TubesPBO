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
public class DaftarMember {

    private Member member[] = new Member[500];
    private int jumlahMember = 0;
    /*
     tanya gimana cara memperlihatkan 3 angka, contoh : 001, 002, dll..
     */

    public void addMember(Member m) {
        member[jumlahMember] = m;
        jumlahMember++;
        String id = "M" + jumlahMember;
        m.setIdMember(id);/*
         ini angkanya harus 3
         */

    }

    public Member cariMember(String nama) {
        int indeks = -1;
        for (int i = 0; i < jumlahMember; i++) {
            if (member[i].getNama().equals(nama)) {
                indeks = i;
            }
        }
        if (indeks == -1) {
            return null;
        } else {
            return member[indeks];
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < jumlahMember; i++) {
            s = s + member[i].toString() + "\n";
        }
        return s;
    }
}
