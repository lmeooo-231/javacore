/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arlnhanvien;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NhanVien {
    private String MaNV;
    private String HoTen;
    private int SoNgayCong;
    private Double TienCongNgay;
    
    public NhanVien(){
     
        MaNV="";
        HoTen= "";
        SoNgayCong=0;
        TienCongNgay=0.0;
    }
        
    public NhanVien (String MaNV ,String HoTen ,int SoNgayCong ,Double TienCongNgay){
        this.MaNV= MaNV;
        this.HoTen=HoTen;
        this.SoNgayCong=SoNgayCong;
        this.TienCongNgay=TienCongNgay;
    }
    
   
    public void setMaNV(String MaNV){
        this.MaNV=MaNV;
    } 
    public String getMaNV(){
        return MaNV;
    }
   
    public void setHoTen(String HoTen){
        this.HoTen=HoTen;
    }
    public String getHoTen(){
        return HoTen;
    }
    
    public void setSoNgayCong(int SoNgayCong){
        if(SoNgayCong < 0 || SoNgayCong >30) {
            throw new IllegalArgumentException("So Ngay cong phai lon hon 0 va nho hon 30 ");
        }
        this.SoNgayCong=SoNgayCong;
    }
    public int getSoNgayCong(){
        return SoNgayCong;
    }
    
    public void setTienCongNgay(Double TienCongNgay){
        this.TienCongNgay=TienCongNgay;
    }
    public Double getTienCongNgay()
    {
        return TienCongNgay;
    }
    
    //Hàm Nhập Dữ Liệu
   public void NhapNV() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Nhap Ma: ");
    MaNV = sc.nextLine();

    System.out.print("Nhap Ho Ten: ");
    HoTen = sc.nextLine();

    while (true) {
        try {
            System.out.print("Nhap so Ngay cong: ");
            int ngayCong = Integer.parseInt(sc.nextLine());
            setSoNgayCong(ngayCong);
            break;
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Nhập sai kiểu số, vui lòng nhập lại!");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    while (true) {
        try {
            System.out.print("Nhap Tien Cong Ngay: ");
            TienCongNgay = Double.parseDouble(sc.nextLine());
            break;
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Nhập sai kiểu số, vui lòng nhập lại!");
        }
    }
}

    
        
    public Double tinhLuong(){
        if(SoNgayCong>20)
        {
            return 20*TienCongNgay+(SoNgayCong-20)*TienCongNgay*2;
        }
        else {
            return(SoNgayCong*TienCongNgay);
        }   
    }
    public static void TieuDeCot()
    {
        System.out.printf(" %-15s | %-30s | %10s | %20s | %20s \n", "Ma NV", "Ho Ten", "Ngay Cong", "Cong Ngay ", "Luong");
    }
    public void InTT() {
        System.out.printf(" %-15s | %-30s | %10d | %20.0f | %20.0f \n", MaNV, HoTen, SoNgayCong, TienCongNgay, tinhLuong());
}
    
}
    