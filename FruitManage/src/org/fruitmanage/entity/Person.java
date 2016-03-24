package org.fruitmanage.entity;

public class Person {
	
	private PersonPK pk;
	private String age;
	public PersonPK getPk() {
		return pk;
	}
	public void setPk(PersonPK pk) {
		this.pk = pk;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
