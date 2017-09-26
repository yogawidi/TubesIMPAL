/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author vebbyclrs
 */
public class Dosen {
    private int kode;
    private String nama;
    
    private Date tglLahir;
    
    private String tempatLahir;
    private String alamat;
    private boolean isMale;
    private long noHp;

    public Dosen(int kode, String nama, boolean isMale) {
        this.kode = kode;
        this.nama = nama;
        this.isMale = isMale;
    }

    public void setTglLahir(int tanggal, int bulan, int tahun) {
        this.tglLahir = new Date(tahun, bulan, tanggal);
    }

    public Date getTglLahir() {
        return tglLahir;
    }
    
    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public long getNoHp() {
        return noHp;
    }

    public void setNoHp(long noHp) {
        this.noHp = noHp;
    }
    
    
    
    
    
}
