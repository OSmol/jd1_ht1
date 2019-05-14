package by.htp.les04.main;

import java.util.Random;

public class Array2Ex {
	public static void main(String[] args) {
		
		int[][] mas =  new int[2][3];
		
		//int mas
		
		int[] m = new int[] {11,22,33};
		mas[0] = m;
		mas[1] = new int[2];
		mas[2] = new int[4];
		
		
		Random rand = new Random();
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}
		
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}

class Item{}
