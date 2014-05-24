/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Michal Keda
 */
public class DivisionHelper {

    /**
     * @param n
     * @return Map<factor, exponentOfFactor>
     */
    public static Map primeFactorsMap(long n) {
        List<Integer> factors = primeFactors(n);
        Map<Integer, Integer> result = new HashMap<>();
        for (Iterator<Integer> it = factors.iterator(); it.hasNext();) {
            Integer integer = it.next();
            if (result.containsKey(integer)) {
                result.put(integer, result.get(integer) + 1);
            } else {
                result.put(integer, 1);
            }
            it.remove();
        }
        return result;
    }


    /**
     * 
     * @param n
     * @return Set containing all divisors of number (6: 1,2,3,6)
     */
    public static Set divisors(long n) {
        Set<Integer> result = new HashSet<>();
        result.add(1);
        Set<Integer> temp = new HashSet<>();
        Map<Integer, Integer> factors = primeFactorsMap(n);
        for (Map.Entry<Integer, Integer> entry : factors.entrySet()) {
            Integer key = entry.getKey();
            int counter = factors.get(key);
            while (counter > 0) {
                temp.addAll(result);
                temp.stream().forEach((Integer integer) -> {
                    result.add(integer * key);
                });
                result.addAll(temp);
                temp.clear();
                counter--;
            }
        }
        return result;
    }

    public static int numberOfDivisors(long n) {
        Map<Integer, Integer> factors = primeFactorsMap(n);
        int result = 1;
        for (Integer i : factors.values()) {
            result *= (i + 1);
        }
        return result / 2;
    }

    /**
     * There is no longer number "1" in the list since 18.4.2014.
     * list is ordered
     * @param n
     * @return
     */
    public static List primeFactors(long n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                result.add(i);
                n = n / i;
            }
        }
        return result;
    }

    public static List naiveDivisors(long n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        return result;
    }
    
}
