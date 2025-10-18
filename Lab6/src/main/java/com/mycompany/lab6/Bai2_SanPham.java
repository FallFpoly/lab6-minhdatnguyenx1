/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
;

public class Bai2_SanPham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("\nSản phẩm thứ " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }

        System.out.println("\nCác sản phẩm của hãng Nokia:");
        for (SanPham sp : list) {
            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
    }
}
