package Main;
import java.util.Scanner;
public class Main52 {

	public static void main(String[] args) {
		//BOYUTU VE ELEMANLARI KULLANICI TARAFINDAN GİRİLEN SAYILARIN NEGATİF VE POZİTİF SAYILARINI VE ADETLERİNİ EKRANA YAZDIRAN PROGRAM.
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyut giriniz.");
		int n = scan.nextInt();
		int dizi[]= new int[n];
		int sayac=0;
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i+1)+". elemanı giriniz.");
			dizi[i]=scan.nextInt();
		}
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i]>=0) {
				System.out.println(dizi[i]+" pozitif");
				sayac++;
			}
			else {
				System.out.println(dizi[i]+" negatif");
			}
		}
		System.out.println("Pozitif sayıların adeti = "+sayac);
		System.out.println("Negatif sayıların adeti = "+(dizi.length-sayac));
	}

}
