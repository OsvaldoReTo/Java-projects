import java.util.ArrayList;
import java.util.List;
//Una lista permite elementos duplicados
//Mantiene un orden del  indice
// add agrega elementos al final
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(35);	numeros.add(33);	numeros.add(42);
		numeros.add(10);	numeros.add(14);	numeros.add(19);
		numeros.add(27);	numeros.add(44);	numeros.add(26);
		numeros.add(31);	numeros.add(31);
		
		System.out.println(numeros.size());
		System.out.println(numeros.toString());
		System.out.println("IndexOf(44): "+ numeros.indexOf(44));//7
		System.out.println(numeros.get(7));//true
		System.out.println(numeros.contains(44));//true
		System.out.println(numeros.isEmpty());//false
	int total = 0;
		for (int i = 0; i < numeros.size(); i++) {
		total += numeros.get(i);
		//System.out.println(numeros.get(i));
	}//for
		System.out.println("Suma Total es: " + total);
		total =0;
	for (Integer numero : numeros) {
		//System.out.println(numero);
		total += numero;	
	}//foreach
	System.out.println("Suma Total es: " + total);
	
	//numeros.forEach((num) -> writeNumber(num));
	numeros.forEach((num) -> paresImpares(num));
	}//main

	public static void paresImpares(int num){
		//System.out.println("El n�mero " + num + ((num%2==0)? " es par": " es impar") );
		if (num%2==0) {
			System.out.println("El n�mero "+ num + " es: par");
		} else {
			System.out.println("El n�mero "+ num + " es: impar");
		};
	};//writeNumber
/*	public static void writeNumber(int num){
		System.out.print(num + " *2 = ");
		System.out.println(num*2);
	};//writeNumber*/
}//class
