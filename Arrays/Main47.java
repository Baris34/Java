package Main;

import java.util.Scanner;

public class Main47 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sütun sayısnı giriniz");
		int sütun=scan.nextInt();
		System.out.println("Satır sayısını giriniz");
		int satır = scan.nextInt();
		int[][] matris = new int[satır][sütun];
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sütun; j++) {
			if (i==j) {
				matris[i][j]=1;
			}
			else {
				matris[i][j]=0;
			}
			}
		}
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sütun; j++) {
				System.out.print(matris[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
