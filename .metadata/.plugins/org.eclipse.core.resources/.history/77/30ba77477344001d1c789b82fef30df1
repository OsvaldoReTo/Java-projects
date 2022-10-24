import java.io.Console; //se importa paquetería para considerar el console

public class codigo6 {
	
	
	//Función main  
	public static void main(String[] args) {
		//creación de método main para que se ejecute el programa
	    int[] n = new int[20]; //No se había añadido la expresión new para crear nuevo array
	    //for para asignar valores dentro del array
	    for (int i = 0; i < 20; i++) { //falta de un "+" en la expresión for
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//falta de out para ser un output y se escriba cada elemento
	    }
	    Console cnsl = System.console();
	    if (cnsl == null) {
	    	System.out.println("n");
	    }
	    int opcion = Integer.parseInt(cnsl.readLine());//falta de un paréntesis
	    System.out.println("\n¿Qué números quiere resaltar? ");// hacía falta una n para imprimir
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

	    int multiplo = (opcion == 1) ? 5 : 7; //if ternario mal escrito es: (cond)?Y:N

	    for (int e : n) { //error de sintaxis no es un foreach sería solo for también hay error en el tipo de dato, es int no char
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }else {//hacía falta cerrar sentencia if antes de abrir else
	        System.out.print(e + " ");//no es un input así que no debe ser .in sino .out
	      }//if-else
	    }//forEach
	   }//main
	}//class