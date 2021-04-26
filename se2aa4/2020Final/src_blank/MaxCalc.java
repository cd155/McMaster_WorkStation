package src_blank;

import java.util.Collections;
import java.util.ArrayList;

public class MaxCalc implements TieHandler
{
    public double rCalc(ArrayList<Integer> s)
    {
        int max = 0;
        for (Integer i : s) {
            if(i > max){
                max = i;
            }
        } 
        return max;
    }
}