package Pattern;

public class EG9 {

	public static void main(String[] args) {
//		*******
//		******
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
		
		int star=7;
		
		for(int a=1;a<=13;a++)
		{
			for(int b=1;b<=star;b++)
			{
				System.out.print("*");
			}
			if(a<7)
			{
				star--;
			}
			else {
				star++;
			}
			System.out.println();
		}
	}

}
