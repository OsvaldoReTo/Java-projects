import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, String> colores = new HashMap<>();
		
		colores.put("WHITE", "#FFFFFF");
		colores.put("BLACK", "#000000");
		colores.put("RED", "#FF0000");
		colores.put("GREEN", "#00FF00");
		colores.put("BLUE", "#0000FF");
		colores.put("FUCHSIA", "#FF00FF");
		colores.put("PINK", "#FFC8CB");
		colores.put("YELLOW", "#FFFF00");
		colores.put("NAVY", "#000080");
		colores.put("NAVY", "#000088");
		
		System.out.println(colores.size());
		System.out.println(colores.get("NAVY"));//#000088
		System.out.println(colores.containsKey("navy"));

		/*for (String llave : colores.keySet()) {
			System.out.println(llave + " -> "+ colores.get(llave));
		}//foreach*/
		
//		for (String color: colores.values()) {
//			System.out.println(color);
//		}//foreach
		
		colores.forEach((key, value) -> System.out.println(key +" -> "+ value)); 
		
	}

}
