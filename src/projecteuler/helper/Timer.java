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
    public Timer(){
        start = Instant.now();
    }
    public Duration stop(){
        return Duration.between(start, Instant.now());
    }
    
    
}
