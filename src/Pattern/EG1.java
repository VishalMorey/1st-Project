package Pattern;

public class EG1 {

	public static void main(String[] args) {
//		*****
//		****
//		***
//		**
//		*
		//row =5 star=5
		int star=5;
		
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=star;b++)
			{
				System.out.print("*");
			}
			star--;
			System.out.println();
		}
	}

}
