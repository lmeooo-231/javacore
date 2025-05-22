/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vd1;

/**
 *
 * @author PC
 */
public class person {
    public String hoten;
    public int tuoi;
    public float chieucao;
    public person(String hoten,int tuoi,float chieucao)
    {
    this.hoten=hoten;
    this.tuoi=tuoi;
    this.chieucao=chieucao;
    }
    public person()
    {
    }
    public void inTT()
    {
            System.out.println(hoten+"\t"+tuoi+"\t"+chieucao);
                    }
    public void nhapTT()
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap ho ten:");
    hoten=sc.nextLine();
    System.out.print("nhap tuoi:");
    tuoi=sc.nextInt();
    System.out.print("nhap chieu cao:");
    chieucao=sc.nextFloat();
    }
}
