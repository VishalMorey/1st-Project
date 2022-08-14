package logicalProgram;

import java.util.Scanner;

public class UserInputEG1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the 1st number");
		 int num1 = sc.nextInt();
		 System.out.println("please enter the 2nd number");
		 int num2 = sc.nextInt();
		 
		 int sum=num1+num2;
		 System.out.println("addition of two number "+sum);
	}

}
