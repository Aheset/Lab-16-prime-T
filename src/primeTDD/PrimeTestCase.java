package primeTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTestCase {

	@Test
	
	public void testPrimeThatReturnsFalseWhen2()
	{
		boolean result = Main.prime(2);
		assertEquals(false, result);
	}
	
	@Test
	
	public void testPrimeThatReturnsFalseWhen3()
	{
		boolean result = Main.prime(3);
		assertEquals(false, result);
	}

	@Test
	
	public void testPrimeThatReturnsTruewhen6()
	{
		boolean result = Main.prime(6);
		assertEquals(true, result);
	}
	
	@Test
	
	public void testPrimeThatReturnsFalsewhen7(){
		boolean result = Main.prime(7);
		assertEquals(false, result);
	}
	
	@Test
	
	public void testPrimeThatReturnsFalsewhen25(){
		boolean result = Main.prime(25);
		assertEquals(false, result);
	}
	
		
}
