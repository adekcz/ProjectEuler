/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.helper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/**
 *
 * @author Michal Keda
 */
public class MathHelper {
    public static boolean isInt(double d){
        if ((d == Math.floor(d)) && !Double.isInfinite(d)) {
            return true;
        }
        return false;
    }
    public static long pow (long a, int b)
    {
        if ( b == 0)        return 1;
        if ( b == 1)        return a;
        if (b%2==0)    return     pow ( a * a, b/2); //even a=(a^2)^b/2
        else                return a* pow ( a * a, b/2); //odd  a=a*(a^2)^b/2
        
    }
    public static int pow (int a, int b)
    {
        if ( b == 0)        return 1;
        if ( b == 1)        return a;
        if (b%2==0)    return     pow ( a * a, b/2); //even a=(a^2)^b/2
        else                return a* pow ( a * a, b/2); //odd  a=a*(a^2)^b/2
        
    }
    
    public static boolean isProbablyPrime(int p){
        return BigInteger.valueOf(p).isProbablePrime(5);
    }
    
    public static boolean isPrime(int p){
        return DivisionHelper.primeFactors(p).size() == 1;
    }
    
    /**
     * not using logarithm
     * @return
     */
    public static int numberOfDigit(int n){
        int result = 0;
        while(n>0){
            result++;
            n/=10;
        }
        return result;
    }
    public static Set<Integer> erathones(int limit){
        Set<Integer> candidates = new HashSet<>();
        candidates.add(2);
        for(int i =3;i<limit;i+=2){
            candidates.add(i);
        }
        for(int i = 3; i<limit;i+=2){
            //System.out.println("i: " + i);
            if(candidates.contains(i)){
                for(int j = 2*i;j<limit;j+=i){
                    //System.out.println("\tj: " + j);
                    candidates.remove(j);
                }
            }
        }
        return candidates;
        
        
        
    }
    
    
    public static <T extends Number> int sum(Collection<T> n){
        int result = 0;
        
        result = n.stream().map((t) -> t.intValue()).reduce(result, Integer::sum);
        
        return result;
    }
    
    public static long fact(long n){
        long result = 1;
        while(n>0){
            result*=n;
            n--;
        }
        return result;
    }
    
    public static List<Integer> ciphers(int i, int base){
        List<Integer> result = new ArrayList<>();
        while (i>0){
            result.add(i%base);
            i/=base;
        }
        Collections.reverse(result);
        
        return result;
    }
    
    
    
    
}
