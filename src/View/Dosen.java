/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Yoga Widi Pamungkas
 */
public class Dosen {
    private int kodeDosen;
    private  String namaDosen;
//    private Date tanggalLahir;
    private  String tempatLahir;
    private  String alamat;
    private char jk;
    private long noHp;

    public void setKodeDosen(int kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

//    public void setTanggalLahir(Date tanggalLahir) {
//        this.tanggalLahir = tanggalLahir;
//    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJk(char jk) {
        this.jk = jk;
    }

    public void setNoHp(long noHp) {
        this.noHp = noHp;
    }

    public int getKodeDosen() {
        return kodeDosen;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

//    public Date getTanggalLahir() {
//        return tanggalLahir;
//    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public char getJk() {
        return jk;
    }

    public long getNoHp() {
        return noHp;
    }
    
    
}
