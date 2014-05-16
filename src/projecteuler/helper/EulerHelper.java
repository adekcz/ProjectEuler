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

    public static <T extends Comparable> List<T> merge(List<T> a, List<T> b){
        if(a == null){
            a = new ArrayList<>();
        }
        if(b == null){
            b = new ArrayList<>();
        }
        List<T> result = new ArrayList<>();
        int j = 0;
        int i = 0;
        while(true){
            if(i==a.size() || j==b.size()){
                break;
            }
            if(a.get(i).compareTo(b.get(j))<0){
                result.add(a.get(i));
                i++;
                continue;
            }
            if(a.get(i).compareTo(b.get(j))>0){
                result.add(b.get(j));
                j++;
                continue;
            }
            if(a.get(i).compareTo(b.get(j))==0){
                result.add(a.get(i));
                i++;
                continue;
            }
        }
        if(i<a.size()){
            result.addAll(a.subList(i, a.size()));
        }
        if(j<b.size()){
            result.addAll(b.subList(j, b.size()));
        }


        return result;
    } 

    /**
     * Removes right-most digit from number;
     * @param n
     * @return 
     */
    public static int truncRight(int n){
        return n/10;
    }

    /**
     * removes left-most digit from number
     * @param n
     * @return 
     */
    public static int truncLeft(int n){
        return n % MathHelper.pow(10, MathHelper.numberOfDigit(n)-1);
    }

    /**
     * cyclicly shifts number to left
     * @param n
     * @param shift
     * @return 
     */
    public static int shiftLeft(int n, int shift) {
        String temp = BigInteger.valueOf(n).toString();
        for (int i = 0; i < shift; i++) {
            temp = temp.substring(1, temp.length()) + temp.charAt(0);
        }
        return new BigInteger(temp).intValue();
    }

    /**
     * tests whether this number contains some digit more then once
     * @param n
     * @return 
     */
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
        return pandigital(1, throught, inputNumbers);
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

    /**
     * 
     * @param s
     * @return 
     */
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
        if(data==null){
            return "";
        }
        StringBuilder result = new StringBuilder();
        data.stream().forEach(d -> result.append(d.toString()));
        return result.toString();

    }

    
}
