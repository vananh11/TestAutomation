package org.example;

    public class KhoiB extends SinhVien {
            public float Toan;
            public float Hoa;
            public float Sinh;

            public KhoiB (int SBD, String hoTen, String diachi, int mucUuTien, float diemtoan, float diemhoa, float diemsinh){
                super(SBD, hoTen, diachi, mucUuTien);
                this.Toan = diemtoan;
                this.Hoa = diemhoa;
                this.Sinh = diemsinh;
            }
        public String toString() {
            return SBD + " " + getHoTen() + " " + getDiachi() + " " + getMucUuTien() + " " + Toan + " " + Hoa + " " + Sinh + " " ;
        }

            public float getToan() {
                return Toan;
            }

            public void setToan(float toan) {
                this.Toan = toan;
            }

            public float getHoa() {
                return Hoa;
            }

            public void setHoa(float hoa) {
                this.Hoa = hoa;
            }

            public float getSinh() {
                return Sinh;
            }

            public void setSinh(float sinh) {
                this.Sinh = sinh;
            }
        }

