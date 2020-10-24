package ru.bellIntegrator.mockRestApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.bellIntegrator.mockRestApi.data.Data;
import ru.bellIntegrator.mockRestApi.repositories.ReqresRepository;

@RestController
public class ReqresController {
	ReqresRepository rep = new ReqresRepository();
	
	@GetMapping("/api/users")
	public Data listUsers(@RequestParam(value="page", defaultValue="2") int page) {
		return rep.listUsers();
	}

}
