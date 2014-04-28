/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.HashSet;
import java.util.Set;
import projecteuler.helper.EulerHelper;
import projecteuler.helper.MathHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem32 {
    private static final int LIMIT = 31427; //sqrt(987654321) + 1
    public static void main(String[] args) {
        
        //for pandigital primes
//Note: Nine numbers cannot be done (1+2+3+4+5+6+7+8+9=45 => always dividable by 3)
//Note: Eight numbers cannot be done (1+2+3+4+5+6+7+8=36 => always dividable by 3)

        Set<Integer> alreadyDone = new HashSet<>();
        int sum = 0;
        for(int i = 1; i< LIMIT;i++){
            if (EulerHelper.containsDupl(i)){
                continue;
            }
            for(int j = 1; j< LIMIT;j++){
                if (EulerHelper.containsDupl(j)){
                    continue;
                }
                int multiple = i*j;
                if (EulerHelper.containsDupl(multiple)){
                    continue;
                }
                if (alreadyDone.contains(multiple)){
                    continue;
                }
                if(EulerHelper.pandigital(9, i, j, multiple)){
                    System.out.println(i + " " + j + " " + multiple);
                    alreadyDone.add(multiple);
                    sum+= multiple;
                }
            }
            if(i%123==0){
                //System.out.println(i + " ---- " + sum);
            }

        }
        System.out.println(sum);
        
    }
    
}
