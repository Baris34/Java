package algoritmafinal;

public class Algoritma5 {

	public static void main(String[] args) {
		System.out.print("!!!!");
		for (int i = 1; i < 5; i++) {
			System.out.print("!!!"+i);
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print("----");
		}
		System.out.println();
		
		for (int i = 1; i <=5; i++) {
			System.out.print(i+">**");
			for (int j = 0; j < 4; j++) {
				System.out.printf("-%d0%d",i,(j+1));
			}
			System.out.println();
		}
		
		
		
	}

}
