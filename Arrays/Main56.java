package Main;

import java.util.Scanner;

public class Main56 {

	public static void main(String[] args) {
		//RASTGELE OLUŞTURULAN MATRİSİ KÜÇÜKTEN BÜYÜĞE SIRALA.
		Scanner scan = new Scanner (System.in);
		System.out.println("Satır saysını giriniz.");
		int satır=scan.nextInt();
		System.out.println("Sütun saysını giriniz.");
		int sütun=scan.nextInt();
		int matris[][]= new int[satır][sütun];
		//MATRİSİN ELEMANLARI RASTGELE OLUŞTURULUYOR VE EKRANA YAZDIRILIYOR.
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sütun; j++) {
				int rnd=(int)(Math.random()*100);
				matris[i][j]=rnd;
				System.out.print(matris[i][j]+" ");
			}
			System.out.println();
		}//MATRİSİN ELEMANLARI RASTGELE OLUŞTURULDU VE EKRANA YAZDIRILDI.
		
		//MATRİS DİZİYE AKTARILIYOR.
		int sayac=0;
		int temp;
		int dizi[]=new int[satır*sütun];
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sütun; j++) {
				dizi[sayac]=matris[i][j];
				sayac++;
			}
		}//MATRİS DİZİYE AKTARILDI.

		//DİZİ KÜÇÜKTEN BÜYÜĞE SIRALANIYOR.
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i+1; j < dizi.length; j++) {
				if (dizi[j]<dizi[i]) {
					temp=dizi[i];
					dizi[i]=dizi[j];
					dizi[j]=temp;
				}
			}
		}//DİZİ KÜÇÜKTEN BÜYÜĞE SIRALANDI.
		sayac=0;
		//DİZİ MATRİSE GERİ YAZDIRILIYOR.
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sütun; j++) {
				matris[i][j]=dizi[sayac];
				sayac++;
			}
		}//DİZİ MATRİSE YAZDIRILDI.
		System.out.println();
		//MATRİS EKRANA YAZDIRILIYOR.
		for(int i = 0; i < satır; i++) {
			for (int j = 0; j < sütun; j++) {
				System.out.print(matris[i][j]+" ");
			}
			System.out.println();
		}//MATRİS EKRANA YAZDIRILDI.
	}

}
