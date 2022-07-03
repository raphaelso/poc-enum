package com.rb.poc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rb.poc.entities.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
	
