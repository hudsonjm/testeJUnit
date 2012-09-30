package main.com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	private int id;
	private int idCliente;
	private List<ProdutoVenda> produtos;
	private BigDecimal valorVenda;
	public Venda(int id, int idCliente) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.produtos = new ArrayList<ProdutoVenda>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public List<ProdutoVenda> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<ProdutoVenda> produtos) {
		this.produtos = produtos;
	}
	public BigDecimal getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	public void addProduto(ProdutoVenda p){
		produtos.add(p);
	}
	public void calculaValorVenda(){
		BigDecimal tot = new BigDecimal(0);
		for (int i = 0; i < produtos.size();i++){
			tot = tot.add(produtos.get(i).getVlrTotal());
		}
		this.setValorVenda(tot.setScale(2, BigDecimal.ROUND_DOWN));
	}
	

}