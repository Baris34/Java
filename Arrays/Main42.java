package Main;

import java.util.Scanner;

public class Main42 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyutu giriniz.");
		int n=scan.nextInt();
		int dizi[]=new int[n];
		int temp;
		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i+1)+". dizinin elemanını giriniz.");
			dizi[i]=scan.nextInt();
			
		}
		System.out.println("Dizinin büyükten küçüğe sıralanmış hali \n");
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i+1; j < dizi.length; j++) {
				if (dizi[i]<dizi[j]) {
					temp=dizi[i];
					dizi[i]=dizi[j];
					dizi[j]=temp;
				}
			}
		}
		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i+1)+".elemanı "+dizi[i]);
		}
		
		System.out.println("Dizinin küçükten büyüğe sıralanmış hali \n");
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i+1; j < dizi.length; j++) {
				if (dizi[i]>dizi[j]) {
					temp=dizi[i];
					dizi[i]=dizi[j];
					dizi[j]=temp;
				}
			}
		}
		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i+1)+".elemanı "+dizi[i]);
		}
	}

}
