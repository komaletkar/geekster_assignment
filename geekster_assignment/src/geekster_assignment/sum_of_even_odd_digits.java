package geekster_assignment;

import java.util.Scanner;

public class sum_of_even_odd_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int n=sc.nextInt();
		int evensum=0;
		int oddsum=0;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
			 evensum=evensum+i;	
			}
			else
			{
				oddsum=oddsum+i;
			}
		}
		System.out.println(evensum);
		System.out.println(oddsum);
		
	}

}
