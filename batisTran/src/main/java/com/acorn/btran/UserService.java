package com.acorn.btran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;


@Component
public class UserService {
	   @Autowired
	   MemberDao dao;
	 
	   @Autowired	
	    private   PlatformTransactionManager transactionManager; 
	
	 
	  
	  public void createUser(Member m) throws Exception {
		  
		  System.out.println( "createUser call");
	  //  TransactionStatus txStatus =
	   // transactionManager.getTransaction(new DefaultTransactionDefinition(new DefaultTransactionDefinition() ));
		  DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		  def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		  TransactionStatus status = transactionManager.getTransaction(def);

	    try {    	
	    
	      dao.insert(m);	
	      dao.insert(m);	
	      
	      transactionManager.commit(status);
	    } catch (Exception e) {
	      transactionManager.rollback(status);
	      System.out.println( "rollback 한다");
	      throw e;
	    }
	   
	  } 
	  
	 
	  public void createUser2(Member m) throws Exception {		 
		      dao.insert(m);  
		      
		   		   
	  } 
	}