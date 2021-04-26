package src_blank;

import java.util.Collections;
import java.util.ArrayList;

public class MaxCalc implements TieHandler
{
    public double rCalc(int[] s)
    {
        int max = 0;
        for (int i : s) {
            if(i > max){
                max = i;
            }
        } 
        return max;
    }
}