package com.acorn.parm;

import lombok.Data;
 


/*  lombok 사용법:
 *  구글에 lombok다운로드  tools에 두기 
 *   설치방법 : java -jar lombok.jar
 *  lombok.jar 다운로드 설치 및 pom에 추가해야 함
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
