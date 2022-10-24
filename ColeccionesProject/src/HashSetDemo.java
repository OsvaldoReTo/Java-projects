import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> autos = new HashSet<>();
		System.out.println(autos.add("Volvo"));
		System.out.println(autos.add("BMW"));
		System.out.println(autos.add("VW"));
		System.out.println(autos.add("Ford"));
		System.out.println(autos.add("Audi"));
		System.out.println(autos.add("BMW"));
		
		//autos.remove("BMW");
		
		System.out.println(autos.size());
		System.out.println(autos.toString());
		
		autos.forEach((marca)-> mostrarMarca(marca));
		
//		for (String marca : autos) {
//			System.out.println(marca.toUpperCase());
//		}
		
	}//main
		public static void mostrarMarca(String marca) {
			System.out.println("-------------");
			System.out.println("|   " + marca.toUpperCase()+"     |");
			System.out.println("-------------");
			System.out.println();
		}
}// class
