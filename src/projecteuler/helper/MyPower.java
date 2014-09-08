/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import projecteuler.helper.MathHelper;

/**
 * class for storing "normal form" of numbers in form a**b
 * @author Michal Keda
 */
public class MyPower {
    private List<PowerInteger> factors;
    private PowerInteger original;
    
    public MyPower(int base, int exp){
        factors = new ArrayList<>();
        Map<Integer, Integer> baseFactors= DivisionHelper.primeFactorsMap(base);
        baseFactors.remove(1);
        System.out.println(baseFactors);
        for(Integer baseOfFactor : baseFactors.keySet()){
            factors.add(new PowerInteger(baseOfFactor, exp* baseFactors.get(baseOfFactor)));
        }
        
        original = new PowerInteger(base, exp);
    }

    @Override
    public String toString() {
        return "MyPower{" + "factors=" + factors + ", original=" + original + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.factors);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyPower other = (MyPower) obj;
        if (!Objects.equals(this.factors, other.factors)) {
            return false;
        }
        return true;
    }

    

    
    

    
}
