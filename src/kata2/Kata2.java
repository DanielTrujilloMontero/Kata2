/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        Integer[] data = {1,2,3,4,5,1,2,3,4,5,6,7,8,9,10};
        String[] data = {"a","b","c", "a", "b"};
        Histogram histo = new Histogram(data);
        Map<String, Integer> histogr = histo.getHistogram();
        
        for(String key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
                                                        
    }
    
}
