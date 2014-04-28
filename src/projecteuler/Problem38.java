/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import projecteuler.helper.EulerHelper;
import projecteuler.helper.MathHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem38 {
    public static void main(String[] args) {
        String max = "";
        int i = 0;
        while(true){
            i++;
            //System.out.println("i: " + i);
            int n = 1;
            String current = "0";
            
            while(current.length()<=10){
                //System.out.println("\tn: " + n + ", current: " + current);

                    if(i==192){
                        System.out.println("");
                    }
                if(n>2 && EulerHelper.pandigital(9, Integer.parseInt(current)) && current.substring(1).compareTo("" + max) >0){
                    System.out.println(current);
                    max = current;
                }
                current+= "" + i*n ;
                n++;
            }
            
            
        }
    }
    
}
