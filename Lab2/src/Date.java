import java.util.Scanner;
public class Date {
	static boolean checkYear(int year) 
	{ 
	    if (year % 400 == 0) 
	        return true; 
	    if (year % 4 == 0 && year % 100 != 0) 
	        return true;
	    return false; 
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int day,month,year;
		do {
			System.out.println("Enter the year: ");
			year = keyboard.nextInt();
		}while(year < 0);
		do {
			System.out.println("Enter the month: ");
			month = keyboard.nextInt();
		}while(month > 12 || month < 1);
		boolean check = false;
		do {
			System.out.println("Enter the day: ");
			day = keyboard.nextInt();
			boolean checkyear = checkYear(year);
			switch(month) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				if (day > 31 || day < 1) check = true;
				else check = false;
				break;
			case 4:case 6:case 9:case 11:
				if(day > 30 || day < 1) check = true;
				else check = false;
				break;
			case 2:
				if(checkyear && (day < 1 || day > 29)) check = true;
				else if(day < 1 || day > 28) check = true;
				else check = false;
				break;
			}
		}while(check);
		System.out.println("Day/Month/Year: "+ day + " / " + month +" / " + year);
		keyboard.close();
	}
}
