/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlsv;

/**
 *
 * @author PC
 */
import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String hoTen;
    private double diem1, diem2, diem3;

    // Constructors
    public SinhVien() {}

    public SinhVien(String maSV, String hoTen, double diem1, double diem2, double diem3) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    // Getters và Setters
    public String getMaSV() { return maSV; }
    public void setMaSV(String maSV) { this.maSV = maSV; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public double getDiem1() { return diem1; }
    public void setDiem1(double diem1) { this.diem1 = diem1; }

    public double getDiem2() { return diem2; }
    public void setDiem2(double diem2) { this.diem2 = diem2; }

    public double getDiem3() { return diem3; }
    public void setDiem3(double diem3) { this.diem3 = diem3; }

    // Nhập thông tin
    public void nhap(Scanner sc) {
        System.out.print("Nhap ma SV: ");
        maSV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem 1: ");
        diem1 = sc.nextDouble();
        System.out.print("Nhap diem 2: ");
        diem2 = sc.nextDouble();
        System.out.print("Nhap diem 3: ");
        diem3 = sc.nextDouble();
        sc.nextLine(); // bỏ dòng thừa
    }

    // Tính điểm trung bình
    public double diemTB() {
        return Math.round((diem1 + diem2 + diem3) / 3 * 100.0) / 100.0;
    }

    // Xếp loại
    public String xepLoai() {
        double dtb = diemTB();
        if (dtb >= 8) return "Gioi";
        else if (dtb >= 7) return "Kha";
        else if (dtb >= 5) return "Trung Binh";
        else return "Yeu";
    }

    // In thông tin
    public void inThongTin() {
        System.out.printf("%-10s %-20s %6.2f %6.2f %6.2f %8.2f %-12s\n", 
            maSV, hoTen, diem1, diem2, diem3, diemTB(), xepLoai());
    }
}