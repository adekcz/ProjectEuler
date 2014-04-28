/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package projecteuler;

/**
 *
 * @author Michal Keda
 */
public class Problem40 {
    public static void main(String[] args) {
        
        int index = 1;
        int currentLenght = 0;
        int currentNumber = 0;
        int tenPower=1;
        
        while(index<1000000){;
            index+=currentLenght;
            currentNumber++;
            if(Math.abs(index-tenPower) < currentLenght+2){
                System.out.println("tenPower: " + tenPower + ", currentNumber: " + currentNumber + ", index: " + index);
            }
            if (currentNumber%tenPower == 0) {
                tenPower*=10;
                currentLenght++;
            }
//1, 10, 100, 1000, 10000, 100000, 1000000
//1 *1 *  5 *  3 * 7      *  2      *1 
            

            
        }
        
    }
}
