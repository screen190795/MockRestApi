package ru.bellIntegrator.mockRestApi.data;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;


public class AccountRegistered {
	
	public Integer id;
	private String token;

	/**
	* No args constructor for use in serialization
	*
	*/
	public AccountRegistered() {
	}

	/**
	*
	* @param id
	* @param token
	*/
	public AccountRegistered(Integer id, String token) {
	this.id = id;
	this.token = token;
	}

	public Integer getId() {
	return id;
	}

	public void setId(Integer id) {
	this.id = id;
	}

	public String getToken() {
	return token;
	}

	public void setToken() {
		 int leftLimit = 48; // numeral '0'
		    int rightLimit = 122; // letter 'z'
		    int targetStringLength = 17;
		    Random random = new Random();
		 
		    this.token = random.ints(leftLimit, rightLimit + 1)
		      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
		      .limit(targetStringLength)
		      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		      .toString();
		    
	}


}
