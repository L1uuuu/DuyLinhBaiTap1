/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1_2;

/**
 *
 * @author User
 */
public class Bai3 {
    int n;
    public Bai3(int n){
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int solve(int n){
        if(n == 1)
            return 1;
        return solve(n-1) * n;
    }
    @Override
    public String toString(){
        return "Ket qua bai 3 la: " + solve(n);
    }
}
