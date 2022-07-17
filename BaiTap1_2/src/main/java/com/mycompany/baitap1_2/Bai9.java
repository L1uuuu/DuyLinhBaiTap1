/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1_2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class Bai9 {
	private int n;
	private int x;
	private ArrayList<Integer> arr = new ArrayList<>();

	public Bai9(int n, int x) {
		this.n = n;
		this.x = x;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public ArrayList<Integer> getArr() {
		return arr;
	}

	public void setArr(ArrayList<Integer> arr) {
		this.arr = arr;
	}

	public void inputArray() {
		for (int i = 0; i < n; i++) {
			int value = (int) (Math.random() * 20 + 1);
			arr.add(value);
		}
	}

	public void outputArray() {
		System.out.println("Mang da nhap: ");
		System.out.println(arr);
		System.out.println("\nMang sau khi sap xep: ");
		Collections.sort(arr);
		System.out.println(arr);
		System.out.println();
	}

	public void checkArray() {
		int i = 0;
		int sum = arr.get(i);
		while (arr.get(i) > x) {
			ArrayList<Integer> a = new ArrayList<>();
			a.add(arr.get(i));
			for (int j = i + 1; j < arr.size(); j++) {
				sum += arr.get(j);
				if (sum == x) {
					a.get(arr.get(j));
				}
			}
			System.out.println("Mang can tim: " + a);
			i++;
		}
//    	int low = 0;
//    	int high = arr.size() - 1;
//    	while(low < high) {
//    		if(arr.get(low) + arr.get(high) == x)
//    			System.out.println("Tim thay cap so");
//    		if(arr.get(low) + arr.get(high) < x)
//    			low++;
//    		else if(arr.get(low) + arr.get(high) > x)
//    			high--;	
//    		
//    	}
	}

}
