/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.math.BigInteger;

/**
 *
 * @author Michal Keda
 */
public class Problem25 {

    /**
     * @param args the command line arguments
     */

    public static final int LIMIT = 1000;

    public static void main(String[] args) {
        BigInteger f1 = new BigInteger("1");
        BigInteger f2 = new BigInteger("1");
        BigInteger f3 = new BigInteger("0");
        int i = 2;
        while(f3.toString().length()<LIMIT){
            i++;
            f3=f1.add(f2);
            BigInteger temp = f2;
            f2=f3;
            f1=temp;
        }

        
        System.out.println(i);
    }
    
}
