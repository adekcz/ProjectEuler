/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.Set;
import projecteuler.helper.EulerHelper;
import projecteuler.helper.MathHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem35 {
    public static final int LIMIT = 1000000;
    public static void main(String[] args) {
        EulerHelper.shiftLeft(10007, 4);
        Set<Integer> primes = MathHelper.erathones(LIMIT);
        long sum = 0;
        for(int i = 2;i<LIMIT;i++){
            if (primes.contains(i)){
                boolean isCiruclar = true;
                for(int j = 1;j<MathHelper.numberOfDigit(i);j++){
                    int shifted = EulerHelper.shiftLeft(i, j);
                    //System.out.println("original: " + i + " shifted: " + i + " by: " + j);
                    if(!primes.contains(shifted)){
                        isCiruclar = false;
                        break;
                    }
                }
                if(isCiruclar){
                    //System.out.println(i + " is circular, sum so far is: " + sum);
                    sum += 1;
                }
            }
        }

        System.out.println(sum);
    }

    
}
