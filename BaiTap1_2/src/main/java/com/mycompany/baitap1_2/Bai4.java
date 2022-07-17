/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1_2;

/**
 *
 * @author User
 */
public class Bai4 {
    private int n;
    private int m;
    public Bai4(int n, int m){
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    
    public int gt(int n){
        if(n == 1)
            return 1;
        return gt(n-1) * n;
    }
    public int solve(int n, int m){
        return gt(n) / (gt(m) * gt(n-m));
    }
    @Override
    public String toString(){
        return "Ket qua bai 4 la: " + solve(n, m);
    }
}
