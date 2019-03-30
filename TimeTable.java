import java.util.*;
class TimeTable{
	String table[][];
	String subjects[][];
	int noOfClasses[];
	int listOfClesses[][];
	// Number of Subjects
	static int n = 10;
	//Random Genrator
	static Random random;

	TimeTable(){
		table = new String[6][8];
		subjects = new String[n][2];
		noOfClasses = new int[n];
		random = new Random();
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
	static int genrateRandom(int min, int max){
		return random.nextInt(max-min)+min;
	}
	void GenrateTable(){
		for(int i=0;i<n;i++){
			for(int j=0;j<this.noOfClasses[i];j++){
				while(!flag){
					int x = genrateRandom(0,6);
					int y = genrateRandom(0,8);
					boolean flag = false;
					for(k=0;i<8;k++){
						if(this.table[x][k]==this.subjects[i][1]){
							flag = true;
							break;
						}
					}					
				}
				this.table[x][y] = subjects[i];
			}
		}
		printTable(this);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Subject Name, Subject Code, Number of hours for that subject: ");
		TimeTable table = new TimeTable();
		for(int i=0;i<n;i++){
			table.subjects[i][0] = scanner.next();
			table.subjects[i][1] = scanner.next();
			table.noOfClasses[i] = scanner.nextInt();
		}
		//Some Checks 
		talbe.checkTotalHours();
		
		//Printing table
		print(table);
	}
	
	static void printTable(TimeTable table){
		for(int i=0;i<6;i++){
			for(int j=0;j<8;j++){
				System.out.println(table.table[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void print(TimeTable table){
		for(int i=0;i<n;i++){
			System.out.println(table.subjects[i][0]+" "+table.subjects[i][1]+" "+table.noOfClasses[i]);
		}
	}
}