package dol;


import java.util.Date;
import java.util.UUID;

public abstract class Person {
	private UUID id;
	private String firstName;
	private String middleName;
	private String surName;
	private String secondSurName;
	private Gender gender;
	private Date birthDate;
	private int age;
	
	
	
	public Person() {
		id = UUID.randomUUID();	
	}


	

	public UUID getId() {
		return id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getMiddleName() {
		return middleName;
	}



	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	public String getSurName() {
		return surName;
	}



	public void setSurName(String surName) {
		this.surName = surName;
	}



	public String getSecondSurName() {
		return secondSurName;
	}



	public void setSecondSurName(String secondSurName) {
		this.secondSurName = secondSurName;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	public Date getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	

}
