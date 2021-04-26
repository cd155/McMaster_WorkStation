package src;

import java.util.Collections;
import java.util.ArrayList;

public class MaxCalc implements TieHandler {

    public double rCalc(ArrayList<Integer> L) {
        return Collections.max(L);
    }
}
