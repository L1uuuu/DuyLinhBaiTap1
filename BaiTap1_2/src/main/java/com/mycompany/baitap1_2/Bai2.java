/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1_2;

/**
 *
 * @author User
 */
public class Bai2 {
    private double a;
    private double b;
    private double c;
    public Bai2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public void solve(){
        System.out.print("Ket qua bai 2 la: ");
        if(a == 0){
            System.out.print("Day la phuong trinh bac nhat - ");
            if(b == 0 && c == 0)
                System.out.println("Phuong trinh co vo so nghiem");
            else if(b == 0 && c !=0)
                System.out.println("Phuong trinh vo nghiem");
            else
                System.out.println("Phuong trinh co nghiem duy nhat: " + (-c/b));
        }
        else{
            double delta = b*b - 4*a*c;
            if(delta < 0)
                System.out.println("Phuong trinh vo nghiem");
            else if(delta == 0)
                System.out.println("Phuong trinh co nghiem kep: " + -b/(2*a));
            else{
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Phuong trinh co 2 nghiem: " + x1 + " va " + x2);
            }
        }
    }
}
