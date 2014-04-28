/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import projecteuler.helper.MyDecimal;

/**
 *
 * @author Michal Keda
 */
public class Problem26 {
    public static void main(String[] args) {
        int max = 0;
        MyDecimal mdmax = new MyDecimal(1, 1);
        for(int i =1;i<1000;i++){
            MyDecimal md = new MyDecimal(1, i);
            if(md.getReccurence() > max ){
                max =  md.getReccurence();
                mdmax = md;
            }

        }
        System.out.println(mdmax);
    }
    
}
