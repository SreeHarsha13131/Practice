package Pattrens;

import java.util.Scanner;

public class RightAngle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rowNo=sc.nextInt();
//		for (int row =rowNo; row >0; row--) {
//			for(int col=0;col<=rowNo-row;col++) {
//					System.out.print(" ");
//			}
//			  for (int k = 0; k < row; k++) {
//	                System.out.print("*");
//	            }
//			System.out.println();
//		}	
		  for (int i = 1; i <= 3; i++) {
	            for (int j = 1; j <= i - 1; j++) {
	                System.out.print(" ");
	            }
	            for (int k = i; k <= 3; k++) {
	                System.out.print(k);
	            }
	            System.out.println();
	        }
	}
}
