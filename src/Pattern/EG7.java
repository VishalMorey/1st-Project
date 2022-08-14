package Pattern;

public class EG7 {

	public static void main(String[] args) {
//		* * * * * *
//		 * * * * *
//		  * * * *
//		   * * *
//		    * * 
//		     * 
		int star=6;
		int space=0;
		for(int a=1;a<=6;a++)
		{
			for(int b=1;b<=space;b++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=star;b++)
			{
				System.out.print("* ");
			}
			space++ ;
			star--;
			System.out.println();
		}
				

	}

}
