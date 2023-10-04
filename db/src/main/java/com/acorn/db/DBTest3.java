package com.acorn.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DBTest3 {

	public static void main(String[] args) {	
		
		ApplicationContext  ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");		
		DataSource ds  =ac.getBean(DataSource.class);		
		try {
			Connection con =ds.getConnection();
			System.out.println( con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
