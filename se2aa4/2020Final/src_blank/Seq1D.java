package src_blank;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class Seq1D<T extends Comparable<T>>
{
    protected ArrayList<T> s;
    protected TieHandler tieHandler;

    public Seq1D(ArrayList<T> setT, TieHandler handler)
    {
        s = setT;
        tieHandler = handler;
    }

    public void setTieHandler(TieHandler handler)
    {
        tieHandler = handler;
    }

    public double rank(T item){
        boolean isExist = false;
        for (T t : s) {
            if(t == item){
                isExist = true;
            }
        }

        if(!isExist)
        {
            throw new IllegalArgumentException();
        }

        Collections.sort(s);
        ArrayList<Integer> finding = new ArrayList<Integer>();
        for(int i = 0; i<s.size(); i++)
        {
            if(s.get(i) == item){
                
                finding.add(i);
            }
        }

        return tieHandler.rCalc(finding);
    }
}