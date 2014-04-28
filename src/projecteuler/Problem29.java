package projecteuler;

import java.util.HashSet;
import java.util.Set;
import projecteuler.helper.MyPower;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michal Keda
 */
public class Problem29 {
    public static void main(String[] args) {
        Set< MyPower> powers = new HashSet<>();
        for(int a = 2;a<=100;a++){
            for(int b = 2;b<=100;b++){
                System.out.println("--- a, b, " + a + ", " + b + " ---");
                powers.add(new MyPower(a, b));
            }
        }
        System.out.println(powers);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(powers.size());
    }
    
}
