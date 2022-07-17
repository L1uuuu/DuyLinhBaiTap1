package com.mycompany.baitap1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai10 {
	private int n;
	private ArrayList<Integer> arr = new ArrayList<>();

	public Bai10(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public ArrayList<Integer> getArr() {
		return arr;
	}

	public void setArr(ArrayList<Integer> arr) {
		this.arr = arr;
	}

	public void inputArray4() {
		for (int i = 0; i < n; i++) {
			Scanner sc = new Scanner(System.in);
			int value = sc.nextInt();
			arr.add(value);
		}
	}

	public void outputArray4() {
		System.out.println("Mang da nhap: ");
		System.out.println(arr);
		System.out.println("\nMang sau khi sap xep: ");
		Collections.sort(arr);
		System.out.println(arr);
		System.out.println();
	}

	public boolean checkPrime(int b) {
		int count = 0;
		if (b <= 1)
			return false;
		if (b == 2)
			return true;
		for (int i = 1; i <= Math.sqrt(b); i++)
			if (b % i == 0)
				count++;
		if (count == 1)
			return true;
		return false;
	}

	public void pushPrime() {
		for (int i = 0; i < arr.size(); i++) {
			int j = 0;
			while (j < arr.size()) {
				if (checkPrime(arr.get(i)) == true) {
					int temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
					j++;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Ket qua bai 10: " + arr;
	}
}
