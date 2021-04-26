package src;

import java.util.Collections;
import java.util.ArrayList;

public class AvgCalc implements TieHandler {

    public double rCalc(ArrayList<Integer> L) {
        double sum = 0.0;
        for (int i = 0; i < L.size(); i++)
        {
           sum = sum + L.get(i);
        }
        return sum/L.size();
    }
}
