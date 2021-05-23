package com.crm.vtiger.tests;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadXmlTest {
	@Test
	public void readdata(XmlTest x)
	{
		String name=x.getParameter("names");
		String state=x.getParameter("place");
		String country=x.getParameter("country");
		System.out.println(name);
		System.out.println(state);
		System.out.println(country);
		
	}
}
