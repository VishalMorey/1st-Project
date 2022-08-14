package Pattern;

public class EG8 {

	public static void main(String[] args) {
		//    *
		//   * *
		//  * * *
		// * * * *
		//* * * * *
	//   * * * * * *
		 int star=1;
		 int space=5;
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
			 star++;
			 space--;
			 System.out.println();
		 }
		 
		 }
		 
	

}
