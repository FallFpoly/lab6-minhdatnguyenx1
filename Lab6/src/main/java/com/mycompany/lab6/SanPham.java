/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class SanPham {
    private String tenSp;
    private String hang;
    private double donGia;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = sc.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        hang = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        System.out.printf("%-20s %-10s %.1f\n", tenSp, hang, donGia);
    }

    public String getHang() {
        return hang;
    }
}
