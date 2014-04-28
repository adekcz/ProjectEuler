/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.List;
import projecteuler.helper.MathHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem30 {
    public static final int LIMIT = 354294; //6*9^5
    public static void main(String[] args) {
        int result = 0;
        int[] cache = new int[10];
        for (int i = 0; i < cache.length; i++) {
           cache[i] = i*i*i*i*i; 
        }
        for (int i = 2; i < LIMIT; i++) {
            List<Integer> ciphers = MathHelper.ciphers(i, 10);
            int ciphSum =0;
            ciphSum = ciphers.stream().map((c) -> cache[c]).reduce(ciphSum, Integer::sum);
            if (i==ciphSum){
                System.out.println(i);
                result += i;
            }
            
        }
        System.out.println(result);
        
    }
    
}
