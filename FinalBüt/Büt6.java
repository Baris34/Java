package algoritmafinal;

import java.util.Scanner;

public class Büt6 {

	public static void main(String[] args) {
		String mevsimler[]= {"Ilkbahar","Yaz","Sonbahar","Kis"};
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir mevsim no giriniz(1-4):");
		int no=scan.nextInt();
		System.out.println("Mevsim: "+mevsimler[no-1]);
	}

}
