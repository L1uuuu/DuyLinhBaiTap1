/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bai7 {
	private int n;
	private int x;
	private int[] a = new int[n];
	public Bai7(int n, int x) {
		this.n = n;
		this.x = x;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void inputArray1() {
		for (int i = 0; i < a.length; i++) {
			Scanner sc = new Scanner(System.in);
			a[i] = sc.nextInt();
		}
	}

	public void outputArray1() {
		System.out.println("Mang da nhap: ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println("\nMang sau khi sap xep: ");
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println();
	}

	public int findByBinary(int a[], int left, int right, int x) {
		if (left > right)
			return -1;
		int mid = (left + right) / 2;
		if (x == a[mid])
			return mid;
		if (x < a[mid])
			return findByBinary(a, left, mid - 1, x);
		return findByBinary(a, mid + 1, right, x);
	}

	@Override
	public String toString() {
		if (findByBinary(a, 0, a.length - 1, x) == -1)
			return "\nKhong tim duoc x";
		return "\nKet qua bai 7 la: " + (findByBinary(a, 0, a.length - 1, x) + 1);
	}
}
