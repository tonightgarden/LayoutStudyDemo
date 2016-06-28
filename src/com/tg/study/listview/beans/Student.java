

/**
 *@Copyright:Copyright (c) 2008 - 2100
 *@author tg   
 *@date 2016-6-28 下午2:40:27 
 *@Company:扬州映台
 */
    
package com.tg.study.listview.beans;

/**
 *@Title:
 *@Description:
 *@Author:tg
 *@Since:2016-6-28
 *@Version:1.1.0
 */

public class Student {
	
	private String name;
	private int age ;
	private int type;
	
	/**
	 * @param name
	 * @param age
	 * @param type
	 */
	    
	public Student(String name, int age, int type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}

	/**
	 * @return the name
	 */
	
	public String getName() {
	
		return name;
	}

	/**
	 * @param name the name to set
	 */
	
	public void setName(String name) {
	
		this.name = name;
	}

	/**
	 * @return the age
	 */
	
	public int getAge() {
	
		return age;
	}

	/**
	 * @param age the age to set
	 */
	
	public void setAge(int age) {
	
		this.age = age;
	}

	/**
	 * @return the type
	 */
	
	public int getType() {
	
		return type;
	}

	/**
	 * @param type the type to set
	 */
	
	public void setType(int type) {
	
		this.type = type;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	    
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", type=" + type
				+ "]";
	}
	
}

    