/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package projecteuler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import projecteuler.helper.MathHelper;

/**
 *
 * @author xkeda
 */
public class Problem37 {
    private static Set<Integer> primesSoFar = new HashSet<>();
    private static boolean truncRight(int n){
        if (n<10){
            return false;
        }
        while (n>0){
            if (!primesSoFar.contains(n)){
                return false;
            }
            n = n/10;
        }
        return true;
    }
    private static boolean truncLeft(int n){
        if (n<10){
            return false;
        }
        while (n>0){
            if (!primesSoFar.contains(n)){
                return false;
            }
            n = n % MathHelper.pow(10, MathHelper.numberOfDigit(n)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        int primeCount = 0;
        
        int current = 3;
        primesSoFar.add(2);
        while(primeCount<11){
            if(MathHelper.isProbablyPrime(current)){
                primesSoFar.add(current);
                if(truncRight(current) && truncLeft(current)){
                    result.add(current);
                    primeCount++;
                    sum+= current;
                    System.out.println(result + " " + primeCount);
                }
            }
            current+=2;
        }
        System.out.println(sum);
    }
    
}