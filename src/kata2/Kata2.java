package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        
        int[] data = {4, -5, 3, 4, 2, 9,  -3, -7, 1, 0, -6, 0, 1, 1, 4};
        HashMap <Integer, Integer> histogram = new HashMap <Integer, Integer>();

        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }

        for (Integer key: histogram.keySet()){
            System.out.println(key + "==>" + histogram.get(key));
        }  
    }
    
}