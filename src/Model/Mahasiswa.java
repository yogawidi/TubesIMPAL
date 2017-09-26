/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vebby Clarissa 1301150439
 */
public class Mahasiswa {
    private static int totalMahasiswa;
    private int totalSKS; //di awal di set 0
    private long nim;
    private String nama;
    private boolean isMale;
    private Date tanggalLahir;
    private String tempatLahir;
    private String alamat;
//    private float ipk;
    private long noHp;
    private int angkatan;
    private boolean statusPembayaran;
    private Dosen dosenWali;
    private ArrayList<Jadwal> jadwal;

    public Mahasiswa(String nama, boolean isMale, int tglLahir, int bulanLahir, int tahunLahir, String tempatLahir) {
        this.nim = ++totalMahasiswa;
        this.nama = nama;
        this.isMale = isMale;
        setTanggalLahir(tglLahir, bulanLahir, tahunLahir);
        this.tempatLahir = tempatLahir;
        this.totalSKS = 0;
    }
    private void test () {
        System.out.println("nannana");
    }

    public final void setTanggalLahir(int tanggal, int bulan, int tahun) {
        this.tanggalLahir = new Date(tahun,bulan,tanggal);
    }
    public Date getTanggalLahir () {
        return tanggalLahir;
    }
    
    public void setDosenWali(Dosen d) {
        this.dosenWali = d;
    }
    public Dosen getDosenWali () {
        return this.dosenWali;
    }
    public boolean addJadwal(Jadwal j) {
        if (totalSKS + j.getMatkul().getSKS() <= 24) {
            this.totalSKS += j.getMatkul().getSKS();
            jadwal.add(j);
            return true;
        } else {
            return false;
        }
    }
    public Jadwal getJadwalByIdx (int i) {
        return this.jadwal.get(i);
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
    
}
