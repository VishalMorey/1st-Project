package Pattern;

public class EG10 {

	public static void main(String[] args) {
		int star=1;
		
		
		for(int a=1;a<=7;a++)
		{
			for(int b=1;b<=star;b++)
			{
				System.out.print("*");
			}
			if(a<4)
			{
				star++;
			}
			else {
				star--;
			}
			System.out.println();
		}

	}

}
