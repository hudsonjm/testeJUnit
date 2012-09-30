package testes.main.junit;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import main.com.model.ProdutoVenda;
import main.com.model.Venda;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testes {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testValorTotalVenda() {
		//O valor da venda tem que ser igual o valor da soma dos produtos
		Venda venda = new Venda(1, 1);
		
		ProdutoVenda p1 = new ProdutoVenda(1, new BigDecimal(0), new BigDecimal(0), "Prod1");
		ProdutoVenda p2 = new ProdutoVenda(1, new BigDecimal(0), new BigDecimal(0), "Prod2");
		ProdutoVenda p3 = new ProdutoVenda(1, new BigDecimal(0), new BigDecimal(0), "Prod3");
		p1.calculaValorTotal();
		p2.calculaValorTotal();
		p3.calculaValorTotal();
		venda.addProduto(p1);
		venda.addProduto(p2);
		venda.addProduto(p3);
		venda.calculaValorVenda();
		BigDecimal totProdutos = p1.getVlrTotal();
		totProdutos.add(p2.getVlrTotal());
		totProdutos.add(p3.getVlrTotal());
		assertEquals(venda.getValorVenda().floatValue(), totProdutos.floatValue() , .0);
	}
	

	@Test
	public void testValorTotalProduto() {
	/* o valor total do produto tem que ser a quantidade * valorUnitario
	 * Porém se quantidade com muitas casas decimais 
	 * O valor total é sempre um Valor com duas casas Decimais 
	 * O arredondamento nao pode ser diferente de 0,01
	 */
		
		//no exemplo a quantidade deve ser no mínimo com 5 casas deciamais
		ProdutoVenda p1 = new ProdutoVenda(1, new BigDecimal(17.1603931), new BigDecimal(71.91), "Prod1");
		p1.calculaValorTotal();
		assertEquals(p1.getVlrTotal().floatValue(),1234, 0.01);
	}
	
	
	

}
