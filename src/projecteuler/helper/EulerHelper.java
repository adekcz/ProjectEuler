/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.helper;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michal Keda
 */
public class EulerHelper {

    public static int truncRight(int n){
        return n/10;
    }
    public static int truncLeft(int n){
        return n % MathHelper.pow(10, MathHelper.numberOfDigit(n)-1);
    }
    public static int shiftLeft(int n, int shift) {
        String temp = BigInteger.valueOf(n).toString();
        for (int i = 0; i < shift; i++) {
            temp = temp.substring(1, temp.length()) + temp.charAt(0);
        }
        return new BigInteger(temp).intValue();
    }

    public static boolean containsDupl(int n) {
        String sn = n + "";
        return containsDupl(sn);
    }

    public static boolean containsDupl(String sn) {
        for (int i = 0; i < sn.length(); i++) {
            if (sn.lastIndexOf(sn.charAt(i)) != i) {
                return true;
            }
        }
        return false;
    }

    public static boolean pandigital(int throught, int... nums) {
        String inputNumbers = "";
        for (int i = 0; i < nums.length; i++) {
            inputNumbers += "" + nums[i];
        }
        return pandigital(throught, inputNumbers);
    }
    public static boolean pandigital(int throught, String inputNumbers) {
        return pandigital(1, throught+1, inputNumbers);
    }
    public static boolean pandigital(int from, int throught, String inputNumbers) {
        if (inputNumbers.length() != throught) {
            return false;
        }
        for (int i = from; i < inputNumbers.length(); i++) {
            if (!inputNumbers.contains(i + "")) {
                return false;
            }
        }
        return true;
    }

    public static int alphaValue(String s) {
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            value += s.charAt(i) - 'A' + 1;
        }
        return value;
    }

    public static <T> void permutation(List<T> inputs, List<List<T>> permutations) {
        perm(inputs, new ArrayList<T>(), permutations);
    }

    //in problem43 you filter results. You could use lambda as parameter, to restrict generatign of unuasble numbers
    public static <T> void perm(List<T> inputs,List<T> current ,List<List<T>> permutations) {
        if(inputs.isEmpty()){
            permutations.add(current);
        }
        for (T t : inputs) {
            List<T> newCurrent = new ArrayList<>();
            newCurrent.addAll(current);
            newCurrent.add(t);
            List<T> tempInput = new ArrayList<>();
            tempInput.addAll(inputs);
            tempInput.remove(t);
            perm(tempInput, newCurrent, permutations);
        }


    }
    public static <T> String  stringify(List<T> data){
        StringBuilder result = new StringBuilder();
        for(T t : data){
            result.append(t.toString());
        }
        return result.toString();

    }

    
}
