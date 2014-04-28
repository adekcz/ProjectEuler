/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projecteuler.helper.EulerHelper;

/**
 *
 * @author Michal Keda
 */
public class Problem22 {
    public static void main(String[] args) {

        System.out.println("ahoj");
        long result =0L;
        try {
            List<String> lines = Files.readAllLines(Paths.get(".//resources//names.txt"));
            
            Collections.sort(lines);
            for (int i =0 ;i<lines.size();i++){
                result+= EulerHelper.alphaValue(lines.get(i)) * (i+1);
                System.out.println(lines.get(i) + " " + result);
            }
        } catch (IOException ex) {
            Logger.getLogger(Problem22.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(result);
        
    }
    
}
