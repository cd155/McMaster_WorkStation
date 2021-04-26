package src_blank;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TestSeq1D
{
   TieHandler mint = new MinCalc();
   TieHandler maxt = new MaxCalc();

   @Test
   public void testNormalRankMin()
   {
      ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(10, 1, 9, 100));
      Seq1D test1 = new Seq1D(input1, mint);
      assertEquals(test1.rank(1), 0, 1e-6);
      assertEquals(test1.rank(9), 1, 1e-6);
      assertEquals(test1.rank(10), 2, 1e-6);
      assertEquals(test1.rank(100), 3, 1e-6);
   }

   @Test
   public void testNormalRankMax()
   {
      ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(10, 1, 9, 100));
      Seq1D test1 = new Seq1D(input1, maxt);
      assertEquals(test1.rank(1), 0, 1e-6);
      assertEquals(test1.rank(9), 1, 1e-6);
      assertEquals(test1.rank(10), 2, 1e-6);
      assertEquals(test1.rank(100), 3, 1e-6);
   }

   @Test (expected=IllegalArgumentException.class)
   public void testRankEmpty()
   {
      ArrayList<Integer> input1 = new ArrayList<Integer>();
      Seq1D test1 = new Seq1D(input1, mint);
      assertEquals(test1.rank(1), 0, 1e-6);
   }

   @Test (expected=IllegalArgumentException.class)
   public void testRankNotExist()
   {
      ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(10, 1, 9, 100));
      Seq1D test1 = new Seq1D(input1, mint);
      assertEquals(test1.rank(2), 0, 1e-6);
   }

   @Test
   public void testRankAllMin()
   {
      ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1));
      Seq1D test1 = new Seq1D(input1, mint);
      assertEquals(test1.rank(1), 0, 1e-6);
   }

   @Test
   public void testRankAllMax()
   {
      ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1));
      Seq1D test1 = new Seq1D(input1, maxt);
      assertEquals(test1.rank(1), 3, 1e-6);
   }

   @Test
   public void testNormalRankMultipleMin()
   {
      ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(9, 1, 9, 100));
      Seq1D test1 = new Seq1D(input1, mint);
      assertEquals(test1.rank(1), 0, 1e-6);
      assertEquals(test1.rank(9), 1, 1e-6);
      assertEquals(test1.rank(100), 3, 1e-6);
   }

   @Test
   public void testNormalRankMultipleMax()
   {
      ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(10, 1, 100, 100));
      Seq1D test1 = new Seq1D(input1, maxt);
      assertEquals(test1.rank(1), 0, 1e-6);
      assertEquals(test1.rank(10), 1, 1e-6);
      assertEquals(test1.rank(100), 3, 1e-6);
   }
}
