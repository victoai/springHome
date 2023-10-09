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
 *  create table member_info(
 *  
    id varchar2(10) primary key ,
    pwd varchar2(10) ,
    name  varchar2(20) ,
    email varchar2(20) ,
    birth  varchar2(20),
    sns    varchar2(20),
    regdate date
    
    insert into member_info values('t1' ,'0000', 'hong' ,'hong@naver.com' , '2002-01-02' , 'kakao', sysdate);
    
);
 */

@Component
public class MemberDao{
    @Autowired
    DataSource ds;
   
    final int FAIL = 0;
 
    public int insertUser(Member member) throws SQLException  {
        int rowCnt = FAIL;
        Connection conn = null;
        PreparedStatement pstmt = null;        

        String sql = "insert into member_info values (?, ?, ?, ?,?,?, sysdate) ";

        try {        
        	conn= DataSourceUtils.getConnection(ds);         //변경포인트	 
           // conn.setAutoCommit(false);        	
        	System.out.println( conn);
            pstmt = conn.prepareStatement(sql); 
            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getPwd());
            pstmt.setString(3, member.getName());
            pstmt.setString(4, member.getEmail());
            pstmt.setString(5, member.getBirth());
            pstmt.setString(6, member.getSns());
            rowCnt  = pstmt.executeUpdate(); //   
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;    //예외 되던지기 
        } finally {          
        	close(pstmt);
        	DataSourceUtils.releaseConnection(conn, ds);     // 변경포인트
        }                
        return rowCnt;
    }

     
    

    private void close(AutoCloseable... acs) {
        for(AutoCloseable ac :acs)
            try { if(ac!=null) ac.close(); } catch(Exception e) { e.printStackTrace(); }
    }
    
    
    
}