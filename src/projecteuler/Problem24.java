/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.ArrayList;
import java.util.List;
import projecteuler.helper.MathHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem24 {
    public static void main(String[] args) {
        long target = 999999;
        long nums = 10;
        List<Integer> numbers = new ArrayList<>();
        List<Long> result = new ArrayList<>();
        

        for(int i =0;i<nums;i++){
            numbers.add(i);
        }
        int i = 0;
        while(nums>0){
            System.out.println(target);
            long current = target / MathHelper.fact(nums-1);
            //System.out.println(current);
            result.add(numbers.get((int) current).longValue());
            numbers.remove((int) current);
            target = target % MathHelper.fact(nums-1);
            nums--;
        }

        System.out.println(result);
        System.out.println(numbers);
        
    }
    
}
