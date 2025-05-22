/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlnv;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Qlnv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // không ttham số
        String MaNV,HoTen;
        int NgayCong;
        double TienCong;
        System.out.println("nhap nhan vien thu nhat ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        MaNV = sc.nextLine();
        System.out.print("Nhap ho ten nhan vien: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap so ngay cong: ");
        NgayCong = sc.nextInt();
        System.out.print("Nhap tien cong ngay: ");
        TienCong = sc.nextDouble();
        nhanvien nv1 = new nhanvien(MaNV,HoTen,NgayCong,TienCong);
        //getter - setter
        System.out.println("nhap nhan vien thu 2");
        nhanvien nv2 = new nhanvien();
        System.out.print("nhap ma nhan vien:");
        nv2.setMaNV(sc.nextLine());
        System.out.print("nhap ho ten:");
        nv2.setHoTen(sc.nextLine());
        System.out.print("nhap so ngay cong:");
        nv2.setNgayCong(sc.nextInt());
        System.out.print("nhap tien cong ngay:");
        nv2.setTienCong(sc.nextDouble());
        //nhập thông tin
        nhanvien nv3 = new nhanvien();
        System.out.println("nhap thong tin nhan vien 3");
        nv3.NhapNhanVien();
        /*//có tham số
        nv3.NhapNhanVien();
        nhanvien nv4 = new nhanvien("nv01", "Nguyen Van A", 29, 500000);
        // In thông tin nhân viên
        System.out.println("\nThong tin NV 1 :");
        nv1.XuatThongTin();
        System.out.println("\nThong tin NV 2 :");
        nv2.XuatThongTin();
        System.out.println("\nThong tin NV 3 :");
        nv3.XuatThongTin();
        System.out.println("\nThong tin NV 4 :");
        nv4.XuatThongTin();*/
    }
    
}
