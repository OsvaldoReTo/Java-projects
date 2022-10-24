import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		System.out.print("Escribe tu calificación entre el 0 y 100: "); 
		Scanner sc = new Scanner(System.in);
	     int testScore = sc.nextInt();
	     char grade;
	     if (testScore >=90) {
	    	 grade = 'A';
	     } else if (testScore >= 80) {
	    	 grade = 'B';
	     } else if (testScore >= 70) {
	    	 grade = 'C';
	     } else if (testScore >= 60) {
	    	 grade = 'D';
	     } else {
	    	 grade = 'F';
	     } // if else
	     System.out.println("Calificación con letra = " + grade);
	    
	     sc.close();
	}//main
} //class IfElseDemo
