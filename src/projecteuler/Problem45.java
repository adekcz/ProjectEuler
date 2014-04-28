/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package projecteuler;

import projecteuler.helper.Equation;

/**

 * @author Michal Keda
 */
public class Problem45 {
    public static void main(String[] args) {
        
        int i = 285;
        Equation triangl;
        triangl = new Equation(0.5, 0.5, 0);
        Equation pentagl;
        Equation hexadl;
        do{
            if(i%1000000==0){
                System.out.println(i);
            }
            i++;
            double whatICount = triangl.valueFor(i);
            pentagl = new Equation(3, -1, -2*whatICount);
            hexadl = new Equation(2, -1, -whatICount);
        }
        while (!(pentagl.hasPositiveIntegerSolution() && hexadl.hasPositiveIntegerSolution()));
        System.out.println(i);
        System.out.println(triangl.valueFor(i));
        System.out.println(pentagl);
        System.out.println(hexadl);
            
    }
    
}
