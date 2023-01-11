package Main;

import java.util.Scanner;

public class Main40 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyutu giriniz");
		int boyut =scan.nextInt();
		int[] dizi = new int[boyut];
		int top=0;
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.print("Dizinin "+(i+1)+". indisini giriniz : ");
			dizi[i]=scan.nextInt();
		}
		for (int i = 0; i < dizi.length; i++) {
			top+=dizi[i];
		}
		double ort=top/boyut;
		System.out.println("Ortalama = "+ort);
		int ort_kucuk_say=0,ort_buyuk_say=0;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i]<ort) {
				ort_kucuk_say++;
				System.out.println("Dizinin ortalamasından küçük bir değere sahip.");
			}
			else {
				ort_buyuk_say++;
				System.out.println("Dizinin ortalamasından büyük bir değere sahip.");

			}
		}
		System.out.println("Dizinin içinde "+ort_kucuk_say+" adet ortalamanın altında sayı vardır.");
		System.out.println("Dizinin içinde "+ort_buyuk_say+" adet ortalamanın üstünde sayı vardır.");
		
		
		
		
	}

}
