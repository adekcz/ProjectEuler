/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import projecteuler.helper.DivisionHelper;
import projecteuler.helper.Timer;

/**
 * //https://projecteuler.net/overview=053 ten pages, best is super optimized approach via Pascal's triangle.
 * @author Michal Keda
 */
public class Problem53 {

	private static Map<Integer, List<Integer>> factorials = new HashMap<>();
	private static Map<Integer, List<Integer>> divisors = new HashMap<>();


	private static void removeAll(List<Integer> a, List<Integer> b){
		for (Integer integer : b) {
			a.remove(integer);
		}

	}


	public static int count = 0;

	public static void main(String[] args) {
		Timer tim = new Timer();
		divisors.put(0, new ArrayList<>());
		for (int i = 1; i <= 600; i++) {
			List<Integer> temp = new ArrayList<>();
			temp.addAll(DivisionHelper.primeFactors(i));
			divisors.put(i, temp);
		}

		factorials.put(0, new ArrayList<>());
		for (int i = 1; i <= 600; i++) {
			List<Integer> temp = new ArrayList<>(factorials.get(i - 1));
			temp.addAll(DivisionHelper.primeFactors(i));
			factorials.put(i, temp);
		}
		for (int i = 1; i <= 600; i++) {
			for (int j = 1; j <= i; j++) {
				List<Integer> comb = new ArrayList<>();
				comb.addAll(factorials.get(i));
				removeAll(comb, factorials.get(j));
				removeAll(comb, factorials.get(i-j));
				int result = 1;
				for (Integer integer : comb) {
					result*= integer;
					if(result >1000000){
						count++;
						//System.out.println("comb(" + i + "," + j+ "): " + result);
						break;
					}
				}

			}
		}
		System.out.println(count);
		System.out.println(tim.stop().toMillis() + " ms");
		return;
	}

}
