
package boskare;

import java.util.Scanner;


public class boskare {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Kenar uzunluğunu giriniz :");

		int a = input.nextInt();
		
		
		for (int i = 1; i <= a ; i++) {
			for(int j = 1 ; j <= a; j ++) {
				if(i == 1 || i == a || j == a || j == 1  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		 
	 
	}

}
