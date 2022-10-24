
public class Pares {

	public static void main(String[] args) {
		// Sumar los primeros 100 pares
/*		int max =200;
		int suma=0;
		for (int i = 2; i <=max; i+=2) {
			suma += i;
		}// for
		
		System.out.println("La suma de los primeros "+ (max/2) + " números pares es: " + suma);*/

		int n=100;
		int suma=0;
		for (int i = 0; i <= n; i++) {
			suma +=2*i;
		}
		System.out.println("La suma de los primeros "+ n + " números pares es: " + suma);
		
		// Sumar los primeros m numeros impares
		int m=100;
		int sum=0;
		for (int j = 0; j < m; j++) {
			sum +=(2*j)+1;
		}
		System.out.println("La suma de los primeros "+ m + " números impares es: " + sum);
		
/*		int i=0,j=0;
		int n=100;
		int suma=0, sum=0;
		while (i<n) {
			i++;
			suma+=2*i;
		}
		System.out.println("La suma de los primeros "+ n + " números pares es: " + suma);
		
		do {
			sum+=2*j;
			j++;
		} while (j<n);
		System.out.println("La suma de los primeros "+ n + " números pares es: " + sum);*/
		
	} //main
}//class Pares
