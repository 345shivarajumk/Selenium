package com.crm.vtiger.tests;

import org.testng.annotations.Test;

public class MavenParametersTest {
	@Test
	public void readmaven()
	{
		String names=System.getProperty("name");
		System.out.println(names);
		String place=System.getProperty("place");
		System.out.println(place);
		String cont=System.getProperty("country");
		System.out.println(cont);
	}

}
