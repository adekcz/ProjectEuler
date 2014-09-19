/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.math.BigInteger;
import projecteuler.helper.EulerHelper;
import projecteuler.helper.Timer;

/**
 *
 * @author adekcz
 */
public class Problem56 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		int max = 0;
		for(int a = 1;a<100;a++){
			BigInteger power = BigInteger.valueOf(a);
			BigInteger b_a = BigInteger.valueOf(a);
			for (int b = 1; b < 100; b++) {
				power = power.multiply(b_a);
				int currentPower  =EulerHelper.cipherSum(power);
				if (max< currentPower){
					max = currentPower;
				}
			}

		}
		System.out.println(timer.sinceStart());

		System.out.println(max);

	}
	
}
