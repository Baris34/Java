package algoritmafinal;

import java.util.Scanner;

public class Algoritma6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir a değeri giriniz.");
		int a= scan.nextInt();
		System.out.println("Bir b değeri giriniz.");
		int b = scan.nextInt();
		
		System.out.println("Logaritması = "+(Math.log10(b)/Math.log10(a)));
	}

}
