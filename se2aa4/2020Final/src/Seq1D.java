package src;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class Seq1D<T extends Comparable<T>> {
   protected ArrayList<T> s;
   protected TieHandler tieHandler;

   public Seq1D(ArrayList<T> S, TieHandler t) {
      s = S;
      tieHandler = t;
   }

   public void setTieHandler(TieHandler t) {
      tieHandler = t;
   }    

   public double rank(T p) {
      if (!(s.contains(p))) {
         throw new IllegalArgumentException("Argument is not contained in the sequence");
      }
      Collections.sort(s);
      return tieHandler.rCalc(indexSet(p, s));
   }

   private ArrayList<Integer> indexSet(T t, ArrayList<T> B) {
      ArrayList<Integer> tempLst = new ArrayList<Integer>();
      for (int k = 0; k < B.size(); k++) {
         if (t.equals(B.get(k))) {
            tempLst.add(k);
         }
      }
      return tempLst;
   }
}
