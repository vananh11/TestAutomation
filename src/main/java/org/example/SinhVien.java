package org.example;

public class SinhVien {
    public int SBD;
    public String HoTen;
    public String Diachi;
    public int MucUuTien;

    public SinhVien(int SBD, String hoTen, String diachi, int mucUuTien) {
        this.SBD = SBD;
        this.HoTen = hoTen;
        this.Diachi = diachi;
        this.MucUuTien = mucUuTien;
    }
    public String toString() {
        return SBD + " " + getHoTen() + " " + getDiachi() + " " + getMucUuTien() + " ";
    }


    public void setSBD(int SBD) {
        this.SBD = SBD;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

    public void setDiachi(String diachi) {
        this.Diachi = diachi;
    }

    public void setMucUuTien(int mucUuTien) {
        this.MucUuTien = mucUuTien;
    }

    public int getSBD() {
        return SBD;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getDiachi() {
        return Diachi;
    }

    public int getMucUuTien() {
        return MucUuTien;
    }


}
