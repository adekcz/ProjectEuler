/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import projecteuler.helper.MathHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem39 {
    public static void main(String[] args) {
        int maxNumberOfSolution = 0;

        for(int perimeter = 1;perimeter<1001;perimeter++){
            int currentNumberOfSolutions = 0;
       //         int perimeter =120;
            //this could be much better maybe
            for (int i = 1; i < perimeter+1; i++) {
                for (int j = i; j < perimeter-i+1; j++) {
                    //for (int k = j; k < perimeter-i-j+1; k++) {
                    double sqRoot = Math.pow(i*i+j*j, 0.5) ;
                        if (MathHelper.isInt(sqRoot) && i+j+sqRoot == perimeter){
                            //System.out.println("\ti: "+ i + "j: "+ j + "k: " + sqRoot);
                            currentNumberOfSolutions++;
                        }
                    //}
                }
            }
            if(currentNumberOfSolutions> maxNumberOfSolution){
                System.out.println("perimeter: " + perimeter);
                maxNumberOfSolution = currentNumberOfSolutions;
                System.out.println(maxNumberOfSolution);
            }

        }

        System.out.println(maxNumberOfSolution);
    }
    
}
