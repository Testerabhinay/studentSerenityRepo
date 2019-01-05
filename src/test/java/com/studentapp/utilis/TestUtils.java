package com.studentapp.utilis;

import java.util.Random;

import org.junit.Test;

public class TestUtils 
{
	@Test
	public static String getRandomValue()
	{
		Random random = new Random();
		int randomInt = random.nextInt(100000);
		return Integer.toString(randomInt);
	}
}
