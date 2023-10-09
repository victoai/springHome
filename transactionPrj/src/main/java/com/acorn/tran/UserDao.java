package com.acorn.tran;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;
 
/*
 * 
 * create table testdb(	
	  id varchar2(10 ) primary key , 
	  pw varchar2(10)
   );
 */


@Component
public class UserDao{
    @Autowired
    DataSource ds;
   
    final int FAIL = 0;
 
    public int insertUser(User user) throws SQLException  {
        int rowCnt = FAIL;
        Connection conn = null;
        PreparedStatement pstmt = null;        

        String sql = "insert into testdb values (?, ? ) ";

        try {        
        	conn= DataSourceUtils.getConnection(ds);         //변경포인트	 
           // conn.setAutoCommit(false);        	
        	System.out.println( conn);
            pstmt = conn.prepareStatement(sql); 
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getPw());
            
            rowCnt= pstmt.executeUpdate();
              
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;    //예외 되던지기 
        } finally {          
        	close(pstmt);
        	DataSourceUtils.releaseConnection(conn, ds);    // 변경포인트
        }                
        return rowCnt;
    }
 
    

    private void close(AutoCloseable... acs) {
        for(AutoCloseable ac :acs)
            try { if(ac!=null) ac.close(); } catch(Exception e) { e.printStackTrace(); }
    }
    
    
    
}