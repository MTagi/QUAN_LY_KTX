package com.example.demo2;

import java.util.Date;

public class yeucaudata {
        private String id,name,gioitinh,sodt, quequan,sophong, anh;
        private Date ngaysinh;
        public yeucaudata(String id, String name, String gioitinh, Date ngaysinh, String quequan,String sodt, String sophong, String anh){
            this.id=id;
            this.name=name;
            this.gioitinh=gioitinh;
            this.ngaysinh=ngaysinh;
            this.quequan=quequan;
            this.sophong=sophong;
            this.sodt=sodt;
            this.anh=anh;
        }

        public String getSodt() {
            return sodt;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public String getGioitinh() {
            return gioitinh;
        }

        public Date getNgaysinh() {
            return ngaysinh;
        }

        public String getAnh() {
            return anh;
        }

        public String getQuequan() {
            return quequan;
        }

        public String getSophong() {
            return sophong;
        }



}
