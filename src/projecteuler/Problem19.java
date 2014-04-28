/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;

/**
 *
 * @author Michal Keda
 */
public class Problem19 {
    public static void main(String[] args) {
        java.time.LocalDate start = LocalDate.of(1901, 1, 1);
        java.time.LocalDate end = LocalDate.of(2000, 12, 31);
        java.time.LocalDate current = start;


        int sundays = 0;
        while(current.compareTo(end)<0){
            if (current.getDayOfMonth() == 1 && current.getDayOfWeek() == DayOfWeek.SUNDAY){
                System.out.println(current);
                sundays++;
            }
            current = current.plusMonths(1);

        }
        System.out.println(sundays);
    }
 
}
