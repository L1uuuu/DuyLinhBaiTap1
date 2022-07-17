/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1_2;

/**
 *
 * @author User
 */
public class Bai1 {
    private int n;
    public Bai1(int n){
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public boolean check(){
        int count = 0;
        for(int i = 1; i < Math.sqrt(n); i++)
            if(n%i == 0)
                count++;
        return count == 1;
    }
    @Override
    public String toString(){
        return "Ket qua bai 1 la: " + check();
    }
}
