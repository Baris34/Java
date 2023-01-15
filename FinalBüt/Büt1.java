package algoritmafinal;

import java.util.Scanner;

public class Büt1 {

	public static void main(String[] args) {
		String passwd="Yazilim2022";
		Scanner scan = new Scanner(System.in);
		System.out.println("Kullanici sifresi giriniz:");
		String sifre=scan.nextLine();
		int denemehakki=1;
		
		while (denemehakki<5) {
			if (passwd.equals(sifre)) {
				System.out.println("Hos geldiniz!Program basliyor...");
				break;
			}
			else {
				System.out.println("Sifre yanlis,tekrar giriniz:");
				sifre=scan.nextLine();
				denemehakki++;
			}
		}
	}

}
