/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.baitap1_2;

/**
 *
 * @author User
 */
public class BaiTap1_2 {

    public static void main(String[] args) {
        Bai1 bai1 = new Bai1(2);
        System.out.println(bai1);
        Bai2 bai2 = new Bai2(0, 2, 3);
        bai2.solve();
        Bai3 bai3 = new Bai3(4);
        System.out.println(bai3);
        Bai4 bai4 = new Bai4(5, 2);
        System.out.println(bai4);
        Bai5 bai5 = new Bai5(8, 12);
        System.out.println(bai5);
        Bai6 bai6 = new Bai6(13);
        System.out.println(bai6);
        int n = 10;
        int x = 4;
        Bai7 bai7 = new Bai7(n, x);
        bai7.inputArray1();
        bai7.outputArray1();
        System.out.println(bai7);
        Bai8 bai8 = new Bai8(n, x);
        bai8.inputArray2();
        bai8.outputArray2();
        bai8.addX();
        System.out.println(bai8 + "\n");
//        Bai9 bai9 = new Bai9(n, 10);
//        bai9.inputArray();
//        bai9.outputArray();
//        bai9.checkArray();
        Bai10 bai10 = new Bai10(n);
        bai10.inputArray4();
        bai10.pushPrime();
        bai10.outputArray4();
    }
}
