package geekster_assignment;

import java.util.Scanner;

public class leap_year_or_not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Year is leap year");
		}
		else
		{
			System.out.println("Year is not leap year");
		}

	}

}
