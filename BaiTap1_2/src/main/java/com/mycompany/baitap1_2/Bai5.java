/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1_2;

/**
 *
 * @author User
 */
public class Bai5 {
    private int n;
    private int m;

    public Bai5(int n, int m) {
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
    
    public int solve(int n, int m){
        if(m == 0) return n;
        return solve(m, n%m);
    }

    @Override
    public String toString() {
        return "Ket qua bai 5 la: " + solve(n, m);
    }
    
}
