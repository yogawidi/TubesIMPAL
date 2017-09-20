/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Vebby Clarissa 1301150439
 */
public class Mahasiswa {
    private static int totalMahasiswa;
    private long nim;
    private String nama;
    private boolean isMale;
    private int tglLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String tempatLahir;
    private String alamat;
    private float ipk;
    private long noHp;
    private int angkatan;
    private boolean statusPembayaran;
    private String dosenWali;
//    private Jadwal jadwal;

    public Mahasiswa(String nama, boolean isMale, int tglLahir, int bulanLahir, int tahunLahir, String tempatLahir) {
        this.nim = ++totalMahasiswa;
        this.nama = nama;
        this.isMale = isMale;
        this.tglLahir = tglLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.tempatLahir = tempatLahir;
    }
    
    public long getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public int getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(int tglLahir) {
        this.tglLahir = tglLahir;
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
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

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public long getNoHp() {
        return noHp;
    }

    public void setNoHp(long noHp) {
        this.noHp = noHp;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(boolean statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public String getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(String dosenWali) {
        this.dosenWali = dosenWali;
    }

    
}
