/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.List;
import java.util.Set;
import projecteuler.helper.EulerHelper;
import projecteuler.helper.MathHelper;

/**
 *
 * @author adekcz
 */
public class Problem50 {
	private static int limit = 1_000_000;
	public static void main(String[] args) {
		Set<Integer> primesSet = MathHelper.erathones(limit);
		List<Integer> primes = MathHelper.erathonesList(limit);
		int maxPrime = 2;
		int maxStreak = 1;
		int[] arrays = new int[primes.size()];

		for(int i =0;i<primes.size();i++){
			arrays[i] = primes.get(i);
		}
		for(int i =1;i<primes.size()/2;i++){
			for(int j=0;j<primes.size()-i+1; j++){
				arrays[j] += primes.get(j+i);
				if(arrays[j]>=limit){
					break;
				}
				if (primesSet.contains(arrays[j]) && maxStreak<i){
					maxPrime = arrays[j];
					maxStreak = i;
				}

			}
			//EulerHelper.printArray(arrays);

		}

		System.out.println(maxPrime);
	}
	
}
