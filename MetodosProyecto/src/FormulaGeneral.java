
public class FormulaGeneral {

	public static void main(String[] args) {
		
	System.out.println(formulaGeneralPositivo(1, -5, 6)); //3
	System.out.println(formulaGeneralPositivo(2, -7, 3)); //3
	System.out.println(formulaGeneralPositivo(1, -2, 1)); //1
	System.out.println(suma(256,512,256));
	System.out.println(suma(1024, 512));
	} // main
	
	public static int suma(int a, int b) {
		return a+b;
	}//suma
	
	public static double suma(double a, double b) {
		return a+b;
	}//suma
	
	public static int suma(int a, int b, int c) {
		return a+b+c;
	}//suma
	

	
	
	public static float formulaGeneralPositivo(float a, float b, float c) {
		
		return (float) (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
		
	}//formulaGeneralPositivo

} //class
