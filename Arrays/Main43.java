package Main;

import java.util.Scanner;

public class Main43 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dizinin boyutunu gir. ");
		int n = scan.nextInt();
		int dizi[]=new int[n];
		
		
		for (int i = 0; i < dizi.length; i++) {
			int a=(int)(Math.random()*101);
			dizi[i]=a;
			if (dizi[i]%2==0) {
				System.out.println((i+1)+".elemanı "+dizi[i]+" çift");
			}else {
				System.out.println((i+1)+".elemanı "+dizi[i]+" tek");
			}
		}
	}

}
