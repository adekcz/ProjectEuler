/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.Arrays;

/**
 *
 * @author Michal Keda
 */
public class Problem31 {
    //COMPLETELY WRONG APPROACH
    private static final int coins[] = {200, 100, 50, 20, 10, 5, 2, 1};
    //private static final int coins[] = { 200, 100, 50};
    private static final int LIMIT = 200;
    private static int result = 0;
    
    public static void rekur(int sum, int index){
        if (index == coins.length || sum + coins[index] > LIMIT){
            return;
        }
        while(sum< LIMIT){
            rekur(sum, index+1);
            sum += coins[index];
        if (sum == LIMIT){
            result++;
        }
        }

    }

    public static void main(String[] args) {
        rekur(0, 0);

        System.out.println(result);

    }
    
}
