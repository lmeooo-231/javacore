/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagement.studentmanagement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author XCode
 */
public class StudentManagement {

    public static void main(String[] args) {
        Student sv1 = new Student(
            1,
            "Nguyen Van A",
            LocalDate.of(2004, 5, 14),
            8.0f,
            7.5f,
            9.0f
        );

        // SV2: Dùng setter (thuộc tính)
        Student sv2 = new Student();
        sv2.setStudentID(2);
        sv2.setName("Tran Thi B");
        sv2.setBirthday(LocalDate.of(2003, 12, 20));
        sv2.setMathScore(6.5f);
        sv2.setPhysicScore(7.0f);
        sv2.setChemistryScore(6.0f);
        sv2.setAverageScore(); // tính điểm TB bên trong
        sv2.setRank(sv2.getAverageScore()); // dùng getter để lấy điểm TB truyền vào


        // SV3: Dùng phương thức Input()
        Student sv3 = new Student();
        System.out.println("Nhap thong tin sinh vien 3:");
        sv3.Input();

        // In thông tin 3 sinh viên
        System.out.println("\n--- Thong tin sinh vien 1 ---");
        sv1.Output();

        System.out.println("\n--- Thong tin sinh vien 2 ---");
        sv2.Output();

        System.out.println("\n--- Thong tin sinh vien 3 ---");
        sv3.Output();
    }
}
