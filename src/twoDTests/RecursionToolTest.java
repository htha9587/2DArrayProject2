package twoDTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import twoDModel.twoDModel;

/**
 * @author Cody Henrichsen
 * @version 0.x Feb 17, 2016
 */
public class RecursionToolTest
{
	private twoDModel testTool;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		testTool = new twoDModel(toString());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
		testTool = null;
	}

	/**
	 * Test method for {@link ctec.model.RecursionTool#getFibNumber(double)}.
	 */
	@Test
	public void testGetFibNumber()
	{
		assertTrue(1 == testTool.fibonacciNumber(0));
		assertTrue(8 == testTool.fibonacciNumber(5));
		assertTrue(3 == testTool.fibonacciNumber(3));
		assertTrue(Integer.MIN_VALUE == testTool.fibonacciNumber(-5));
	}

	/**
	 * Test method for {@link ctec.model.RecursionTool#getFactorialNumber(double)}.
	 */
	@Test
	public void testGetFactorialNumber()
	{
		assertTrue(1 == testTool.factorialNumber(0));
		assertTrue(120 == testTool.factorialNumber(5));
		assertTrue(6 == testTool.factorialNumber(3));
		//assertFalse(Integer.MIN_VALUE == testTool.factorialNumber(-5));
	}

}
