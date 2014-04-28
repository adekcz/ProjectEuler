/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import projecteuler.helper.Equation;
import projecteuler.helper.MathHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem27 {
    public static void main(String[] args) {
        int result = 0;
        int max = 0;
        for(int a = -999;a<999;a++){
            for(int b = -999;b<999;b++){
                Equation eq = new Equation(1, a, b);
                int i = 1;
                while(MathHelper.isProbablyPrime((int) eq.valueFor(i))){
                    i++;
                }
                if (max< i){
                    System.out.println(eq);
                    result = (int) (eq.getB()*eq.getC());
                    max  = i;
                }
            }
        }
    }
    
}
