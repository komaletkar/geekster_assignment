package geekster_assignment;

import java.util.Scanner;

public class coumpound_intrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double t=sc.nextDouble();
		double amount=0;
		double CI=0;
		 
		amount=p*(Math.pow(1+r/100, t));
		CI=amount-p;
		System.out.println(CI);
		
	}

}
