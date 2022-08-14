package logicalProgram;

public class MultiplicationWithoutUsingMulOpretion {

	public static void main(String[] args) {
		//5*6--->30;
		//5+5+5+5+5+5--->25;
		
		int num1=5;
		int num2=6;
		int sum1 =0;
		for(int i=1;i<=num2;i++)
		{
			sum1=sum1+num1;
		}
		System.out.println("multipication is "+sum1);
		int num3=10;
		int num4=10;
		int sum=0;
		for(int i=1;i<=num4;i++)
		{
			sum=sum+num3;
		}
		System.out.println("multipication is "+sum);
		
	}

}
