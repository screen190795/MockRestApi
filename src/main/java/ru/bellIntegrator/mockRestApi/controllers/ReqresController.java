package ru.bellIntegrator.mockRestApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import ru.bellIntegrator.mockRestApi.data.AccountRegistered;
import ru.bellIntegrator.mockRestApi.data.Data;
import ru.bellIntegrator.mockRestApi.data.User;
import ru.bellIntegrator.mockRestApi.repositories.ReqresRepository;

@RestController
public class ReqresController {
	ReqresRepository rep = new ReqresRepository();
	
	@GetMapping("/api/users")
	public Data listUsers(@RequestParam(value="page", defaultValue="2") int page) {
		return rep.listUsers();
	}
	
	@PostMapping("/api/register")
	 @ResponseStatus(HttpStatus.OK)
	public AccountRegistered registerAccount(
			@RequestParam(value="email", required=true) String email, 
			@RequestParam(value="password", required=true)String password) {
		return rep.register(email, password);
		}
	
	
	@RequestMapping(value = "/api/updateUser/{id}", method = RequestMethod.PUT)
	 @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public  User updateUser(
			@RequestParam(value = "id") String id,
			@RequestParam(value="firstName", required=true) String firstName, 
			@RequestParam(value="lastName", required=true)String lastName,
			@RequestParam(value="avatar", required=true)String avatar
			) {
		Integer nId = Integer.parseInt(id);
		return rep.updateUser(nId,firstName, lastName,avatar);
		}	
	
	
}
