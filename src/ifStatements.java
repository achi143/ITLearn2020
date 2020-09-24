
public class ifStatements {

	public static void main(String[] args) {
		
		String vDay;
		
		vDay="sun";
		
		/*if(vDay=="mon") {
			System.out.println("WeekDay");
		}
		if(vDay=="Tue") {
			System.out.println("WeekDay");
		}
		if(vDay=="wed") {
			System.out.println("WeekDay");
		}
		if(vDay=="Thu") {
			System.out.println("WeekDay");
		}
		if(vDay=="Fri") {
			System.out.println("WeekDay");
		}
		if(vDay=="Sat") {
			System.out.println("weekEnd");
		}
		if(vDay=="sun") {
			System.out.println("weekEnd");
		}
		*/
		
		if(vDay=="mon" || vDay=="Thu"||vDay=="Tue"||vDay=="Fri"||vDay=="Wed"){
			System.out.println("Weekdays");
		}
		if(vDay=="sun" || vDay=="Sat"){
			System.out.println("WeekEnds");
		}

	}
}
