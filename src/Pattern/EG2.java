package Pattern;

public class EG2 {

	public static void main(String[] args) {
   
//	*
//	**
//	***
//	****
//	*****
//	******
//	*******

		//row=7  star=1
		int star=1;
		for(int a=1;a<=7;a++)
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
