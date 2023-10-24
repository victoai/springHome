package com.acorn.db;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


@Component
public class UserDao {
    @Autowired
    DataSource ds;
    final int FAIL = 0;

    public int deleteUser(String id) {
        int rowCnt = FAIL; //  insert, delete, update

        Connection conn = null;
        PreparedStatement pstmt = null;

        String sql = "delete from user_info where id= ? ";

        try {
            conn = ds.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
 
            return pstmt.executeUpdate(); //  insert, delete, update
        } catch (SQLException e) {
            e.printStackTrace();
            return FAIL;
        } finally { 
            close(pstmt, conn);  
        }
    }

    public User selectUser(String id) throws Exception {
        User user = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from users where id= ? ";

        try {
            conn = ds.getConnection();
            
            System.out.println( conn);
            System.out.println("11"+ sql);
            pstmt = conn.prepareStatement(sql); //  
            pstmt.setString(1, id);

            rs = pstmt.executeQuery(); //  select

            if (rs.next()) {
            	
            	System.out.println("ok");
                user = new User();
                user.setId(rs.getString(1));
                user.setName(rs.getString(2));
                user.setEmail(rs.getString(3));            
                user.setDate(new Date(rs.getTimestamp(4).getTime()));
                
                System.out.println(  rs.getString(1));
            }
        } catch (SQLException e) {
        	e.printStackTrace();
           
        } finally {         
            close(rs, pstmt, conn);   
        }

        return user;
    }

    // 사용자 정보를 user_info테이블에 저장하는 메서드
    public int insertUser(User user) {
        int rowCnt = FAIL;

        Connection conn = null;
        PreparedStatement pstmt = null;

//       
        String sql = "insert into users(name, email, registration_date  )  values ( ?,?, now()) ";

        try {
            conn = ds.getConnection();
            pstmt = conn.prepareStatement(sql); // SQL Injection공격, 성능향상
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail()); 
            return pstmt.executeUpdate(); //  insert, delete, update;
        } catch (SQLException e) {
            e.printStackTrace();
            return FAIL;
        } finally {
            close(pstmt, conn);  //     private void close(AutoCloseable... acs) {
        }
    }

     
    public int updateUser(User user) {
        int rowCnt = FAIL; //  insert, delete, update
 

        String sql = "update users " +
                     "set  name=?, email=? " +
                     "where id = ? ";

        // try-with-resources - since jdk7
        try (
            Connection conn = ds.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql); // SQL Injection공격, 성능향상
        ){
            
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getEmail());           
            pstmt.setString(7, user.getId());

            rowCnt = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return FAIL;
        }

        return rowCnt;
    }

    public void deleteAll() throws Exception {
        Connection conn = ds.getConnection();

        String sql = "delete from users ";

        PreparedStatement pstmt = conn.prepareStatement(sql); // SQL Injection공격, 성능향상
        pstmt.executeUpdate(); //  insert, delete, update
    }

    
    private void close(AutoCloseable... acs) {
        for(AutoCloseable ac :acs)
            try { if(ac!=null) ac.close(); } catch(Exception e) { e.printStackTrace(); }
    }
}