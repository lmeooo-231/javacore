/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectsinhvien;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class SinhVien {
    private String MaSV;
    private String Hoten;
    private String Ngaysinh;
    private double Diemtoan;
    private double Diemly;
    private double Diemhoa;

    //  không tham số
    public SinhVien() {}

    //  có tham số
    public SinhVien(String maSV, String hoten, String ngaysinh, double diemtoan, double diemly, double diemhoa) {
        this.MaSV = maSV;
        this.Hoten = hoten;
        this.Ngaysinh = ngaysinh;
        this.Diemtoan = diemtoan;
        this.Diemly = diemly;
        this.Diemhoa = diemhoa;
    }

    // Getter và Setter
    public String getMaSV() {
        return MaSV;
    }
    
    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public double getDiemtoan() {
        return Diemtoan;
    }

    public void setDiemtoan(double diemtoan) {
        Diemtoan = diemtoan;
    }

    public double getDiemly() {
        return Diemly;
    }

    public void setDiemly(double diemly) {
        Diemly = diemly;
    }

    public double getDiemhoa() {
        return Diemhoa;
    }

    public void setDiemhoa(double diemhoa) {
        Diemhoa = diemhoa;
    }

    // Phương thức tính điểm trung bình
    public double tinhDiemTB() {
        return (Diemtoan + Diemly + Diemhoa) / 3;
    }

    // Phương thức xếp loại
    public String xepLoai() {
        double dtb = tinhDiemTB();
        if (dtb >= 8) {
            return "Gioi";
        } else if (dtb >= 7) {
            return "Kha";
        } else if (dtb >= 5) {
            return "TB";
        } else {
            return "Yeu";
        }
    }

    // Phương thức nhập thông tin
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("MSV: ");
        MaSV = scanner.nextLine();

        System.out.print("Ho Ten: ");
        Hoten = scanner.nextLine();

        System.out.print("Nhap ngay sinh (ngay/thang/nam): ");
        Ngaysinh = scanner.nextLine();

        System.out.print("Toan: ");
        Diemtoan = scanner.nextDouble();

        System.out.print("Ly: ");
        Diemly = scanner.nextDouble();

        System.out.print("Hoa: ");
        Diemhoa = scanner.nextDouble();
    }

    // Phương thức xuất thông tin
    public void xuatThongTin() {
        System.out.println("MSV: " + MaSV);
        System.out.println("Ho Ten: " + Hoten);
        System.out.println("Ngay sinh: " + Ngaysinh);
        System.out.println("Toan: " + Diemtoan);
        System.out.println("Ly: " + Diemly);
        System.out.println("Hoa: " + Diemhoa);
        System.out.printf("DTB: %.2f\n", tinhDiemTB());
        System.out.println("Xep loai: " + xepLoai());
    }
}
