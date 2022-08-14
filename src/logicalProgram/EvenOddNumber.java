package logicalProgram;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		System.out.println("please enter the number");
		int num = ab.nextInt();
		if (num%2==0) 
		{
			System.out.println("given num is even ");
		}
		else
		{
           System.out.println("given num is odd");
		}

	}

}
