/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import projecteuler.helper.EulerHelper;
import projecteuler.helper.MathHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem43 {
    private static int LIMIT = 10;
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        for(int i = 0; i<LIMIT;i++){
            numbers.add(""+i);
        }
        int primes[]  ={2,3,5,7,11,13,17};

        int result = 0;
        List<List<String>> permutations = new ArrayList<>();
        EulerHelper.permutation(numbers, permutations);
        for(List<String> l : permutations){
            String temp = EulerHelper.stringify(l);
            if(EulerHelper.pandigital(0, LIMIT, temp)){
                for(int i = 1;i<8;i++){
                    Integer subInteger = new Integer(temp.substring(i,i+3));
                    if(subInteger.intValue() % primes[i-1] != 0){
                        break;
                    }
                    if(i==7){
                        result++;
                    System.out.println(temp);
                    }
                }
                
            }
            
        }

        System.out.println(result);
    }
    
}
