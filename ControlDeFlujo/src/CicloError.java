
public class CicloError {
	public static void main(String[] args) {
		int max= 100;
		int cont = 0;
		int total = 0;
		while (cont<max) {
			total = suma(total,cont);
			cont++;
		}//while
		
		System.out.println("El total es: " + total);

	}//main
	
	public static int suma(int t, int c) {
		int res = 0;
		res = t+c;
		return res;
	}//suma
}// class CicloError
