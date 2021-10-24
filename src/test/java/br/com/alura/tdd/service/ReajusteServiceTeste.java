package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTeste {
	
	//TDD
	
	private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeEach //é chamado antes de cada um método de testes
	public void inicializar() {
		System.err.println("Inicializa");
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
	}
	
	@AfterEach  //é chamado após de cada um método de testes
	public void finalizar() {
		System.err.println("FIm");
	}
	
	@BeforeAll //antes de todos
	public static void antesDeTodos() {
		System.err.println("Antes de Todos");
	}
	
	@AfterAll //depois de todos
	public static void depoisDeTodos() {
		System.err.println("Depois de Todos");
	}

	@Test
	public void reajusteDeveriaSerTresPorcentoQuandoDesempenhoForADeseja() {
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerQuinzePorcentoQuandoDesempenhoForBom() {
		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerVintePorcentoQuandoDesempenhoForOtimo() {
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
