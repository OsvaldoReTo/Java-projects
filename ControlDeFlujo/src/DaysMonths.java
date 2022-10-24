import java.util.Scanner;
public class DaysMonths {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe el número del mes (1-12): ");
		int month = in.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes tiene 31 días");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes tiene 30 días");
			break;
		default:
			System.out.println("El mes tiene 28/29 días");
			break;
		}//switch
		in.close();
		/*String monthDays = "";
		switch (month) {
		case 1: monthDays = "31";
			break;
		case 2: monthDays = "28/29";
			break;
		case 3: monthDays = "31";
			break;
		case 4: monthDays = "30";
			break;
		case 5: monthDays = "31";
			break;
		case 6: monthDays = "30";
			break;
		case 7: monthDays = "31";
			break;
		case 8: monthDays = "31";
			break;
		case 9: monthDays = "30";
			break;
		case 10: monthDays = "31";
			break;		
		case 11: monthDays = "30";
			break;
		case 12: monthDays = "31";
			break;
		default: monthDays = "Mes inválido";
			break;
		}//switch
		System.out.println("El mes tiene: " + monthDays + " días");
		in.close();*/
		//switch 31-30 -28/29
	}// main

}// 
