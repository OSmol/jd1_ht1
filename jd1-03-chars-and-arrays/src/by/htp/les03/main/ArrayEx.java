package by.htp.les03.main;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		int n = 5;
		int[] mas = new int[n];
		
		/*
		 * int[] mas2 = new int[] {23,34,45,56}; mas2 = new int[] {1,2,3,4};
		 * 
		 * int[] mas3 = {12,0,34,0};
		 */
		

		Random rand = new Random();
		for(int i=0; i<mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
		
		for(int i=0; i<mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		
		int sum = 0;
		for(int i=0; i<mas.length; i++) {
			sum = sum + mas[i];
		
		}
		
		System.out.println("sum=" + sum);
	}

}
