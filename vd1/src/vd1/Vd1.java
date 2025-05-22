/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vd1;

/**
 *
 * @author PC
 */
public class Vd1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        person p1=new person();
        person p2=new person("Nguyen Van B",22,1.5f);
        person p3=new person();
        p1.hoten="Nguyen Van A";
        p1.tuoi=10;
        p1.chieucao=1.34f;
        p2.hoten="Nguyen Van B";
        p1.inTT();
        p2.inTT();
        System.out.print("nhap nguoi thu 3:");
        p3.nhapTT();
        p3.inTT();
        /*hinhchunhat p1=new hinhchunhat();
        p1.chieudai=3;
        p1.chieurong=4;
        p1.chuvi=(p1.chieudai+p1.chieurong)*2;
        p1.dientich=p1.chieudai*p1.chieurong;
        p1.inTT(); */
    }

    
}
