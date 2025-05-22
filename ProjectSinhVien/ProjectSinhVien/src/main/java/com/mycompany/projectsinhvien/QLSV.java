/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectsinhvien;

/**
 *
 * @author ADMIN
 */
public class QLSV {
    public static void main(String[] args) {
        // Đối tượng 1: Nhập bằng constructor có tham số
        SinhVien sv1 = new SinhVien("SV001", "Nguyen Van A", "01/01/2000", 9.0, 8.5, 7.5);

        // Đối tượng 2: Nhập bằng setter
        SinhVien sv2 = new SinhVien();
        sv2.setMaSV("SV002");
        sv2.setHoten("Tran Thi B");
        sv2.setNgaysinh("02/02/2001");
        sv2.setDiemtoan(7.0);
        sv2.setDiemly(7.5);
        sv2.setDiemhoa(6.5);

        // Đối tượng 3: Nhập bằng phương thức nhập
        SinhVien sv3 = new SinhVien();
        System.out.println("Nhap thong tin SV 3:");
        sv3.nhapThongTin();

        // In thông tin 3 sinh viên
        System.out.println("\nThong tin SV 1 :");
        sv1.xuatThongTin();
        System.out.println("\nThong tin SV 2:");
        sv2.xuatThongTin();
        System.out.println("\nThong tin SV 3:");
        sv3.xuatThongTin();
    }
}
