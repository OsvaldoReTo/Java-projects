
public class MatrizDemo {

	public static void main(String[] args) {
		int matriz[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
		};
		System.out.println(matriz.length);
		System.out.println(matriz[1][3]);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ,");
			}
			System.out.println();
		}
	}//main

}//class
