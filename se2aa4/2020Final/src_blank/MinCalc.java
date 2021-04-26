package src_blank;

import java.util.Collections;
import java.util.ArrayList;

public class MinCalc implements TieHandler
{
    public double rCalc(ArrayList<Integer> s)
    {
        int min = s.get(0);

        for (Integer i : s) {
            if(i < min){
                min = i;
            }
        } 
        return min;
    }
}
