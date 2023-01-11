package Main;

import java.util.Scanner;

public class Main41 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyutu gir");
		int n = scan.nextInt();
		int []dizi=new int[n];
		int enbuyuk=dizi[0];
		int enkucuk=dizi[0];
		int enkucuksay=0,enbuyuksay=0;
		for (int i = 0; i < dizi.length; i++) {
			System.out.print((i+1)+". elemanını giriniz." );
			dizi[i]=scan.nextInt();
			if (enbuyuk<=dizi[i]) {
				enbuyuk=dizi[i];
				enbuyuksay=i;
			}
			if (enkucuk>=dizi[i]) {
				enkucuk=dizi[i];
				enkucuksay=i;
			}
			
		}
		System.out.println("En büyük değer = "+ enbuyuk+" ve bunun indisi "+(enbuyuksay+1));
		System.out.println("En küçük değer = "+enkucuk+" ve bunun indisi "+(enkucuksay+1));
		
	}

}
