/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp_exe7;

/**
 *
 * @author hanun
 */
import java.util.*;
public class Dp_exe7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Properties country = new Properties();
        Set C_City;
        String str;
        
        country.put("Ethiopia", "AA");
        country.put("Algeria", "Algiers");
        country.put("Eqypt", "Cairo");
        country.setProperty("Ethiopia", "AA");
        
        System.out.println(country.getProperty("Ethiopia"));
        System.out.println(country.getProperty("Algeria"));
        System.out.println(country.getProperty("Eqypt"));
    }    
}
