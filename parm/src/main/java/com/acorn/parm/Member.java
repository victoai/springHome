package com.acorn.parm;

import lombok.Data;
 


/*  lombok ����:
 *  ���ۿ� lombok�ٿ�ε�  tools�� �α� 
 *   ��ġ��� : java -jar lombok.jar
 *  lombok.jar �ٿ�ε� ��ġ �� pom�� �߰��ؾ� ��
 * 
 * 	<dependency>
			    <groupId>org.projectlombok</groupId>
			    <artifactId>lombok</artifactId>
			    <version>1.18.30</version>
			    <scope>provided</scope>
	 </dependency>
	
 * 
 */
 
@Data
public class Member {
	String name;
	int age;

}
