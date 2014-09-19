/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.helper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michal Keda
 */
public class EulerHelperTest {
    
    public EulerHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of merge method, of class EulerHelper.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        List expResult = null;
        List result = EulerHelper.merge(null, null);
        assertTrue("merge null listy",result.isEmpty());
        result = EulerHelper.merge(new ArrayList<Integer>(), new ArrayList<Integer>());
        assertTrue("merge prazdnych listy",result.isEmpty());

        expResult = Arrays.asList(1,2,4,5,6,7);
        result = EulerHelper.merge(Arrays.asList(2,4,6), Arrays.asList(1,5,7));
        assertEquals("nontrivial merge", expResult, result);
    }

    /**
     * Test of truncRight method, of class EulerHelper.
     */
    @Test
    public void testTruncRight() {
        System.out.println("truncRight");
        int n = 0;
        int expResult = 0;
        int result = EulerHelper.truncRight(n);
        assertEquals(expResult, result);
        n = 10;
        expResult = 1;
        result = EulerHelper.truncRight(n);
        assertEquals(expResult, result);
        n = 1234;
        expResult = 123;
        result = EulerHelper.truncRight(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of truncLeft method, of class EulerHelper.
     */
    @Test
    public void testTruncLeft() {
          int n = 0;
        int expResult = 0;
        int result = EulerHelper.truncLeft(n);
        assertEquals(expResult, result);
        n = 10;
        expResult = 0;
        result = EulerHelper.truncLeft(n);
        assertEquals(expResult, result);
        n = 1234;
        expResult = 234;
        result = EulerHelper.truncLeft(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of shiftLeft method, of class EulerHelper.
     */
    @Test
    public void testShiftLeft() {
        System.out.println("shiftLeft");
        int n = 0;
        int shift = 0;
        int expResult = 0;
        int result = EulerHelper.shiftLeft(n, shift);
        assertEquals(expResult, result);
        expResult = 1;
        result = EulerHelper.shiftLeft(1, 0);
        assertEquals(expResult, result);
        expResult = 1;
        result = EulerHelper.shiftLeft(10, 1);
        assertEquals(expResult, result);
        expResult = 123;
        result = EulerHelper.shiftLeft(312, 1);
        assertEquals(expResult, result);
        expResult = 11;
        result = EulerHelper.shiftLeft(101, 1);
        assertEquals(expResult, result);
        expResult = 1234;
        result = EulerHelper.shiftLeft(3412, 2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of containsDupl method, of class EulerHelper.
     */
    @Test
    public void testContainsDupl_int() {
        System.out.println("containsDupl");
        int n = 0;
        boolean expResult = false;
        boolean result = EulerHelper.containsDupl(n);
        assertEquals(expResult, result);
        expResult = false;
        result = EulerHelper.containsDupl(1234);
        assertEquals(expResult, result);
        expResult = false;
        result = EulerHelper.containsDupl(1290);
        assertEquals(expResult, result);
        expResult = false;
        result = EulerHelper.containsDupl(10);
        assertEquals(expResult, result);
        expResult = true;
        result = EulerHelper.containsDupl(12310);
        assertEquals(expResult, result);
    }

    /**
     * Test of pandigital method, of class EulerHelper.
     */
    @Test
    public void testPandigital_int_intArr() {
        System.out.println("pandigital");
        int throught = 0;
        int[] nums = {};
        boolean expResult = true;
        boolean result = EulerHelper.pandigital(throught, nums);
        assertEquals(expResult, result);
        throught = 2;
        int[] numss = {2,1};
        expResult = true;
        result = EulerHelper.pandigital(throught, numss);
        assertEquals(expResult, result);
        throught = 5;
        int[] numsss = {5,123,4};
        expResult = true;
        result = EulerHelper.pandigital(throught, numsss);
        assertEquals(expResult, result);
        throught = 4;
        int[] numss1 = {4,1,12,3};
        expResult = false;
        result = EulerHelper.pandigital(throught, numss1);
        assertEquals(expResult, result);
    }

    /**
     * Test of alphaValue method, of class EulerHelper.
     */
    @Test
    public void testAlphaValue() {
        System.out.println("alphaValue");
        String s = "";
        int expResult = 0;
        int result = EulerHelper.alphaValue(s);
        assertEquals(expResult, result);
        expResult = 53;
        result = EulerHelper.alphaValue("COLIN");
        assertEquals(expResult, result);
        
    }

    /**
     * Test of permutation method, of class EulerHelper.
     */
    @Test
    public void testPermutation() {
        System.out.println("permutation");
        List<List<Integer>> result = new ArrayList<>();
        EulerHelper.permutation(Arrays.asList(1,2,3),result);
        
        List<List<Integer>> exp = new ArrayList<>();
        exp.add(Arrays.asList(1,2,3));
        exp.add(Arrays.asList(1,3,2));
        exp.add(Arrays.asList(2,1,3));
        exp.add(Arrays.asList(2,3,1));
        exp.add(Arrays.asList(3,1,2));
        exp.add(Arrays.asList(3,2,1));
        assertEquals(exp, result);
    }

    /**
     * Test of stringify method, of class EulerHelper.
     */
    @Test
    public void testStringify() {
        System.out.println("stringify");
        String expResult = "";
        String result = EulerHelper.stringify(null);
        assertEquals(expResult, result);
        expResult = "12";
        result = EulerHelper.stringify(Arrays.asList(new Integer(1),new Integer(2)));
        assertEquals(expResult, result);
        expResult = "";
        result = EulerHelper.stringify(Arrays.asList());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

	/**
	 * Test of containsDupl method, of class EulerHelper.
	 */
	@Test
	public void testContainsDupl_String() {
		System.out.println("containsDupl");
		String sn = "123";
		boolean expResult = false;
		boolean result = EulerHelper.containsDupl(sn);
		assertEquals(expResult, result);

		sn = "11";
		expResult = true;
		result = EulerHelper.containsDupl(sn);
		assertEquals(expResult, result);

		sn = "001";
		expResult = true;
		result = EulerHelper.containsDupl(sn);
		assertEquals(expResult, result);
	}

	
	/**
	 * Test of cipherSum method, of class EulerHelper.
	 */
	@Test
	public void testCipherSum() {
		System.out.println("cipherSum");
		BigInteger bi = BigInteger.valueOf(1);
		int expResult = 1;
		int result = EulerHelper.cipherSum(bi);
		assertEquals(expResult, result);

		bi = BigInteger.valueOf(1234);
		expResult = 10;
		result = EulerHelper.cipherSum(bi);
		assertEquals(expResult, result);
		
		bi = BigInteger.valueOf(12340);
		expResult = 10;
		result = EulerHelper.cipherSum(bi);
		assertEquals(expResult, result);

		bi = BigInteger.valueOf(-12340);
		BigInteger unmodified = BigInteger.valueOf(-12340);
		expResult = 10;
		result = EulerHelper.cipherSum(bi);
		System.out.println(bi);
		assertEquals(expResult, result);
		
		bi = BigInteger.valueOf(-12340);
		unmodified = BigInteger.valueOf(-12340);
		expResult = 10;
		result = EulerHelper.cipherSum(bi);
		System.out.println(bi);
		assertEquals(bi, unmodified);
		// TODO review the generated test code and remove the default call to fail.
	}
    
}
