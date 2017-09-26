/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ENDRIAWAN
 */
public class MataKuliah {
    private  int kodeMk;
    private String namaMk;
    private int SKS;
    private Dosen[] dosenMk;

    public int getKodeMk() {
        return kodeMk;
    }

    public void setKodeMk(int kodeMk) {
        this.kodeMk = kodeMk;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public void setNamaMk(String namaMk) {
        this.namaMk = namaMk;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }
    
    public void addDosen(Dosen d){ //belum selesai
        dosenMk[jumlahdosen]=d;
    }
    public int getDosenByIdx(int idx){ //belum selesai
        return dosenMk[idx];
    }
}
