package logicalProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	String s="vishal ashok morey";
	String r="";
	for(int i=s.length()-1;i>=0;i--) 
	{
		r=r+s.charAt(i);
	}
	System.out.println("reverse string is "+r);

	
	//another way for reverse string
	
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter string");
	String name = sc.next();
	String r1="";
	for(int j=name.length()-1;j>=0;j--)
	{
		r1=r1+name.charAt(j);
	}
	System.out.println("reverse string is "+r1);
	}
}
