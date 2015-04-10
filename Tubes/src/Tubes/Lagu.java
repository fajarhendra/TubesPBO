package Tubes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;

/**
 *
 * @author Dell
 */
public class Lagu {

    private String judulLagu;
    private String penyanyi;
    private String tglRelease;

    public Lagu(String judulLagu, String penyanyi, String tglRelease) {
        this.judulLagu = judulLagu;
        this.penyanyi = penyanyi;
        this.tglRelease = tglRelease;
    }
    /*
     method getter berguna dalam fungsi pencarian
     */

    public String getJudulLagu() {
        return judulLagu;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public String getTglRelease() {
        return tglRelease;
    }

    @Override
    public String toString() {//metnampilkan data lagu.
        return "Lagu{" + "judulLagu=" + judulLagu + ", penyanyi=" + penyanyi + ", tglRelease=" + tglRelease + '}';
    }

}
