
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//(for stretch challenge i commented out but working fine) so just comment out task 1 to test task 2	

		int year = 2008;
//		
//		String result = ((year % 400 == 0) || (year % 4 == 0) != (year % 100 == 0)) ?  "this is a leap year" : "this is not leap year";
//		System.out.println(result);	

		
//task 1  
// used if statements to find out the year and used several conditions to calculate it. each one
	//will print a certain output depending on if it is divisble by 4, 100 or 400
		if (year % 4 == 0) {
			System.out.println("this is a leap year");
			  }	else if (year % 100 == 0) {
				  System.out.println("this is not leap year");			  
			  }else if (year % 400 == 0) {
				  System.out.println("this is a leap year");
			  }else {
				  System.out.println("this is not leap year");
			  }	

	}

}


// task 2
