/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;
import java.util.*;
/**
 *
 * @author ICT
 */
public class Bai3_SinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("\nSinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Số điện thoại: ");
            String sdt = sc.nextLine();
            System.out.print("CMND: ");
            String cmnd = sc.nextLine();

            SinhVien sv = new SinhVien(hoTen, email, sdt, cmnd);
            list.add(sv);
        }

        System.out.println("\nDanh sách sinh viên hợp lệ:");
        System.out.printf("%-20s %-25s %-12s %-12s\n", "Họ tên", "Email", "SĐT", "CMND");
        for (SinhVien sv : list) {
            if (sv.isValid()) sv.xuat();
            else System.out.println(">> Dữ liệu không hợp lệ cho: " + sv);
        }
    }
}
