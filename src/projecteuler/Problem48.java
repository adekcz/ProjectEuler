/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerveskole;

/**
 *
 * @author xkeda
 */
public class Problem48 {
	/*
	* arr1.length == arr2.length
	*/
	public static int[] addToArray(int[] arr1, int[] arr2){
		int[] result = new int[arr1.length];
		int carry = 0;
		for(int i = arr1.length-1; 0<i;i--){
			result[i] = arr1[i] + arr2[i]+ carry;
			carry = result[i]/10;
			result[i] = result[i] %10;
		}
		return result;
	}

	public static void mulitplyArray(int[] ar, int mult){
		
		int carry = 0;
		for(int i = ar.length-1; 0<i;i--){
			ar[i] = ar[i]*mult + carry;
			carry = ar[i]/10;
			ar[i] = ar[i] %10;
		}
	}
	public static int[] createArray(int num, int len){
		int[] result = new int[len];
		while(num>0 && len>0){
			len--;
			result[len] = num %10;
			num = num/10;
		}

		return result;
	}

	public static void	printArray(int[] arr){
		for(int i : arr){
			System.out.print(i);
		}
		System.out.println("");
	}

	private static int LIMIT = 1001;
	private static int ARRAY_SIZE = 11;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		int[] result = new int[ARRAY_SIZE];
		for(int i = 1;i<LIMIT;i++){
			int[] temp = createArray(i, ARRAY_SIZE);
			for(int j =1; j<i;j++){
				mulitplyArray(temp, i);
			}
			System.out.print("i: " + i + ": ");
			printArray(temp);
			result = addToArray(result, temp);
		} 
		printArray(result);
 
    }
    
}
