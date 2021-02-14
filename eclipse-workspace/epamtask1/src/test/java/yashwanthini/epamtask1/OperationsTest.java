package yashwanthini.epamtask1;

import static org.junit.Assert.*;
import org.junit.Test;
public class OperationsTest 
{
	@Test
	/*
	 * Test Cases for addition
	 */
	public void testAdd()
	{
		Operations o = new Operations();
		assertEquals(8,o.add(5, 3));
		assertEquals(-6,o.add(3, -9));
		assertEquals(-14,o.add(-5, -9));
	}
	@Test
  /*
   * Test cases for subtraction
   */
		
	public void testSubtract()
	{
		Operations o = new Operations();
		assertEquals(-2,o.subtract(0,2));
		assertEquals(8,o.subtract(10, 2));
		assertEquals(-19,o.subtract(3, 22));
		
	}
	
	@Test
	/*
	 * Test Cases for Multiplication
	 */
	public void testMul() {
		Operations o = new Operations();
		assertEquals(35,o.mul(5, 7));
		assertEquals(-21,o.mul(-3, 7));
		assertEquals(20,o.mul(-5, -4));
	}
	@Test
	/*
	 * Test Cases for Division
	 */
	public void testDiv() {
		Operations o = new Operations();
		assertEquals(3,o.div(15, 5));
		assertEquals(-1,o.div(0, 0));
		assertEquals(-1,o.div(15, 0));
		assertEquals(-1,o.div(9, 99));
	}
}