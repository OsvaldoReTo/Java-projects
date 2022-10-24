
public class TipoDeDatos {

	public static void main(String[] args) {
		// Definicion de una variable entera llamada edad
		byte edad =20;
		edad++;
		byte primeras = 100;
		short lineasCodigo = 120;
		// lineasCodigo = primeras; // Cast implicito
		
		primeras = (byte)lineasCodigo;
		System.out.println("primeras: " + primeras);
		
		boolean flag = false; //true false
		char inicial = '!';
		System.out.println("Byte.MIN_VALUE: "+ Byte.MIN_VALUE);
		System.out.println("Byte.MAX_VALUE: "+ Byte.MAX_VALUE);
		System.out.println("Byte.SIZE: "+ Byte.SIZE);
		System.out.println("Short.MIN_VALUE: "+ Short.MIN_VALUE);
		System.out.println("Short.MAX_VALUE: "+ Short.MAX_VALUE);
		System.out.println("Short.SIZE: "+ Short.SIZE);
		System.out.println("Integer.MIN_VALUE: "+ Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE: "+ Integer.MAX_VALUE);
		System.out.println("Integer.SIZE: "+ Integer.SIZE);
		System.out.println("Float.MIN_VALUE: "+ Float.MIN_VALUE);
		System.out.println("Float.MAX_VALUE: "+ Float.MAX_VALUE);
		System.out.println("Float.SIZE: "+ Float.SIZE);
		System.out.println("Double.MIN_VALUE: "+ Double.MIN_VALUE);
		System.out.println("Double.MAX_VALUE: "+ Double.MAX_VALUE);
		System.out.println("Double.SIZE: "+ Double.SIZE);
		
	} // static void

} // class 
