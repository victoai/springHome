package com.acorn.aop;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MyClass{
	  public void aaa() {		  
		  System.out.println( "aaa");		 
	  }
	  
	  public void aab() {
		//  System.out.println("hi");
		  System.out.println( "aab");
		//  System.out.println("bye");
	  }
	  
	  public void bbb() {
		  System.out.println( "bbb");
	  }	  
}


class MyAdvice{	
	 public Object invoke( Method m  ,  Object obj ,  Object...args ) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		 //
		 System.out.println("before hi");
		 
		 Object result  = m.invoke(obj, args);
		 //
		 System.out.println("after bye");
		 return result;		 
	 }
	
	
}


public class AopTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 
		  MyClass  my = new MyClass();
		  my.aaa();
		  my.aab();
		  my.bbb(); 
		  
		  /////		  
		  Class clazz  = MyClass.class;
		  Method[] methods = clazz.getDeclaredMethods();
		  MyClass obj =(MyClass) clazz.newInstance();		  
		  
		  MyAdvice advice = new MyAdvice();
		  for( Method m : methods) {
			  advice.invoke(m, obj); 
		  }
		   

	}

}
