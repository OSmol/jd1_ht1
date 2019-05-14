package by.htp.les02.main;

import java.util.Scanner;

public class Function04 {

	public static void main(String[] args) {
		int a;
		int b;
		double c;

		double z;

		a = enterInt("Enter a: ");
		b = enterInt("Enter b: ");
		c = enterInt("Enter c: ");

		double temp;
		temp = a - 3;
		z = (temp * b / 2) + c;// ++ + -a

		System.out.println("z=" + z);

	}

	public static int enterInt(String message) {
		Scanner sc = new Scanner(System.in);
		int v;

		System.out.print(message);
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.print(message);

		}
		v = sc.nextInt();

		return v;
	}

}
