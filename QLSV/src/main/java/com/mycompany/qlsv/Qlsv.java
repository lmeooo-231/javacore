/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qlsv;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Qlsv {

    public class Main {
    public static void main(String[] args) {
        // 1. 3 sinh viên đầu tiên
        try (Scanner sc = new Scanner(System.in)) {
            // 1. 3 sinh viên đầu tiên
             //1
            SinhVien sv1 = new SinhVien("SV001", "Nguyen Van A", 8.0, 7.5, 9.0);
            //2
            SinhVien sv2 = new SinhVien();
            sv2.setMaSV("SV002");
            sv2.setHoTen("Tran Thi B");
            sv2.setDiem1(6.0);
            sv2.setDiem2(7.0);
            sv2.setDiem3(5.5);
            //3
            SinhVien sv3 = sv1;
            
            // 2. Nhập mảng sinh viên
            System.out.print("Nhap so luong sinh vien: ");
            int n = sc.nextInt(); sc.nextLine();
            SinhVien[] danhSach = new SinhVien[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap sinh vien thu " + (i+1));
                danhSach[i] = new SinhVien();
                danhSach[i].nhap(sc);
            }
            
            // 3. In danh sách sinh viên
            System.out.println("\nDANH SACH SINH VIEN:");
            inTieuDe();
            for (SinhVien sv : danhSach) {
                sv.inThongTin();
            }
            
            // 4. Sắp xếp tăng dần theo điểm TB
            Arrays.sort(danhSach, Comparator.comparingDouble(SinhVien::diemTB));
            System.out.println("\nDANH SACH SAU KHI SAP XEP TANG DAN DIEM TB:");
            inTieuDe();
            for (SinhVien sv : danhSach) {
                sv.inThongTin();
            }
            
            // 5. Tìm theo tên
            System.out.print("\nNhap ten can tim: ");
            String tenTim = sc.nextLine().toLowerCase();
            System.out.println("Danh sach sinh vien co ten \"" + tenTim + "\":");
            inTieuDe();
            for (SinhVien sv : danhSach) {
                if (sv.getHoTen().toLowerCase().contains(tenTim)) {
                    sv.inThongTin();
                }
            }
            
            // 6. In danh sách SV có điểm trung bình < 5
            System.out.println("\nDanh sach sinh vien co diem trung binh < 5:");
            inTieuDe();
            for (SinhVien sv : danhSach) {
                if (sv.diemTB() < 5.0) {
                    sv.inThongTin();
                }
            }
        }
    }

    static void inTieuDe() {
        System.out.printf("%-10s %-20s %-6s %-6s %-6s %-8s %-12s\n",
            "MaSV", "Ho Ten", "Diem1", "Diem2", "Diem3", "DiemTB", "XepLoai");
        System.out.println("---------------------------------------------------------------");
    }
    }
    
}
