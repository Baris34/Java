package Main;

import java.util.Scanner;

public class Main53 {
		//KLAVYEDEN GİRİLEN PARA MİKTARINA GÖRE BANKNOT VEREN VE TOPLAM BANKNOT SAYISINI BELİRTEN PROGRAM.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Para miktarını giriniz.");
		int para=scan.nextInt();
		int dizi[]= {200,100,50,20,10,5,1};
		int banknotsayisi=0,toplambanknot=0;
		
		for (int i = 0; i < dizi.length; i++) {
			banknotsayisi=para/dizi[i];
			toplambanknot+=banknotsayisi;
			if (banknotsayisi!=0) {
				System.out.println(banknotsayisi+" adet "+dizi[i]+" ver");
			}
			para=para-(banknotsayisi*dizi[i]);
			
		}
		
		System.out.println("Toplam banknot sayısı = "+toplambanknot);
		
	}

}
