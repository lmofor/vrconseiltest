/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import testvrconseil.Readfile;
import testvrconseil.Tondeuse;

/**
 *
 * @author admin
 */
public class TondeuseTest {
    
    Tondeuse td= new Tondeuse(1,2, 'N');
    
    @Test
   public void Testpivotergauche()
    {
         td.pivoterGauche();
        assertEquals('W', td.getOrientation());
    }
    
    @Test
    public void TestpivoterDroite()
    {
        td.pivoterDroite();
        assertEquals('E', td.getOrientation());
    }
    
    @Test
    public void testAVancer()
    {
        
        
    }
    
    @Test
    public void TestSimuler()
    {
        this.td.simuler("GAGAGAGAA", 5, 5);
        assertEquals("1 3 N",this.td.toString());
    }
}
