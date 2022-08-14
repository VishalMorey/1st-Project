package logicalProgram;

public class WhiteSpaceFromString {

	public static void main(String[] args) {
		String s= "vishal ashok morey";
		int counter=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char blank = s.charAt(i);
			if(blank==' ')
			{
				counter++;
			}
			System.out.println("number of blank space is "+s+"is"+counter);
		}
	}

}
