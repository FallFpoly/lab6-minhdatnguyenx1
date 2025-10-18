/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;
import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class Bai1_HoTen {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String hoTen = sc.nextLine().trim();

        int firstSpace = hoTen.indexOf(" ");
        int lastSpace = hoTen.lastIndexOf(" ");

        String ho = hoTen.substring(0, firstSpace).toUpperCase();
        String tenDem = hoTen.substring(firstSpace + 1, lastSpace);
        String ten = hoTen.substring(lastSpace + 1).toUpperCase();

        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten);
    }
}
