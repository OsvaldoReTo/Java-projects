package org.generation.util;

public class PayRoll {
		
	public static void printReceipt(Pagable e) {
		System.out.println("============================");
		System.out.println("| Recibo de pago de: " );
		System.out.println("| Nombre: " + e.getName());
		System.out.println("| RFC: " + e.getRFC());
		System.out.println("| Por la cantidad de: " + String.format("%.2f", e.calculateSalary(30)));
		System.out.println("============================");
	}//printReceipt
	
}//class PayRoll
