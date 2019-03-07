package com.cristian.backend.apirest.models.service;

import java.util.List;

import com.cristian.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();

}
