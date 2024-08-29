package com.example.demo2;

public class xedata {
    private String id,bienso, masv, loaixe,mota;
    private Integer giathue,dadong;

    public xedata(String id,String bienso, String masv, String loaixe, String mota, Integer giathue, Integer dadong){
        this.id=id;
        this.bienso=bienso;
        this.masv=masv;
        this.loaixe=loaixe;
        this.mota=mota;
        this.giathue=giathue;
        this.dadong=dadong;
    }

    public String getBienso() {
        return bienso;
    }
    public String getId() {
        return id;
    }

    public Integer getDadong() {
        return dadong;
    }

    public Integer getGiathue() {
        return giathue;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public String getMasv() {
        return masv;
    }

    public String getMota() {
        return mota;
    }
}
