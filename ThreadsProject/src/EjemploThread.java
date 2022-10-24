import java.util.ArrayList;

public class EjemploThread {
	public static ArrayList<Integer> lista = new ArrayList<>();
	public static int max = 100;
	
	
	public static void main(String[] args) {
		Productor prod1 = new Productor();
		Productor prod2 =  new Productor();
		Consumidor cons1= new Consumidor();
		Consumidor cons2= new Consumidor();
		
		prod1.start();
		prod2.start();
		Thread tc1 = new Thread(cons1);
		Thread tc2 = new Thread(cons2);
		tc1.start();
		tc2.start();

	}//main

}//class EjemploThread
