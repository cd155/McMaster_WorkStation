package src_blank;

import java.util.Collections;
import java.util.ArrayList;

public class MinCalc implements TieHandler
{
    public double rCalc(int[] s)
    {
        int min = 0;
        for (int i : s) {
            if(i > min){
                min = i;
            }
        } 
        return min;
    }
}
