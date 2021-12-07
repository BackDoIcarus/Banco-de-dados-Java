package test.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





public class imovel {
	
	
	
	
	
	
	
	
	@Id
	@Column (name = "id", nullable = false)
	@GeneratedValue  (strategy=GenerationType.AUTO)
	private long id;
	


	@Column (name = "nome", nullable = false)
	private String nome;
	
	@Column (name = "ano_construido", nullable = false)
	private Date ano_construido;
	
	@Column (name = "tamanho", nullable = false)
	private String tamanho;
	
	@Column (name = "preco_aluguel", nullable = false)
	private Double preco_aluguel;
	
	@Column (name = "banheiro_qtda", nullable = false)
	private Int banheiro_qtda;
	
	
	@Column (name = "descricao", nullable = false)
	private String descricao;
	
	
	@Column (name = "condominio", nullable = false)
	private Boolean condominio;
	
	@Column (name = "piso", nullable = false)
	private String piso;
	
	@Column (name = "iptu", nullable = false)
	private Double iptu;
	
	@Column (name = "tp_espaco", nullable = false)
	private String tp_espaco;
	
	@Column (name = "opcionais", nullable = false)
	private String opcionais;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getAno_construido() {
		return ano_construido;
	}

	public void setAno_construido(Date ano_construido) {
		this.ano_construido = ano_construido;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Double getPreco_aluguel() {
		return preco_aluguel;
	}

	public void setPreco_aluguel(Double preco_aluguel) {
		this.preco_aluguel = preco_aluguel;
	}

	public Int getBanheiro_qtda() {
		return banheiro_qtda;
	}

	public void setBanheiro_qtda(Int banheiro_qtda) {
		this.banheiro_qtda = banheiro_qtda;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getCondominio() {
		return condominio;
	}

	public void setCondominio(Boolean condominio) {
		this.condominio = condominio;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public Double getIptu() {
		return iptu;
	}

	public void setIptu(Double iptu) {
		this.iptu = iptu;
	}

	public String getTp_espaco() {
		return tp_espaco;
	}

	public void setTp_espaco(String tp_espaco) {
		this.tp_espaco = tp_espaco;
	}

	public String getOpcionais() {
		return opcionais;
	}

	public void setOpcionais(String opcionais) {
		this.opcionais = opcionais;
	}

	
	
}


public class visualizacao {
	
	
	
//como vamos fazer a classe de visualização sendo que para fazer ela precisa contar o usuario, imovel e ter o botão de salvar????
	


	   