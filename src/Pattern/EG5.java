package Pattern;

public class EG5 {

	public static void main(String[] args) {
//		*********
//		 ********
//		  *******
//		   ******
//		    *****
//		     ****
//		      ***
//		       **
//		        *
		        int star =9;
				int space=0;
				for(int a=1;a<=9;a++)
				{
					for(int c=1;c<=space;c++)
					{
						System.out.print(" ");
					}
				for(int b=1;b<=star;b++)
				
					{
						System.out.print("*");
					}
					star--;
					space++;
					System.out.println();
				}
				
	}

}
