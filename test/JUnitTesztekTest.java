import junittesztek.JUnitTesztek;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class JUnitTesztekTest {
    
   @Test
    public void testOsszeAd() {
        System.out.println("osszeAd");
        double a = -11.5;
        double b = 2.0;
        JUnitTesztek instance = new JUnitTesztek();
        double expResult = -9.5;
        double result = instance.osszeAd(a, b);
        assertEquals(expResult, result, 0.0);
    } // Author: Inántsy-Pap Tamás, AWFRNE
    
    
    @Test
    public void testOsszeAd2() {
        System.out.println("osszeAd2");
        double a = 0.0;
        double b = 3.1415;
        JUnitTesztek instance = new JUnitTesztek();
        double expResult = a + b;
        double result = instance.osszeAd(a, b);
        assertEquals(expResult, result, 0.0);
    }  // Author: Inántsy-Pap Tamás, AWFRNE
   
    
    
    @Test
    public void testKivonas1() {
        System.out.println("kivonas1");
        double c = 20;
        double d = 12;
        JUnitTesztek instance = new JUnitTesztek();
        double expResult = c-d;
        double result = instance.kivonas(c, d);
        assertEquals(expResult, result, 8);
    }// Author: Pethő Tibor
    
    @Test
    public void testKivonas2() {
        System.out.println("kivonas2");
        double c = 22;
        double d = 12;
        JUnitTesztek instance = new JUnitTesztek();
        double expResult = c-d;
        double result = instance.kivonas(c, d);
        assertEquals(expResult, result, 10);
    } // Author: Pethő Tibor
    
    @Test
    public void testOsztas1() {
        System.out.println("osztaas1");
        double e = 12;
        double f = 6;
        JUnitTesztek instance = new JUnitTesztek();
        double expResult = e/f;
        double result = instance.osztas(e, f);
        assertEquals(expResult, result, 2);
    } // Author: Barcsay Mark
    
        @Test
    public void testOsztas2() {
        System.out.println("osztaas2");
        double e = 100.0;
        double f = 5.0;
        JUnitTesztek instance = new JUnitTesztek();
        double expResult = e/f;
        double result = instance.osztas(e, f);
        assertEquals(expResult, result, 20);
      
    } // Author: Barcsay Mark
}
