package main.com.model;

import java.math.BigDecimal;

public class ProdutoVenda {
	private int idVenda;
	private BigDecimal qtd;
	private BigDecimal vlrUnitario;
	private BigDecimal vlrTotal;
	private String descricao;
	
	public ProdutoVenda(){
		
	}
	
	
	
	public ProdutoVenda(int id, BigDecimal qtd, BigDecimal vlrUnitario, String descricao) {
		super();
		this.idVenda = id;
		this.qtd = qtd;
		this.vlrUnitario = vlrUnitario;
		this.descricao = descricao;
	}



	public int getId() {
		return idVenda;
	}
	public void setId(int id) {
		this.idVenda = id;
	}
	public BigDecimal getQtd() {
		return qtd;
	}
	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}
	public BigDecimal getVlrUnitario() {
		return vlrUnitario;
	}
	public void setVlrUnitario(BigDecimal vlrUnitario) {
		this.vlrUnitario = vlrUnitario;
	}
	public BigDecimal getVlrTotal() {
		return vlrTotal;
	}
	public void setVlrTotal(BigDecimal vlrTotal) {
		this.vlrTotal = vlrTotal;
		System.out.println("valor total = "+vlrTotal);
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void calculaValorTotal(){
		this.setVlrTotal(this.qtd.multiply(this.vlrUnitario).setScale(2,BigDecimal.ROUND_DOWN));
	}
	
	

}