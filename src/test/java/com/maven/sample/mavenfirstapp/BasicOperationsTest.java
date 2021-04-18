package com.maven.sample.mavenfirstapp;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BasicOperationsTest {

	@InjectMocks
	private BasicOperations basicOperations;

	@Test
	public void testGenerate() {
		assertEquals("Hello Swapnil", BasicOperations.generate("Swapnil"));
	}
}
