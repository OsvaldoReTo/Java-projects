import static org.junit.jupiter.api.Assertions.*;

import org.generation.exceptions.EmailFormatException;
import org.generation.util.Employee;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasUnitarias {
		Operaciones op = new Operaciones();
		
		@Test
		@DisplayName("Prueba de NULL")
		public void testString() {
			assertNotNull(op.getstrPI());
		}
		
		
		@Test
		@DisplayName("Prueba para obtener un valor de PI aceptable")
		public void testPI() {
			assertTrue(op.getPI()>=3.14);
			assertTrue(op.getPI()<=3.1416);
		}
		
//@Test
//@Disabled("Se esta trabajando en solucionar el problema")
//@DisplayName("Prueba de EmailFormatException en el correo del Employee")	
//public void probarEmail() {
	//Employee armando = new Employee("Armando", 20, "", "XAXX000000001", "CASA", "TI", 250);
	//Exception e = assertThrows(EmailFormatException.class, ()->setEmail("armandoenyahoo"));
	//assertEquals("El formato", e.getMessage());
//}
		
		@Test
		public void probarDivide() {
			//assertEquals(3, op.divide(9, 0));
			Exception e =assertThrows(ArithmeticException.class, ()->op.divide(9,0));
			assertEquals("/ by zero", e.getMessage());
		}//probarDivide
		
		
		@Test
		@DisplayName("Se prueba el m�todo de suma de la clase Operaciones para la calculadora")
		public void probarSumas() {
			assertEquals(107, op.suma(90, 17));
			assertEquals(6, op.suma(3, 3));
			assertEquals(4, op.suma(2, 2));
		}//probarSumas

		@Test
		public void probarMultiplica() {
			assertAll("Multiplica", 
			()-> assertEquals(81, op.multiplica(9, 9)),
			()-> assertEquals(9, op.multiplica(3, 3)),
			()-> assertEquals(4, op.multiplica(2, 2))
			);
		}//probarMultiplica

}//class PruebasUnitarias
