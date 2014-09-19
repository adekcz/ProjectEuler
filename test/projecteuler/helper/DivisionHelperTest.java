/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author adekcz
 */
public class DivisionHelperTest {
	
	public DivisionHelperTest() {
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
	 * Test of primeFactorsMap method, of class DivisionHelper.
	 */
	@Test
	public void testPrimeFactorsMap() {
		System.out.println("primeFactorsMap");
		long n = 0L;
		Map<Integer, Integer> expResult = new HashMap<>();
		Map result = DivisionHelper.primeFactorsMap(n);
		assertEquals(expResult, result);

		 n = 1L;
		 expResult = new HashMap<>();
		 expResult.put(1, 1);
		 result = DivisionHelper.primeFactorsMap(n);
		assertEquals(expResult, result);

		 n = 5L;
		 expResult = new HashMap<>();
		 expResult.put(1, 1);
		 expResult.put(5, 1);
		 result = DivisionHelper.primeFactorsMap(n);
	    assertEquals(expResult, result);

		 n = 16L;
		 expResult = new HashMap<>();
		 expResult.put(1, 1);
		 expResult.put(2, 4);
		 result = DivisionHelper.primeFactorsMap(n);
		assertEquals(expResult, result);

		 n = 1200;
		 expResult = new HashMap<>();
		 expResult.put(1, 1);
		 expResult.put(3, 1);
		 expResult.put(5, 2);
		 expResult.put(2, 4);
		 result = DivisionHelper.primeFactorsMap(n);
		assertEquals(expResult, result);
	}

	/**
	 * Test of divisors method, of class DivisionHelper.
	 */
	@Test
	public void testDivisors() {
		System.out.println("divisors");
		System.out.println("naiveDivisors");
		long n = 0L;
		Set<Integer> expResult = new HashSet<>();
		Set<Integer> result = DivisionHelper.divisors(n);
		assertEquals(expResult, result);

		n = 5L;
		expResult = new HashSet<>();
		expResult.add(1);
		expResult.add(5);
		result = DivisionHelper.divisors(n);
		assertEquals(expResult, result);

		n = 24L;
		expResult = new HashSet<>();
		expResult.addAll(Arrays.asList(1,2,3,4,6,8,12,24));
		result = DivisionHelper.divisors(n);
		assertEquals(expResult, result);
	}

	/**
	 * Test of numberOfDivisors method, of class DivisionHelper.
	 */
	@Test
	public void testNumberOfDivisors() {
		System.out.println("numberOfDivisors");
		long n = 0L;
		int expResult = 0;
		int result = DivisionHelper.numberOfDivisors(n);
		assertEquals(expResult, result);

		n = 12L;
		expResult = 6;
		result = DivisionHelper.numberOfDivisors(n);
		assertEquals(expResult, result);
		
	}
	
	/**
	 * Test of primeFactors method, of class DivisionHelper.
	 */
	@Test
	public void testPrimeFactors() {
		System.out.println("primeFactors");
		long n = 0L;
		List<Integer> expResult = new ArrayList<>();
		List<Integer> result = DivisionHelper.primeFactors(n);
		assertEquals(expResult, result);
		
		n = 16L;
		expResult = new ArrayList<>();
		expResult.addAll(Arrays.asList(1,2,2,2,2));
		result = DivisionHelper.primeFactors(n);
		assertEquals(expResult, result);

		n = 24L;
		expResult = new ArrayList<>();
		expResult.addAll(Arrays.asList(1,2,2,2,3));
		result = DivisionHelper.primeFactors(n);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of naiveDivisors method, of class DivisionHelper.
	 */
	@Test
	public void testNaiveDivisors() {
		System.out.println("naiveDivisors");
		long n = 0L;
		List<Integer> expResult = new ArrayList<>();
		List<Integer> result = DivisionHelper.naiveDivisors(n);
		assertEquals(expResult, result);
		
		n = 5L;
		expResult = new ArrayList<>();
		expResult.add(1);
		expResult.add(5);
		result = DivisionHelper.naiveDivisors(n);
		assertEquals(expResult, result);
		
		n = 24L;
		expResult = new ArrayList<>();
		expResult.addAll(Arrays.asList(1,2,3,4,6,8,12,24));
		result = DivisionHelper.naiveDivisors(n);
		assertEquals(expResult, result);
	}
	
}
