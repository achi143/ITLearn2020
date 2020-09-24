import java.util.Scanner;

public class Driving {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("you drove to fast . your speed is :");
		
		int a = s.nextInt();
		
		System.out.println("when is your bday");
		
		String bday = s.next();
		
		String bdaygift ="Today";
		
		int fspeed=0;
		if(bday.equals(bdaygift)) {
			
			fspeed = a-5;
		
		}
		
		else {
			
			fspeed=a;
		}
		if(fspeed<=60) {
			
			System.out.println("0=No ticket");
		}
		else if (fspeed>=61 && fspeed<=80){
			
			System.out.println("1=small ticket");
			
		}else
		{
			System.out.println("2=big ticket");
		}
		
	}

}
