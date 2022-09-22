package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you want to search up to?");
		int number = in.nextInt();
		double sqrtNumber = Math.sqrt(number);
		Boolean [] n=new Boolean [number];
		for (int i=0; i<n.length ; i++) {
			n[i]=true;
		}
		for (int i=0; i<n.length ; i++) {
			for (int j=1; j<= sqrtNumber; j++) {
			if (i % j == 0) {
				n[i]=false;
			}			
		System.out.print(n[i]+ " ");
	}
	}
	}
}


