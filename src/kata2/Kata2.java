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
        int[] data = {1,2,3,4,5,1,2,3,4,5,6,7,8,9,10};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
       
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for(Integer key : histogram.keySet()) {
            System.out.println(key + " ==> " + histogram.get(key));
        }
                                                        
    }
    
}
