package method;

import java.util.Arrays;


public class methods {
	public double maximum(double a, double b) {


		if (a < b)   

		{
			return b;  
		}
		else { 
			return a ;
		}

	}
	public double multiplication(double a, double b) {
		return a * b; 
	}




	public int existsArray(int [] arr, int a) {	



		for (Integer index = 0; index < arr.length; index++)
		{
			if ( arr[index] == a )
				return index; 
		}

		return -1;




	}

	public int ArrayEquals(int [] a, int [] b) {

		if(Arrays.equals(a,b)) {
			return 0;
		}
		else {		
			return -1;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methods met =new methods();

		System.out.println(met.maximum(9.1, 4.2));

		System.out.println(met.multiplication(9, 10));
		System.out.println(met.existsArray(new int []{19, 2, 3}, 2));
	
		System.out.println(met.ArrayEquals(new int []{2, 9, 3}, new int []{2, 9, 3}));
	



	}
}






