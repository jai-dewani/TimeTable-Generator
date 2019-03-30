import java.util.*;
class TimeTable{
	String table[][];
	String subjects[][];
	int noOfClassesp[];
	// Number of classes
	static int n = 10;

	TimeTable(){
		table = new String[6][8];
		subjects = new String[n][2];
		noOfClassesp = new int[n];
	}
	void checkTotalHours(){
		int sum = 0;
		for(int i=0;i<n;i++){
			sum += this.noOfClasses[i];
		}
		if(sum>48){
			System.out.println("No of total hours exced the limit.");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Subject Name, Subject Code, Number of hours for that subject: ");
		TimeTable table = new TimeTable();
		for(int i=0;i<n;i++){
			table.subjects[i][0] = scanner.next();
			table.subjects[i][1] = scanner.next();
			table.noOfClassesp[i] = scanner.nextInt();
		}
		//Some Checks 
		talbe.checkTotalHours();
		
		//Printing table
		print(table);
	}
	

	static void print(TimeTable table){
		for(int i=0;i<n;i++){
			System.out.println(table.subjects[i][0]+" "+table.subjects[i][1]+" "+table.noOfClassesp[i]);
		}
	}
}