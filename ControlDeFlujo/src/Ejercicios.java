
public class Ejercicios {

	public static void main(String[] args) {
		//Ejercicio 1
		byte max=3;
		for (int i = 1; i <=max; i++) {
			for (int j = 1; j <=max; j++) {
				System.out.println(i + " " + j);
			}// for j
		}//for i */
		
		//Ejercicio 2
		
		for (int j = 6; j > 0; j--) {
			String piramideInv ="";
			for (int i = 0; i < j; i++) {
				piramideInv += " *";
			}// for i
			System.out.println(piramideInv);
		}// for j
		
		// Ejercicio 3
		
		String piramide ="";
		for (int i = 0; i < 5; i++) {
			piramide += " *";
			System.out.println(piramide);
		} //Piramide normal

	}//main
}//class
