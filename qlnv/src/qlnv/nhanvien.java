/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnv;

import java.util.Scanner;

/**
 *
 * @author PC
 */

public class nhanvien {
    private String MaNV;
    private String HoTen;
    private int NgayCong;
    private double TienCong;
    //không tham số
    public nhanvien() {
        MaNV="";
        HoTen="";
        NgayCong=0;
        TienCong=0;
    }
    //có tham số
    public nhanvien(String MaNV, String HoTen, int NgayCong, double TienCong){
        this.MaNV=MaNV;
        this.HoTen=HoTen;
        this.NgayCong=NgayCong;
        this.TienCong=TienCong;
    }
    //getter - setter
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
    public void setNgayCong(int NgayCong){
        this.NgayCong=NgayCong;
    }
    public int getNgayCong(){
        return NgayCong;
    }
    public void setTienCong(double TienCong){
        this.TienCong=TienCong;
    }
    public double getTienCong(){
        return TienCong;
    }
    // nhập dữ liệu
    public void NhapNhanVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("MNV: ");MaNV=sc.nextLine();
        System.out.print("ho ten: ");HoTen=sc.nextLine();
        System.out.print("so ngay cong: ");NgayCong=sc.nextInt();
        System.out.print("Tien cong 1 ngay: ");TienCong=sc.nextDouble();
    }
    public double TienLuong(){
        if(NgayCong>20){
            return 20*TienCong+(NgayCong-20)*TienCong*2;
        }
        else{
            return NgayCong*TienCong;
        }
    }
    for(int i==0;i<n-1;i++)
    {
        for(int j=i+1;j<n,j++)
        {
            if(dsNV[j].tinhLuong()>dsNV[i].tinhLuong())
            {
                nhanvien temp=dsNV[i];
                dsNV[i]=dsNV[j];
                dsNV[j]=temp;
            }
        }
    }
    public void XuatThongTin(){
        System.out.printf("%-15s|%-30s|%5d|%20.0f|%20.0f\n" , MaNV,HoTen,NgayCong,TienCong,TienLuong());
        /*System.out.println("Ho Ten: " + HoTen);
        System.out.println("Ngay sinh: " + NgayCong);
        System.out.println("Tien Cong:" + TienCong);
        System.out.println("luong thang:" + TienLuong());*/
}
}
