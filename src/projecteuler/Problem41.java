/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import projecteuler.helper.EulerHelper;
import projecteuler.helper.MathHelper;
import projecteuler.helper.Timer;

/**
 *
 * @author Michal Keda
 */
public class Problem41 {
    public static void main(String[] args) {
        Timer t = new Timer();
        //next time for pandigitals primes:
        
//Note: Nine numbers cannot be done (1+2+3+4+5+6+7+8+9=45 => always dividable by 3)
//Note: Eight numbers cannot be done (1+2+3+4+5+6+7+8=36 => always dividable by 3)

        
        
        for(int i =7654323; i>1;i-=2){
            //why do youEulerHelper even numbers?
            if(EulerHelper.pandigital(MathHelper.numberOfDigit(i), i)){
                if(MathHelper.isProbablyPrime(i)){
                    System.out.println(i);
                    break;
                }

            }
            

        }
        System.out.println(t.stop());
    }
    
}
