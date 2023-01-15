package algoritmafinal;

public class Algoritma4 {

	public static void main(String[] args) {
		double sira[]= {0.1,1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9,9.0};
		
		double temp;
		for (int i = 0; i < sira.length; i++) {
			for (int j = i; j < sira.length; j++) {
				if (sira[j]>sira[i]) {
					temp=sira[j];
					sira[j]=sira[i];
					sira[i]=temp;
				}
			}
		}
		
		for (int i = 0; i < sira.length; i++) {
			System.out.print(sira[i]+" ");
		}
		
	}

}
