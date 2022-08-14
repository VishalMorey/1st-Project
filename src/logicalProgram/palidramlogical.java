package logicalProgram;

import java.util.Scanner;

public class palidramlogical {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		System.out.println("please enter the String");
		String name = sc.next();
		String r="";
		for(int i=name.length()-1;i>=0;i--)
		{
			
		r=r+name.charAt(i)	;
			
		}
	
	
	System.out.println("The reverse string is "+r);
	
	
	
	
	}

}
