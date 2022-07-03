package com.rb.poc;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rb.poc.entities.Pedido;
import com.rb.poc.enums.PedidoStatus;
import com.rb.poc.repositories.PedidoRepository;

@SpringBootApplication
public class PocEnumApplication implements CommandLineRunner {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PocEnumApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		Pedido o1 = new Pedido(null, Instant.parse("2021-12-20T21:04:00Z"), PedidoStatus.PAGO);
		Pedido o2 = new Pedido(null, Instant.parse("2022-01-23T22:05:07Z"), PedidoStatus.AGUARDANDO_PAGAMENTO);
		Pedido o3 = new Pedido(null, Instant.parse("2022-01-24T12:15:07Z"), PedidoStatus.CANCELADO);
		
		pedidoRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	} 
	
}
