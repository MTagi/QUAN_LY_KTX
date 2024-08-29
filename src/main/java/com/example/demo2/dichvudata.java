package com.example.demo2;

public class dichvudata {
    private String id,name,chucnang;
    private Integer giatien;

    public dichvudata(String id,String name, String chucnang, Integer giatien){
        this.id=id;
        this.name=name;
        this.chucnang=chucnang;
        this.giatien=giatien;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Integer getGiatien() {
        return giatien;
    }

    public String getChucnang() {
        return chucnang;
    }
}
