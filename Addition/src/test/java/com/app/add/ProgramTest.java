package com.app.add;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramTest {

	@Test
	public void testForNullCheck() throws Exception {
		
		assertEquals(0, Program.add(null));
	}
	
	@Test
	public void testForEmptyCheck() throws Exception {
		
		assertEquals(0, Program.add(""));
	}
	
	@Test
	public void testForOnePositiveParameterCheck() throws Exception {
		
		assertEquals(1, Program.add("1"));
	}

	
	
	@Test
	public void testForNewLineCheck() throws Exception {
		
		assertEquals(3, Program.add("\n1\n2"));
	}
	@Test
	public void testForMultipleNewLineCheck() throws Exception{
		
		assertEquals(6, Program.add("\n1\n\n2\n\n3"));
	}
	
	@Test
	public void testForSpaceCheck()throws Exception {
		
		assertEquals(10, Program.add("1 2 3 4"));
	}
	
	
	@Test
	public void testForCommaCheck() throws Exception{
		
		assertEquals(10, Program.add("1,2,3,4"));
	}
	
	@Test
	public void testForSemiCommaCheck() throws Exception{
		
		assertEquals(10, Program.add("1;2;3;4"));
	}
	
	@Test
	public void testForUnknownAmountOfNumbersCheck() throws Exception{
		
		assertEquals(20, Program.add("2,2,2,2,2,2,2,2,2,2"));
	}
	
	
	@Test
	public void testForOneNigativeParameterCheck() {
		
		try {
			 Program.add("1,3,-4,7,-9");
		} catch (Exception e) {
			assertEquals("negatives not allowed[-4, -9]", e.getMessage());
		}
	}
	
}
