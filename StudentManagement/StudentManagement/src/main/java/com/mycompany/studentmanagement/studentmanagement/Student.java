/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement.studentmanagement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


/**
 *
 * @author XCode
 */
public class Student {
    private int StudentID;
    private String Name;
    private LocalDate Birthday;
    private float MathScore;
    private float PhysicScore;
    private float ChemistryScore;
    private float AverageScore;
    private String Rank;
    public void setStudentID(int StudentID){
        this.StudentID = StudentID;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setBirthday(LocalDate Birthday){
        this.Birthday = Birthday;
    }
    public void setMathScore(float MathScore){
        this.MathScore = MathScore;
    }
    public void setPhysicScore(float PhysicScore){
        this.PhysicScore = PhysicScore;
    }
    public void setChemistryScore(float ChemistryScore){
        this.ChemistryScore = ChemistryScore;
    }
    public void setAverageScore(){
        this.AverageScore = (MathScore + PhysicScore + ChemistryScore) / 3;
    }
    public void setRank(float AverageScore){
        if (AverageScore >= 8){
            this.Rank = "Gioi";
        }
        else if(AverageScore >= 7){
            this.Rank = "Kha";
        }
        else if(AverageScore >= 5) {
            this.Rank = "TB";
        }
        else{
            this.Rank = "Yeu";
        }
    }
    public int getStudentID() {
        return this.StudentID;
    }

    public String getName() {
        return this.Name;
    }

    public LocalDate getBirthday() {
        return this.Birthday;
    }

    public float getMathScore() {
        return this.MathScore;
    }

    public float getPhysicScore() {
        return this.PhysicScore;
    }

    public float getChemistryScore() {
        return this.ChemistryScore;
    }

    public float getAverageScore() {
        return this.AverageScore;
    }

    public String getRank() {
        return this.Rank;
    }

    public Student(int StudentID, String Name, LocalDate Birthday, float MathScore, float PhysicScore, float ChemistryScore){
        this.StudentID = StudentID;
        this.Name = Name;
        this.Birthday = Birthday;
        this.MathScore = MathScore;
        this.PhysicScore = PhysicScore;
        this.ChemistryScore = ChemistryScore;
        setAverageScore();
        setRank(this.AverageScore);
    }
    public Student() {
        
    }
    public void Input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        StudentID = scan.nextInt();
        scan.nextLine(); // Đọc bỏ dòng new line sau nextInt()

        System.out.print("Nhap ten: ");
        Name = scan.nextLine();

        // Nhập ngày sinh với định dạng dd/MM/yyyy
        boolean validDate = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (!validDate) {
            System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
            String dateStr = scan.nextLine();
            try {
                Birthday = LocalDate.parse(dateStr, formatter);
                validDate = true;
            } catch (DateTimeParseException e) {
                System.out.println("Ngay sinh khong hop le. Vui long nhap lai dung dinh dang dd/MM/yyyy.");
            }
        }

        System.out.print("Nhap diem toan: ");
        MathScore = scan.nextFloat();
        System.out.print("Nhap diem ly: ");
        PhysicScore = scan.nextFloat();
        System.out.print("Nhap diem hoa: ");
        ChemistryScore = scan.nextFloat();
    }

    public void Output(){
        System.out.println("ID: " + StudentID);
        System.out.println("Ten: " + Name);
        System.out.println("Ngay sinh: " + Birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Diem toan: " + MathScore);
        System.out.println("Diem ly: " + PhysicScore);
        System.out.println("Diem hoa: " + ChemistryScore);
        setAverageScore();
        System.out.println("Diem TB: " + AverageScore);
        setRank(this.AverageScore);
        System.out.println("Xep loai: " + Rank);
    }

    
}
