package test.controladores;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Preco")
public class Preco {

	
	
	@Id
	@Column (name = "id", nullable = false)
	@GeneratedValue  (strategy=GenerationType.AUTO)
	private long id;
	
	
	
	@Column (name = "media_preco", nullable = false)
	private Double media_preco;
	
	@Column (name = "armazenamento_valor", nullable = false)
	private Double armazenamento_valor;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getMedia_preco() {
		return media_preco;
	}

	public void setMedia_preco(Double media_preco) {
		this.media_preco = media_preco;
	}

	public Double getArmazenamento_valor() {
		return armazenamento_valor;
	}

	public void setArmazenamento_valor(Double armazenamento_valor) {
		this.armazenamento_valor = armazenamento_valor;
	}

	

