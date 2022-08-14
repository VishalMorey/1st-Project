package Pattern;

public class EG4 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
		int star =1;
		
		for(int a=1;a<=8;a++)
		{
			for(int b=1;b<=star;b++)
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}

	}

}
