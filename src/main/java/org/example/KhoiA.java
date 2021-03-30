package org.example;

public class KhoiA extends SinhVien {
    public float Toan;
    public float Ly;
    public float Hoa;

    public KhoiA(int SBD, String hoTen, String diachi, int mucUuTien, float diemtoan, float diemhoa, float diemly) {
        super(SBD, hoTen, diachi, mucUuTien);
        this.Toan = diemtoan;
        this.Hoa = diemhoa;
        this.Ly = diemly;
    }

    public String toString() {
        return SBD + " " + getHoTen() + " " + getDiachi() + " " + getMucUuTien() + " " + Toan + " " + Hoa + " " + Ly + " ";
    }

    public float getToan() {
        return Toan;
    }

    public void setToan(float toan) {
        this.Toan = toan;
    }

    public float getLy() {
        return Ly;
    }

    public void setLy(float ly) {
        this.Ly = ly;
    }

    public float getHoa() {
        return Hoa;
    }

    public void setHoa(float hoa) {
        this.Hoa = hoa;
    }

}

