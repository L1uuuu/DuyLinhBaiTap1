/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1_2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bai8 {
	private int n;
	private int x;
	private LinkedList<Integer> a = new LinkedList<>();

	public Bai8(int n, int x) {
		this.x = x;
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public List<Integer> getA() {
		return a;
	}

	public void setA(LinkedList<Integer> a) {
		this.a = a;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void inputArray2() {
		for (int i = 0; i < n; i++) {
			Scanner sc = new Scanner(System.in);
			int value = sc.nextInt();
			a.add(value);
		}
	}

	public void outputArray2() {
		System.out.println("Mang da nhap: ");
		System.out.println(a);
		System.out.println("\nMang sau khi sap xep: ");
		Collections.sort(a);
		System.out.println(a);
		System.out.println();
	}

	public void addX() {
		for (int i = 0; i < a.size() - 1; i++) {
			if (x <= a.get(0)) {
				a.add(0, x);
				break;
			}
			if (x >= a.get(i) && x <= a.get(i + 1)) {
				a.add(i + 1, x);
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "\nKet qua bai 8 la: " + "\n" + a;
	}
}
