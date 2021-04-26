package src_blank;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class Seq1D
{
    protected T[] s;
    protected TieHandler tieHandler;

    public Seq1D(T[] setT, TieHandler handler)
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

        if(isExist)
        {
            throw new IllegalArgumentException();
        }

        T[] newSorted = Collections.sort(s); 
        ArrayList<Integer> finding = new ArrayList<Integer>();
        for(int i = 0; i<finding.size(); i++)
        {
            if(newSorted[i] == item){
                finding.add(i);
            }
        }
        return finding;
    }
}