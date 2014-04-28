/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Michal Keda
 */
public class MyDecimal{
    private int whole;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numerator;
        hash = 37 * hash + this.denominator;
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
        final MyDecimal other = (MyDecimal) obj;
        if (this.numerator != other.numerator) {
            return false;
        }
        if (this.denominator != other.denominator) {
            return false;
        }
        return true;
    }
    private List<Integer> decimals;
    private int reccurence;
    
    private final int numerator; //horni cislo
    private final int denominator; // dolni cast

    public MyDecimal(int a, int b){
        this.decimals = new ArrayList<>();
        this.numerator = a;
        this.denominator = b;

        whole = numerator/denominator;
        computeDecimals();
    }


    public int getWhole() {
        return whole;
    }

    public List<Integer> getDecimals() {
        return decimals;
    }

    public int getReccurence() {
        return reccurence;
    }

    /**
     * horni cislo
     * @return 
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * dolni cislo
     * @return 
     */
    public int getDenominator() {
        return denominator;
    }

    private void computeDecimals() {
        List<Integer> cache = new ArrayList<>();
        int rest = numerator % denominator;
        while(!cache.contains(rest) &&  rest != 0){
            cache.add(rest);
            rest *= 10;
            decimals.add(rest/denominator);
            rest = rest % denominator;
        }
        int recur = 0;
        int backtrackedRest;
        cache.add(rest);
        if (rest == 0 ){
            this.reccurence = recur;
            return;
        }

        do{
            int currentPosition = decimals.size() -1 - recur;
            backtrackedRest = decimals.get(currentPosition) * denominator + cache.get(currentPosition+1);
            backtrackedRest /= 10;

            recur++;
        }while(rest!=backtrackedRest);
        cache.remove(cache.size()-1);
        this.reccurence = recur;
    }
    
    @Override
    public String toString() {
        return "MyDecimal{" + "whole=" + whole + ", decimals=" + decimals + ", reccurence=" + reccurence + ", numerator=" + numerator + ", denominator=" + denominator + '}';
    }

    public double getValue(){
        return (double) numerator / (double) denominator;

    }

    
    
}
