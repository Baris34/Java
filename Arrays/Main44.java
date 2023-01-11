package Main;

public class Main44 {
	public static void Main(String[]args) {
		double dizi[] =new double[100];
		dizi[0]=0;
		dizi[1]=0;
		for (int i = 2; i < 100; i++) {
			dizi[i]=dizi[i-2]+dizi[i-1]+i;
		}for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
	}
}
