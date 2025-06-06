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
public class nhanvien_mang {
    public static void main(String[] args){
        nhanvien dsNV[]=new nhanvien[100];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nhan vien :");n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap nv thu "+(i+1));
            dsNV[i]=new nhanvien();
            dsNV[i].NhapNhanVien();
        }
        for(int i=0;i<n;i++)
        {
            dsNV[i].XuatThongTin();
        }
    }
}
