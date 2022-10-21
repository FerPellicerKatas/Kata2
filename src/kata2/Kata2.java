package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {

        Integer[] data = {4, -5, 3, 4, 2, 9,  -3, -7, 1, 0, -6, 0, 1, 1, 4};
        Histogram histo= new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();

        for (Integer key: histogr.keySet()){
            System.out.println(key + "==>" + histogr.get(key));
        }  
    }
    
}