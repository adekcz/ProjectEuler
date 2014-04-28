/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import projecteuler.helper.DivisionHelper;
import projecteuler.helper.MathHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem23 {
    private static int LIMIT = 28123;
    public static void main(String[] args) {
        Integer[] numbers = new Integer[LIMIT+1];
        Arrays.fill(numbers, 0);
        List<Integer> abundant = new ArrayList<>();

        numbers[0] = 0;
        for(int i=1;i<LIMIT;i++){
            if(MathHelper.sum(DivisionHelper.divisors(i)) - i > i){
                abundant.add(i);
            }
        }
        System.out.println(abundant);
        for (int i = 0; i < abundant.size(); i++) {
            for (int j = 0; j < abundant.size(); j++) {
                if (abundant.get(i)+abundant.get(j)< LIMIT){
                    numbers[abundant.get(i)+abundant.get(j)] = 1;
                }
            }
        }

        long result = 0;

        for (int j = 0; j < LIMIT; j++) {
            if (numbers[j]==0){
                result+= j;
            }
        }

        System.out.println(result);

    }
    
}
