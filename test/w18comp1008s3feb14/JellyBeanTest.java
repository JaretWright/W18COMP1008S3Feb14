package w18comp1008s3feb14;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JWright
 */
public class JellyBeanTest
{
    JellyBean validBean;
    
    public JellyBeanTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
        validBean = new JellyBean("Blue","blueberry","JellyBelly");
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getColor method, of class JellyBean.
     */
    @Test
    public void testGetColor()
    {
        String expResult = "blue";
        String result = validBean.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setColor method, of class JellyBean.
     */
    @Test
    public void testSetColorInvalid()
    {
        try{
            validBean.setColor("Pink");
            fail("Only red, white, blue and orange are valid colors");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
        
    }

    /**
     * Test of getFlavour method, of class JellyBean.
     */
    @Test
    public void testGetFlavour()
    {
        System.out.println("getFlavour");
        JellyBean validBean = null;
        String expResult = "";
        String result = validBean.getFlavour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlavour method, of class JellyBean.
     */
    @Test
    public void testSetFlavour()
    {
        System.out.println("setFlavour");
        String flavour = "";
        JellyBean validBean = null;
        validBean.setFlavour(flavour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrand method, of class JellyBean.
     */
    @Test
    public void testGetBrand()
    {
        System.out.println("getBrand");
        JellyBean validBean = null;
        String expResult = "";
        String result = validBean.getBrand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBrand method, of class JellyBean.
     */
    @Test
    public void testSetBrand()
    {
        System.out.println("setBrand");
        String brand = "";
        JellyBean validBean = null;
        validBean.setBrand(brand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
