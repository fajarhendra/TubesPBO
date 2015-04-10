package Tubes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 */
public class Member {

    private String nama;
    private String idMember;
    private String dataTransaksi;

    public Member(String nama) {
        this.nama = nama;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdMember() {
        return idMember;
    }

    @Override
    public String toString() {
        return "Member{" + "nama=" + nama + ", idMember=" + idMember + ", dataTransaksi=" + dataTransaksi + '}';
    }

}
