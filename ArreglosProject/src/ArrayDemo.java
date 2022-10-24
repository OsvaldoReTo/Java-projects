import java.util.Arrays;
import java.util.Iterator;

public class ArrayDemo {

	public static void main(String[] args) {
		String [] meses = {"Enero","Febrero","Marzo", "Abril","Mayo","Junio",
				"Julio", "Agosto", "Septiembre", "Octubre","Noviembre", "Diciembre"};
		for (String mes : meses) {
		System.out.println(mes);	
		}//for Each meses 
		int[] nums = new int[5];
		nums[0] = 16;
		nums[1] = 32;
		nums[2] = 64;
		nums[3] = 128;
		nums[4] = 256;
		//nums[5] = 512
		int[] numerosEnEspera = Arrays.copyOf(nums, nums.length);		
		
		
		nums = new int[7];
		
		for (int i = 0; i < numerosEnEspera.length; i++) {
			nums [i]=numerosEnEspera[i];
		}
		nums[5]=512;
		nums[6]=1024;
		
		System.out.println(nums.length);
		
		for (int num : nums) {
			System.out.println(num);
		}// for each nums
		
		
		System.out.println(meses.length);
		
		//for (int i = 0; i < meses.length; i++) {
			//System.out.println(meses[i]);
		//}//for i
		
	}//main
}//class
