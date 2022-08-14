package Pattern;

public class EG3 {

	public static void main(String[] args) {
//		*******
//		 *****
//		  ***
//		   *
		
		//row==4 star=7
		int star=7;
		int space=0;
		
		for(int a=1;a<=4;a++)
		{
			for(int b=1;b<=space;b++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=star;c++)
			{
				System.out.print("*");
			}
			star=star-2;
			space++;
			System.out.println();
		}
				
		
	}

}
