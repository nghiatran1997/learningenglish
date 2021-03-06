package com.example.firstspringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Vocabulary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idKeyword;
	
	
	private String userName;
	
	private String keyword;
	
	private String meanning;
	
	private String typeOfVocabulary;
	
	private String dateAddVocabulary;
	
	public Vocabulary() {
		
	}
	
	public Vocabulary(int idKeyword, String userName, String keyword, String meanning, String typeOfVocabulary,
			String dateAddVocabulary) {
		super();
		this.idKeyword = idKeyword;
		this.userName = userName;
		this.keyword = keyword;
		this.meanning = meanning;
		this.typeOfVocabulary = typeOfVocabulary;
		this.dateAddVocabulary = dateAddVocabulary;
	}
	
	public int getIdKeyword() {
		return idKeyword;
	}
	
	public void setIdKeyword(int idKeyword) {
		this.idKeyword = idKeyword;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getKeyword() {
		return keyword;
	}
	
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public String getMeanning() {
		return meanning;
	}
	
	public void setMeanning(String meanning) {
		this.meanning = meanning;
	}
	
	public String getTypeOfVocabulary() {
		return typeOfVocabulary;
	}
	
	public void setTypeOfVocabulary(String typeOfVocabulary) {
		this.typeOfVocabulary = typeOfVocabulary;
	}
	
	public String getDateAddVocabulary() {
		return dateAddVocabulary;
	}
	
	public void setDateAddVocabulary(String dateAddVocabulary) {
		this.dateAddVocabulary = dateAddVocabulary;
	}
	
	
	
	
}
