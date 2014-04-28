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
public class Problem33 {
    private static MyDecimal simplify(int num, int den){
        String numS = num + "";
        String denS = den + "";
        String union = "";
        for(int i = 0;i<numS.length();i++){
            if(denS.contains(numS.charAt(i) + "")){
                union += numS.charAt(i);
            }
        }
        for(int i = 0;i<union.length();i++){
            numS = numS.replace(""  + union.charAt(i), "");
            denS = denS.replace(""  + union.charAt(i), "");
        }

        if (numS.length() == 0){
            numS = "1";
        }
        if (denS.length() == 0){
            denS = "1";
        }
        if("0".equals(denS)){
            denS = "-1";
        }
        return new MyDecimal(Integer.parseInt(numS), Integer.parseInt(denS));
    }

    public static void main(String[] args) {
        for(int i = 10; i<99;i++ ) {
            for(int j = i+1; j<99;j++ ) {
                MyDecimal md = new MyDecimal(i, j);
                MyDecimal simplified = (simplify(md.getNumerator(), md.getDenominator()));
                if (!md.equals(simplified) && md.getDenominator() != 0 && simplified.getDenominator()!= 0 && Double.compare(
                            md.getValue(), 
                            simplified.getValue())
                        ==  0){
                    if(md.getNumerator()%10 != 0 || md.getDenominator()%10 != 0){
                    System.out.println(md + "\n" + simplified);
                    System.out.println("");
                    }
                }
                
            }
            
        }
        
    }

    
}
