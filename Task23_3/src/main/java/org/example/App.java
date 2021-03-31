package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<SinhVien> lstSinhVien = new ArrayList<SinhVien>();
        SinhVien sv1 = new SinhVien(1, "Nguyen Van Anh", "Tran Duy Hung", 1);
        KhoiA sv2 = new KhoiA(1, "Nguyen Thi Hanh", "Tran Duy Hung", 1,2 , 6, 4);
        KhoiB sv3 = new KhoiB(1, "Pham Thuy Anh", "Tran Duy Hung", 1, 4, 5, 4);
        KhoiC sv4 = new KhoiC(1, "Vu Kim Dung", "Tran Duy Hung", 1,1,2,3);;
        KhoiA sv5 = new KhoiA(5, "Do Van Hai", "Tran Duy Hung", 7,7,6,7);
        KhoiB sv6 = new KhoiB(6, "Dinh Hoang Long", "Tran Duy Hung", 6,6,5,6);
        KhoiC sv7 = new KhoiC(7, "Phung Van Hoang", "Tran Duy Hung", 2,6,5,4);
        KhoiA sv8 = new KhoiA(8, "Pham Thi Minh Phuong", "Tran Duy Hung7", 8,7,6,7);
        KhoiB sv9 = new KhoiB(9, "Nguyen Thi Van Anh", "Tran Duy Hung", 10,6,5,6);
        KhoiA sv10 = new KhoiA(10, "Nguyen Nhu Yen", "Tran Duy Hung", 9,6,7,7);
        lstSinhVien.add(sv1);
        lstSinhVien.add(sv2);
        lstSinhVien.add(sv3);
        lstSinhVien.add(sv4);
        lstSinhVien.add(sv5);
        lstSinhVien.add(sv6);
        lstSinhVien.add(sv7);
        lstSinhVien.add(sv8);
        lstSinhVien.add(sv9);
        lstSinhVien.add(sv10);
        for (SinhVien sv:lstSinhVien) {
            if (sv instanceof KhoiA) {
                if (((KhoiA) sv).Toan + ((KhoiA) sv).Hoa + ((KhoiA) sv).Ly >= 15 ) System.out.println(sv.toString());
            }
            else if (sv instanceof KhoiB) {
                if (((KhoiB) sv).Toan + ((KhoiB) sv).Hoa + ((KhoiB) sv).Sinh >= 15 ) System.out.println(sv.toString());
            }
            else if (sv instanceof KhoiC) {
                if (((KhoiC) sv).Van + ((KhoiC) sv).Su + ((KhoiC) sv).Dia >= 15 ) System.out.println(sv.toString());
            }

        }
    }

}