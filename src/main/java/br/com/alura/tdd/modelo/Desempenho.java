package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

//Usando Strategy do Designer Partner

public enum Desempenho {
	A_DESEJAR {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.03");
		}
	}, 
	BOM {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.15");
		}
	}, 
	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.20");
		}
	};
	

	
	
	public abstract BigDecimal percentualReajuste();
}