package src;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMinMax
{

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
   }

   @After
   public void tearDown()
   {
      tmin = null;
      tmax = null;
      tavg = null;
   }

   @Test
   public void testMinSnorep()
   {
      assertEquals(tmin.rCalc(Snorep), 1.0, 1e-6);
   }

   @Test
   public void testMinSrepfst()
   {
      assertEquals(tmin.rCalc(Srepfst), 1.0, 1e-6);
   }

   @Test
   public void testMinSreplst()
   {
      assertEquals(tmin.rCalc(Sreplst), 1.0, 1e-6);
   }

   @Test
   public void testMaxSnorep()
   {
      assertEquals(tmax.rCalc(Snorep), 4.0, 1e-6);
   }

   @Test
   public void testMaxSrepfst()
   {
      assertEquals(tmax.rCalc(Srepfst), 3.0, 1e-6);
   }

   @Test
   public void testMaxSreplst()
   {
      assertEquals(tmax.rCalc(Sreplst), 3.0, 1e-6);
   }
}
