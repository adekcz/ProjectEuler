/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.ArrayList;
import java.util.List;
import projecteuler.helper.Equation;
/**
 *
 * @author Michal Keda
 */
public class Problem28 {


   public static void main(String[] args) {
       int[][] inputs = {{1,7,21},{1,9,25},{1,3,13},{1,5,17}};
       List<Equation> eqs = new ArrayList<>();

       for(int i = 0; i<inputs.length;i++){
           int c = inputs[i][2] - 9*inputs[i][0]+ 3*(4*inputs[i][0]-inputs[i][1]);
           int b = (-1*inputs[i][1] + 4*inputs[i][0])  - 3*c;
           b=b/2;
           int a = inputs[i][0]*2 + c + (inputs[i][1]-4*inputs[i][0]);
           a = a/2;
           eqs.add(new Equation(a, b, c));
       }
int sum = -3;
       for(Equation eq: eqs){
           System.out.println(eq);
           for(int i = 1; i<=(1001+1)/2;i++){
               sum+= eq.valueFor(i);
               System.out.println(eq.valueFor(i));
               
           }
           System.out.println("");
           
       }
       
       
       System.out.println(sum);
       
   }
}
