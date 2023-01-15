package Main;

import java.util.Scanner;

public class Main51 {

	public static void main(String[] args) {
		
		//KULLANICIDAN BOYUT ALIP BOYUTA GÖRE DİZİYE RASTGELE DEĞERLER ATAN VE BU DEĞERLERİ TEK VEYA ÇİFT OLARAK EKRANA YAZDIRAN PROGRAM.
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyut gir");
		int n = scan.nextInt();
		int dizi[]= new int[n];
		
		for (int i = 0; i < dizi.length; i++) {
			int a=(int)(Math.random()*101);
			dizi[i]=a;
			
		}
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i]%2==0) {
				
				System.out.println(dizi[i]+" Çift");
			}
			else {
				System.out.println(dizi[i]+" Tek");
			}
		}
		
		
	}

}
