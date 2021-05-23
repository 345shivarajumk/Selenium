package com.crm.vtiger.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ReadDatabase {
	Connection con;
	@Test
	public void databaseread() throws SQLException
	{
		try {
		Driver d= new Driver();
		DriverManager.registerDriver(d);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poolshiva","root","root");
		Statement stat =con.createStatement();
		ResultSet result=stat.executeQuery("select * from customers");
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
		con.close();
		}
		
	}

}
