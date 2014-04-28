/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

/**
 *
 * @author xkeda
 */
public class Problem52 {
	public static boolean sameDigit(int a, int b){
		String ia = new Integer(a).toString();
		String ib = new Integer(b).toString();
		 for (int i = 0; i < ia.length(); i++) {
            if (!ib.contains("" + ia.charAt(i)) ) {
                return false;
            }
			ib = ib.replaceFirst(""+ia.charAt(i), "X");
			ia = ia.replaceFirst(""+ia.charAt(i), "X");
        }

		return true;
	}
	public static void main(String[] args) {
		System.out.println(sameDigit(123456, 654321));
		System.out.println(sameDigit(125874, 251748));
		System.out.println(sameDigit(112345, 122345));
		for(int i = 123456; i< 1000000/6 +1;i++){
			for(int mult = 2;mult<7;mult++){
				if (!sameDigit(i, i*mult)){
					break;
				}
				if(mult==6){
					System.out.println(i);
					return;
				}


			}
		}
	}
	
}
