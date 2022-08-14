package logicalProgram;

public class primeNumber {

	public static void main(String[] args) {
		int num=16;
		int counter=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0) {
				counter++;
				break;
				
			}
		}
if(counter==1)  
{
	System.out.println("given number is not prime number");
}
else {
	System.out.println("given number is prime number");
}
	}

}
