package org.example;

public class KhoiC extends SinhVien {
    public float Van;
    public float Su;
    public float Dia;

    public KhoiC(int SBD, String hoTen, String diachi, int mucUuTien, float diemvan, float diemsu, float diemdia) {
        super(SBD, hoTen, diachi, mucUuTien);
        this.Dia = diemdia;
        this.Van = diemvan;
        this.Su = diemsu;
    }

    public String toString() {
        return SBD + " " + getHoTen() + " " + getDiachi() + " " + getMucUuTien() + " " + Van + " " + Su + " " + Dia + " " ;
    }
    public float getVan() {
        return Van;
    }

    public void setVan(float van) {
        this.Van = van;
    }

    public float getSu() {
        return Su;
    }

    public void setSu(float su) {
        this.Su = su;
    }

    public float getDia() {
        return Dia;
    }

    public void setDia(float dia) {
        this.Dia = dia;
    }
}
