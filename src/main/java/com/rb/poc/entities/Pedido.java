package com.rb.poc.entities;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rb.poc.enums.PedidoStatus;

@Entity
@Table (name = "tb_pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private Instant data;
	
	private Integer pedidoStatus;
	
	private Pedido(){
	}
	
	public Pedido(Long codigo, Instant data, PedidoStatus pedidoStatus) {
		super();
		this.codigo = codigo;
		this.data = data;
		setPedidoStatus(pedidoStatus);
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Instant getData() {
		return data;
	}

	public void setData(Instant data) {
		this.data = data;
	}
	
	public PedidoStatus getOrderStatus() {
		return PedidoStatus.valorDo(pedidoStatus);
	}
	
	public void setPedidoStatus(PedidoStatus pedidoStatus) {
		if (pedidoStatus != null) {
			this.pedidoStatus = pedidoStatus.getCodigo();
		}
	}
}
