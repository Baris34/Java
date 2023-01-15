package Main;

import java.util.Scanner;

public class Main54 {
			//KULLANICIDAN ALDIĞIMIZ DEĞERE GÖRE HANGİ AYDAYIZ VE YANLIŞ GİRİLİRSE HATA VEREN PROGRAM.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String aylar[] = {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
		System.out.println("[1-12] arasında bir değer giriniz.");
		int n=scan.nextInt();
		if (n<=12&&n>=1) {
			System.out.print("Girdiğiniz ay = "+ aylar[n-1]);

		}else {
			System.out.println("Düzgün bir ay değeri giriniz.");
		}
	}

}
