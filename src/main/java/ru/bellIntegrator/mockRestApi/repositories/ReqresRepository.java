package ru.bellIntegrator.mockRestApi.repositories;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ru.bellIntegrator.mockRestApi.data.Account;
import ru.bellIntegrator.mockRestApi.data.AccountRegistered;
import ru.bellIntegrator.mockRestApi.data.Ad;
import ru.bellIntegrator.mockRestApi.data.Data;
import ru.bellIntegrator.mockRestApi.data.User;

public class ReqresRepository {

	
	
	static Map<String, Account> accounts = new Hashtable<>();
	static List<User> users = new ArrayList<>();
	static Ad ad;
	static Data data;
	
	static {	
		users.add(new User(7,"michae.lawson@reqres.in","Michael","Lawson","https://s3.amazonaws.com/uifaces/faces/twitter/follettkyle/128.jpg"));
		users.add(new User(8,"lindsay.ferguson@reqres.in","Lindsay","Ferguson","https://s3.amazonaws.com/uifaces/faces/twitter/araa3185/128.jpg"));
		users.add(new User(9,"tobias.funke@reqres.in","Tobias","Funke","https://s3.amazonaws.com/uifaces/faces/twitter/vivekprvr/128.jpg"));
		users.add(new User(10,"byron.fields@reqres.in","Byron","Fields","https://s3.amazonaws.com/uifaces/faces/twitter/russoedu/128.jpg"));
		users.add(new User(11,"george.edwards@reqres.in","George","Edwards","https://s3.amazonaws.com/uifaces/faces/twitter/mrmoiree/128.jpg"));
		users.add(new User(12,"rachel.howell@reqres.in","Rachel","Howell","https://s3.amazonaws.com/uifaces/faces/twitter/hebertialmeida/128.jpg"));
		ad = new Ad("StatusCode Weekly","http://statuscode.org/","A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things.");
		data = new Data(users,ad);
	}
	
	
	
	/*
	
	 * "ad": { "company": "StatusCode Weekly", "url": "http://statuscode.org/",
	 * "text":
	 * "A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things."
	 * } }
	 */
	
	public Data listUsers() {
		return data;
	}
	
	public AccountRegistered register(String email, String password) {
		if(!accounts.containsKey(email))
		accounts.put(email,new Account(email, password, accounts.size()+1));
		AccountRegistered accountRegistered = new AccountRegistered();
		accountRegistered.setToken();
		accountRegistered.id = accounts.size()+1;
		return accountRegistered;
	}
	
	public User getUserById(Integer id) {
		return users.stream()
				  .filter(x->x.getId().equals(id))
				  .findAny()
				  .orElse(null);
		}
		
		
	

	public User updateUser(Integer id, String firstName, String lastName, String avatar) {
	
		User user = this.getUserById(id);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAvatar(avatar);
		return user;
	}
	
}
