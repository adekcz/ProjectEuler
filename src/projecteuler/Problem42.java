/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import projecteuler.helper.Equation;
import projecteuler.helper.EulerHelper;
import projecteuler.helper.MathHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem42 {
    public static void main(String[] args) throws IOException {

        System.out.println("ahoj");
        int counter =0;
        List<String> lines = Files.readAllLines(Paths.get(".//resources//words.txt")); 
        for(String s : lines){
            if (s.toLowerCase().equals("sky")){
                System.out.println(s);
            }
            Equation eq = new Equation(1, 1, -2*EulerHelper.alphaValue(s));
            if(eq.hasSolutions() && (MathHelper.isInt(eq.getRoot1()) || MathHelper.isInt(eq.getRoot2()))){
                counter++;
                System.out.println("slovo: " + s + " " + eq + "r1 " + eq.getRoot1() + "r2 " + eq.getRoot2());

            }

        }
        System.out.println(counter);

        
}
}
