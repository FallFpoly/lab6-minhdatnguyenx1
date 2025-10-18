/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;
import java.util.regex.*;
/**
 *
 * @author ICT
 */

public class SinhVien {
    private String hoTen, email, sdt, cmnd;

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public boolean isValidEmail() {
        return email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
    }

    public boolean isValidSDT() {
        return sdt.matches("^0\\d{9}$");
    }

    public boolean isValidCMND() {
        return cmnd.matches("^\\d{9,12}$");
    }

    public void xuat() {
        System.out.printf("%-20s %-25s %-12s %-12s\n", hoTen, email, sdt, cmnd);
    }

    public boolean isValid() {
        return isValidEmail() && isValidSDT() && isValidCMND();
    }
}
