package geekster_assignment;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<n;i++)
		{
			int x=(3*i)+2;
			if(x%4!=0)
			{
				System.out.println(x);
				count++;
			}
		}

	}

}
