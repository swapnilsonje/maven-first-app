package com.maven.sample.mavenfirstapp;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class BasicOperationsTest {

	@Test
	public void testGenerate() {
		assertEquals("Hello Swapnil", BasicOperations.generate("Swapnil"));
	}
	
	public void testGenerate1() {
		assertEquals("Hello Swapnil1", BasicOperations.generate("Swapnil1"));
	}
}
