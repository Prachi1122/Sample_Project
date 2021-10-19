package com.crm.contacttest;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void test() {
		 String URL = System.getProperty("url");
		 System.out.println(URL);
	}
}
