package com.rb.poc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rb.poc.entities.Pedido;
import com.rb.poc.repositories.PedidoRepository;

@RestController
@RequestMapping(value = "pedidos")
public class PedidoResource {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll() {
		List<Pedido> list = pedidoRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
