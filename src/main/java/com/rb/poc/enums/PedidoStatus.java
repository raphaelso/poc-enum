package com.rb.poc.enums;

public enum PedidoStatus {

	AGUARDANDO_PAGAMENTO(1), 
	PAGO(2), 
	ENVIADO(3), 
	ENTREGUE(4), 
	CANCELADO(5);
	
	private int codigo;
	
	private PedidoStatus(int code) {
		this.codigo = code;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public static PedidoStatus valorDo(int codigo) {
		for (PedidoStatus value : PedidoStatus.values()) {
			if (value.getCodigo() == codigo) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código do pedido inválido");
	}
	
}
