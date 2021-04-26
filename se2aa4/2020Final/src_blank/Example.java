package src_blank;
import java.util.Arrays;
import java.util.ArrayList;

public class Example
{
   public static void main(String[] args) 
    {
        TieHandler mint = new MinCalc();
        TieHandler maxt = new MaxCalc();
        ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(10, 1, 9, 100));
        Seq1D test1 = new Seq1D(input1, mint);
        System.out.println(test1.rank(9));
    }
}