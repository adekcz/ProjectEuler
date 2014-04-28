/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.Collections;
import java.util.List;
import projecteuler.helper.MathHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem36 {
    private static int LIMIT = 1000000;
    public static void main(String[] args) {
        int sum = 0;
        for(int i =0;i<LIMIT;i++){
            List<Integer> ciphers10 = MathHelper.ciphers(i, 10);
            List<Integer> ciphers10rev = MathHelper.ciphers(i, 10);
            List<Integer> ciphers2 = MathHelper.ciphers(i, 2);
            List<Integer> ciphers2rev = MathHelper.ciphers(i, 2);
            Collections.reverse(ciphers10rev);
            Collections.reverse(ciphers2rev);
            if (ciphers10.equals(ciphers10rev) && ciphers2.equals(ciphers2rev)){
                //System.out.println("i: " + i + " " + ciphers2); 
                sum+=i;
            }
        }
            System.out.println(sum);
    }
    
}
