package logicalProgram;

public class ReverserNumberWithoutStringConvert {

	public static void main(String[] args) {
		int number=123456789;
		int reverseNUM=0;
		for(int i=number;i>0;i=i/10)
		{int remainder=i%10;
		reverseNUM	=reverseNUM*10+remainder;
			
		}
System.out.println(reverseNUM);
	}

}
