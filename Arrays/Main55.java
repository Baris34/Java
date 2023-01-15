package Main;

import java.util.Scanner;

public class Main55 {
			//MATRİS RASTGELE ELEMAN OLUŞTURMA VE EN BÜYÜK EN KÜÇÜK BULMA.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Satır sayısını giriniz.");
		int satır=scan.nextInt();
		System.out.println("Sütun sayısını giriniz.");
		int sütun = scan.nextInt();
		int dizi[][]= new int[satır][sütun];
		
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sütun; j++) {
				int random=(int)(Math.random()*101);
				dizi[i][j]=random;
				System.out.print(dizi[i][j]+" ");
				
			}
			System.out.println();
		}
		int enbuyuk= dizi[0][0];
		int enkucuk=dizi[0][0];
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sütun; j++) {
				if (dizi[i][j]>enbuyuk) {
					enbuyuk=dizi[i][j];
				}
				if (dizi[i][j]<enkucuk) {
					enkucuk=dizi[i][j];
				}
			}
		}
		System.out.println("En büyüğü = "+enbuyuk);
		System.out.println("En küçüğü = "+enkucuk);
	}

}
