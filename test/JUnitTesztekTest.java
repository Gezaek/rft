/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junittesztek.JUnitTesztek;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
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
    } 
    
    // Author: Inántsy-Pap Tamás, AWFRNE
    @Test
    public void testOsszeAd2() {
        System.out.println("osszeAd2");
        double a = 0.0;
        double b = 3.1415;
        JUnitTesztek instance = new JUnitTesztek();
        double expResult = a + b;
        double result = instance.osszeAd(a, b);
        assertEquals(expResult, result, 0.0);
    } 
}
