import org.generation.exceptions.EmailFormatException;
import org.generation.util.Consultor;
import org.generation.util.Employee;
import org.generation.util.Manager;
import org.generation.util.PayRoll;
import org.generation.util.Person;

public class TestPerson {

	public static void main(String[] args) {
		Employee martin = null;
		Employee mafer = null;
		Manager alam = null;
		Consultor gustavo = new Consultor("Gustavo S.A.", "GUSA200101X1", 950.20);
		
		try {
		mafer = new Employee("Mafer Hern�ndez", 21, "mafer@GMAIL.com", "Conocido", 
				"HEGM010101XYZ", "IT", 500.50);
		mafer.setAge(15);
		System.out.println(mafer);
		} catch (EmailFormatException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
		martin = new Employee("Mart�n N��ez", 22, "123456789@facultad.unam.mx", "Casa",
				"XAXX000000001", "IT", 389.20);
		System.out.println(martin.toString());
		} catch (EmailFormatException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
	try	{alam = new Manager("Alam Hern�ndez", 24, "donalama@gmail.com", "Domicilio Desconocido",
							"XAXX000000001", "IT", 750.21, 23, 250.50);
			System.out.println(alam);
		} catch (EmailFormatException e) {
			e.printStackTrace();
		
		}
//		martin.name = "Mart�n N��ez";
//		martin.age = 22;
//		martin.email="martin@gmail.com";
		
		PayRoll.printReceipt(mafer);
		PayRoll.printReceipt(martin);
		PayRoll.printReceipt(alam);
		PayRoll.printReceipt(gustavo);
//		System.out.println(mafer.calculateSalary(30));
//		System.out.println(martin.calculateSalary(30));
//		System.out.println(alam.calculateSalary(30));
//		System.out.println(Person.getTotal());
	}//main
}//class TestPerson
