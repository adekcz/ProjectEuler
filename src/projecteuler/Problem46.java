/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package projecteuler;

import projecteuler.helper.MathHelper;

/**
 *
 * @author adekcz
 */
public class Problem46 {
	
	public static void main(String[] args) {
		int number = 27;
		while(true){
			if(!MathHelper.isProbablyPrime(number)){
				int base = 1;
				boolean found = false;
				int reminder =number - 2*base*base;
				while (reminder > 0 ){
					if(MathHelper.isProbablyPrime(reminder)){
						found = true;
						break;
					}
					base++;
					reminder =number - 2*base*base;
				}
				if (!found){
					System.out.println(number);
					return;
				}
			}
			
			
			number +=2;
		}
		
	}
	
}
