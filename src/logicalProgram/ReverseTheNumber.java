package logicalProgram;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int number=123456789;
		String s = Integer.toString(number);
         String r="";
         for(int i=s.length()-1;i>=0;i--)
         {
        	 r=r+s.charAt(i);
         }
         int revNumber = Integer.parseInt(r);
         System.out.println("original number is"+number);
         System.out.println("reverse Number is"+revNumber);
	}

}
