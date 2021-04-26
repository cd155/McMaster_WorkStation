package src;

import java.util.Collections;
import java.util.ArrayList;

public class MinCalc implements TieHandler {

    public double rCalc(ArrayList<Integer> L) {
        return Collections.min(L);
    }
}
