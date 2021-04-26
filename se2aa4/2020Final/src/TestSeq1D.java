package src;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TestSeq1D
{

   private Seq1D<Integer> s;
   private ArrayList<Integer> Sempty;
   private ArrayList<Integer> Snorep;
   private ArrayList<Integer> Srepfst;
   private ArrayList<Integer> Sreplst;
   private ArrayList<Integer> Srepmid;
   private ArrayList<Integer> Sallrep;
   private ArrayList<Integer> Srvslst;
   private TieHandler tmin;
   private TieHandler tmax;
   private TieHandler tavg;

   @Before
   public void setUp()
   {
      Sempty = new ArrayList<Integer>();
      Snorep = new ArrayList<Integer>(Arrays.asList(2, 1, 3, 4));
      Srepfst = new ArrayList<Integer>(Arrays.asList(2, 1, 3, 1));
      Sreplst = new ArrayList<Integer>(Arrays.asList(2, 1, 3, 3));
      Srepmid = new ArrayList<Integer>(Arrays.asList(2, 1, 3, 2));
      Sallrep = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1));
      Srvslst = new ArrayList<Integer>(Arrays.asList(4, 3, 2, 1));
      tmin = new MinCalc();
      tmax = new MaxCalc();
      //tavg = new AvgCalc();
   }

   @After
   public void tearDown()
   {
      s = null;
      tmin = null;
      tmax = null;
      tavg = null;
   }

   @Test (expected=IllegalArgumentException.class)
   public void testMinCalcEmpty()
   {
      s = new Seq1D<Integer>(Sempty, tmin);
      assertEquals(s.rank(1), 0.0, 1e-6);
   }

   @Test
   public void testMinCalcNoRep()
   {
      s = new Seq1D<Integer>(Snorep, tmin);
      assertEquals(s.rank(1), 0.0, 1e-6);
      assertEquals(s.rank(2), 1.0, 1e-6);
      assertEquals(s.rank(3), 2.0, 1e-6);
      assertEquals(s.rank(4), 3.0, 1e-6);
   }

   @Test
   public void testMinCalcRepFst()
   {
      s = new Seq1D<Integer>(Srepfst, tmin);
      assertEquals(s.rank(1), 0.0, 1e-6);
      assertEquals(s.rank(2), 2.0, 1e-6);
      assertEquals(s.rank(3), 3.0, 1e-6);
   }

   @Test
   public void testMinCalcRepLst()
   {
      s = new Seq1D<Integer>(Sreplst, tmin);
      assertEquals(s.rank(1), 0.0, 1e-6);
      assertEquals(s.rank(2), 1.0, 1e-6);
      assertEquals(s.rank(3), 2.0, 1e-6);
   }

   @Test
   public void testMinCalcRepMid()
   {
      s = new Seq1D<Integer>(Srepmid, tmin);
      assertEquals(s.rank(1), 0.0, 1e-6);
      assertEquals(s.rank(2), 1.0, 1e-6);
      assertEquals(s.rank(3), 3.0, 1e-6);
   }

   @Test
   public void testMinCalcAllRep()
   {
      s = new Seq1D<Integer>(Sallrep, tmin);
      assertEquals(s.rank(1), 0.0, 1e-6);
   }

   @Test
   public void testMinCalcRvsLst()
   {
      s = new Seq1D<Integer>(Srvslst, tmin);
      assertEquals(s.rank(3), 2.0, 1e-6);
   }

   @Test
   public void testMaxCalcNoRep()
   {
      s = new Seq1D<Integer>(Snorep, tmax);
      assertEquals(s.rank(1), 0.0, 1e-6);
      assertEquals(s.rank(2), 1.0, 1e-6);
      assertEquals(s.rank(3), 2.0, 1e-6);
      assertEquals(s.rank(4), 3.0, 1e-6);
   }

   @Test
   public void testMaxCalcRepFst()
   {
      s = new Seq1D<Integer>(Srepfst, tmax);
      assertEquals(s.rank(1), 1.0, 1e-6);
      assertEquals(s.rank(2), 2.0, 1e-6);
      assertEquals(s.rank(3), 3.0, 1e-6);
   }

   @Test
   public void testMaxCalcRepLst()
   {
      s = new Seq1D<Integer>(Sreplst, tmax);
      assertEquals(s.rank(1), 0.0, 1e-6);
      assertEquals(s.rank(2), 1.0, 1e-6);
      assertEquals(s.rank(3), 3.0, 1e-6);
   }

   @Test
   public void testMaxCalcRepMid()
   {
      s = new Seq1D<Integer>(Srepmid, tmax);
      assertEquals(s.rank(1), 0.0, 1e-6);
      assertEquals(s.rank(2), 2.0, 1e-6);
      assertEquals(s.rank(3), 3.0, 1e-6);
   }

   @Test
   public void testMaxCalcAllRep()
   {
      s = new Seq1D<Integer>(Sallrep, tmax);
      assertEquals(s.rank(1), 3.0, 1e-6);
   }

   @Test
   public void testMaxCalcRvsLst()
   {
      s = new Seq1D<Integer>(Srvslst, tmax);
      assertEquals(s.rank(3), 2.0, 1e-6);
   }

/* //Not required to do tests with average
   @Test
   public void testAvgCalcNoRep()
   {
      s = new Seq1D<Integer>(Snorep, tavg);
      assertEquals(s.rank(1), 0.0, 1e-6);
      assertEquals(s.rank(2), 1.0, 1e-6);
      assertEquals(s.rank(3), 2.0, 1e-6);
      assertEquals(s.rank(4), 3.0, 1e-6);
   }

   @Test
   public void testAvgCalcRepFst()
   {
      s = new Seq1D<Integer>(Srepfst, tavg);
      assertEquals(s.rank(1), 0.5, 1e-6);
      assertEquals(s.rank(2), 2.0, 1e-6);
      assertEquals(s.rank(3), 3.0, 1e-6);
   }

   @Test
   public void testAvgCalcRepLst()
   {
      s = new Seq1D<Integer>(Sreplst, tavg);
      assertEquals(s.rank(1), 0.0, 1e-6);
      assertEquals(s.rank(2), 1.0, 1e-6);
      assertEquals(s.rank(3), 2.5, 1e-6);
   }

   @Test
   public void testAvgCalcRepMid()
   {
      s = new Seq1D<Integer>(Srepmid, tavg);
      assertEquals(s.rank(1), 0.0, 1e-6);
      assertEquals(s.rank(2), 1.5, 1e-6);
      assertEquals(s.rank(3), 3.0, 1e-6);
   }

   @Test
   public void testAvgCalcAllRep()
   {
      s = new Seq1D<Integer>(Sallrep, tavg);
      assertEquals(s.rank(1), 1.5, 1e-6);
   }

   @Test
   public void testAvgCalcRvsLst()
   {
      s = new Seq1D<Integer>(Srvslst, tavg);
      assertEquals(s.rank(3), 2.0, 1e-6);
   }
*/
   @Test (expected=IllegalArgumentException.class)
   public void testIllegalArgException()
   {
      s = new Seq1D<Integer>(Snorep, tmin);
      s.rank(-1);
   }

}
