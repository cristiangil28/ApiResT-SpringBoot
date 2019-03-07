package com.cristian.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.backend.apirest.models.entity.Cliente;
import com.cristian.backend.apirest.models.service.IClienteService;

@RestController
public class ClienteController {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/listar")
	public List<Cliente> getAllClientes(){
		return clienteService.findAll();
	}
}
