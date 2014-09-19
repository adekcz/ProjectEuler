/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.helper;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author Michal Keda
 */
public class Timer {
    private java.time.Instant start;
    private java.time.Instant lastCheck;

    public Timer(){
        start = Instant.now();
    }
    public Duration sinceStart(){
		lastCheck = Instant.now();
        return Duration.between(start, Instant.now());
    }

	/**
		* takes into account calls to <b>sinceStart()</b and <b>sinceLastCheck</b>
	 * @return 
	 */
	public Duration sinceLastCheck(){

        Duration result =  Duration.between(lastCheck, Instant.now());
		lastCheck = Instant.now();
		return result;
	}
    
    
}
