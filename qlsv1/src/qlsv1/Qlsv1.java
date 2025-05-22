/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsv1;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class Qlsv1 {
    public static void main(String[] args) {
        // Đối tượng 1: Nhập bằng constructor có tham số
        sinhvien sv1 = new sinhvien("SV01", "Nguyen Van A", LocalDate.of(2005, 5, 11), 9.0, 9.5, 8.0);

        // Đối tượng 2: Nhập bằng setter
        sinhvien sv2 = new sinhvien();
        sv2.setMaSV("sv02");
        sv2.setHoten("Nguyen Van B");
        sv2.setNgaysinh(LocalDate.of(2005, 12, 22));
        sv2.setDiemtoan(8.0);
        sv2.setDiemly(7.5);
        sv2.setDiemhoa(7.5);

        // Đối tượng 3: Nhập bằng phương thức nhập
        sinhvien sv3 = new sinhvien();
        System.out.println("Nhap thong tin SV 3:");
        sv3.nhapThongTin();

        // In thông tin 3 sinh viên
        System.out.println("\nThong tin SV 1 :");
        sv1.xuatThongTin();
        System.out.println("\nThong tin SV 2:");
        sv2.xuatThongTin();
        System.out.println("\nThong tin SV 3:");
        sv3.xuatThongTin();
        
        
        /*int a[]=new int[100];
        sinhvien dsSV[]=new sinhvien[1000];
        int n;
        System.out.print("nhap so sinh vien:*");
        n=sc.nextInt();*/
        
    }
}
