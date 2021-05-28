package br.edu.unidep.webservice.model.dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venda")
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_venda")
	private Long id;
	
	@Column(name = "valor_venda")
	private double valorVenda;
	
	@Column(name = "data_venda")
	private Date dataVenda;
	
	@Column(name = "tipo_venda")
	private char tipoVenda;
	
	@ManyToOne
	@JoinColumn(name = "codigo_pessoa")
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name = "codigo_produto")
	private Produto produto;
	
	public Long getId() {
		return id;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public Produto getProduto() {
		return produto;
	}
	public char getTipoVenda() {
		return tipoVenda;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void cancelar() {
		this.tipoVenda = 'C';
	}
	
}
