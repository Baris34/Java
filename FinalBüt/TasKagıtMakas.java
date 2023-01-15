package algoritmafinal;

import java.util.Scanner;

public class TasKagıtMakas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dizi[]= {"Taş","Kağıt","Makas"};	
		int rnd=(int)(Math.random()*3);
		System.out.println("Taş:0,Kağıt:1,Makas:2 Hangisi?");
		int kullanici=scan.nextInt();
		
		System.out.println("Program:"+dizi[rnd]);
		System.out.println("Sen:"+dizi[kullanici]);
		if ((rnd==0&&kullanici==0)||(rnd==1&&kullanici==1)||(rnd==2&&kullanici==2)) {
			System.out.println("Kazanan yok!");
		}
		else if((rnd==0&&kullanici==1)||(rnd==1&&kullanici==2)||(rnd==2&&kullanici==0)){
			System.out.println("Kazandın!");
		}
		else {
			System.out.println("Kaybettin!");
		}
	}

}
