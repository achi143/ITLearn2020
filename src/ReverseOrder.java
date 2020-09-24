import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String s =sc.nextLine();
		
		char[] newString = new char[s.length()];
		
		int j=0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			newString[j] =s.charAt(i);
		
			j++;
			
			System.out.println("Reverse of a string is :");
			
			for(char rev:newString) {
				System.out.print(rev);
			}
			sc.close();
		}
		
		
		

	}

}
