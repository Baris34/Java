package algoritmafinal;

import java.util.Scanner;

public class Algoritma3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyut girin.");
		int n = scan.nextInt();
		int dizi[]= new int[n];
		
		dizi[0]=0;
		dizi[1]=1;
		for (int i = 2; i < dizi.length; i++) {
			dizi[i]=dizi[i-2]+dizi[i-1];
		}
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]+" ");

		}
	}

}
