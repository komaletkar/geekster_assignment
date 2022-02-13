package geekster_assignment;

import java.util.Scanner;

public class print_odd_numbers_back {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			if(i%2!=0) {
			System.out.println(i);
		}
		
		}
	}

}
