package com.arif.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity

@Table(name="student_table")
public class Student {

	
	private String firstName;
	private String lastName;
	
	private String country;

	private LinkedHashMap<String, String> countryOptions;

	public List<String> getLangOptions() {
		return langOptions;
	}

	public void setLangOptions(List<String> langOptions) {
		this.langOptions = langOptions;
	}

	private List<String> langOptions;
	
	private String favoriteLanguage;
	
	public Student() {
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("UAE", "United Arab Emirates");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");	
		
		
		langOptions = new ArrayList<String>();
		langOptions.add("Java");
		langOptions.add("Java Script");
		langOptions.add("PHP");
		langOptions.add("Python");
		

	}

	public Student(String fname, String lname, String flang,String country) {
		this.firstName = fname;
		this.lastName = lname;
		this.favoriteLanguage = flang;
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

}
