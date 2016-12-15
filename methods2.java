import java.util.Scanner;

/**
 * 
 */
/**
 * 
 */
/**
 *
 * Name:Althea Briggs 
 * Teacher:Mr.Hardman
 * Assignment #6, Program #
 * Date Last Modified:Dec.13 2016 
 *
 */
/**
/**
import java.util.Scanner;


 * @author A.briggs
 *
 */
public class methods2 {

	private static final int Sum = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner userInput = new Scanner(System.in);
		
		
	double[] student1 = {67.0,57,23.245,89.876,85,90,57,67,73,93,};
		 	  
	double[] student2 = new double[10];  
		 	  
					  
	double average1 = 0;  
	double average2 = 0;  
		 		  
	System.out.println("Please enter ten marks to be averaged:");  
		 		  
	for(int i = 0; i < student2.length; i++){  
			System.out.print("Please enter a mark: ");  
			student2[i] = userInput.nextDouble();
					
	}  
		 	  
	average1 = calcAverage(student1);
	average2 = calcAverage(student2);
					
		System.out.println("Your average is " + average2 + "!");
		 		  
		average1 = Sum / student1.length;  
		 		  
		if(average2 > average1){  
				  
		 System.out.println("Your average is greater than student 1's by " + (average2 - average1) + " points.");  
					  
			} else if(average2 < average1){  
		 			  
		System.out.println("Your average is less than student 1's by " + (average1 - average2) + " points.");  
				  
			} else {  
		 		  
			System.out.println("Your average is equal to student 1's.");  
		 		  
			}  
					
			userInput.close();
					 
	}
	/**
		* calcAverage will calculate users average compared to the other students average
		* 
		* 
		* @param The students marks will be stored.
		* @return average will be sent back, and compared to the other students.
	 */ 
	public static double calcAverage( double[] marks ){
				
		double Sum = 0;
		double average = 0;
					
		for(int i = 0; i < marks.length; i++){  
			Sum += marks[i];
						
			}
					
		average = Sum / marks.length;
		return average;
					
					
						
		}
		 	

		

	}
	

