/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arlnhanvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Arlnhanvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<NhanVien> dsNV;
        dsNV = new ArrayList();
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap so nhan vien:");
        n= Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++)
        {
            System.out.print("Nhan vien thu "+ (i+1)+":");
            NhanVien nv =new NhanVien();
            nv.NhapNV();
            dsNV.add(nv);
            
        }
        // in danh sach nhan vien
        System.out.println("Danh sach nhan vien:");
        NhanVien.TieuDeCot();
        for(NhanVien nv:dsNV){
            nv.InTT();
        }
        
        //dao nguoc danh sach 
        Collections.reverse(dsNV);
        System.out.println("Danh sach nhan vien(dao nguoc):");
        NhanVien.TieuDeCot();
        for(NhanVien nv:dsNV){
            nv.InTT();
        }
        //tang dan
        //Collections.sort(dsNV, (nv1, nv2) -> nv1.tinhLuong().compareTo(nv2.tinhLuong()) );
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(dsNV.get(j).tinhLuong()<dsNV.get(i).tinhLuong()){
                    Collections.swap(dsNV,i, j);
                }
            }

        }
        System.out.println("danh sach nhan vien theo yeu cau tang dan ");
        NhanVien.TieuDeCot();
        for(NhanVien nv:dsNV){
            nv.InTT();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(dsNV.get(j).tinhLuong()<dsNV.get(i).tinhLuong()){
                    Collections.swap(dsNV,i, j);
                }
            }

        }
    }
    
}