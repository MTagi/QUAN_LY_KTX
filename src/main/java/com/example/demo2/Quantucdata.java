package com.example.demo2;

public class Quantucdata {

        private String id, name, gioitinh, sodt,vaitro;
        private Integer luong;

        public Quantucdata(String id, String name, String gioitinh, String sodt, String vaitro, Integer luong){
            this.id=id;
            this.name=name;
            this.gioitinh=gioitinh;
            this.sodt=sodt;
            this.vaitro=vaitro;
            this.luong=luong;
        }

    public String getVaitro() {
        return vaitro;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public  Integer getLuong() {
        return luong;
    }

    public  String getSodt() {
        return sodt;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
