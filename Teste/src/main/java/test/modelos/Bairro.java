package test.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "Bairro")
public class Bairro {

	@Id
	@Column (name = "id", nullable = false)
	@GeneratedValue  (strategy=GenerationType.AUTO)
	private long id;


	@Column (name = "estado_bairro", nullable = false)
	private String estado_bairro;
	
	@Column (name = "cidade_bairro", nullable = false)
	private Date cidade_bairro;
	
	@Column (name = "nome_bairro", nullable = false)
	private String nome_bairro;
	
	@Column (name = "zona", nullable = false)
	private Double zona;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEstado_bairro() {
		return estado_bairro;
	}

	public void setEstado_bairro(String estado_bairro) {
		this.estado_bairro = estado_bairro;
	}

	public Date getCidade_bairro() {
		return cidade_bairro;
	}

	public void setCidade_bairro(Date cidade_bairro) {
		this.cidade_bairro = cidade_bairro;
	}

	public String getNome_bairro() {
		return nome_bairro;
	}

	public void setNome_bairro(String nome_bairro) {
		this.nome_bairro = nome_bairro;
	}

	public Double getZona() {
		return zona;
	}

	public void setZona(Double zona) {
		this.zona = zona;
	}

	
	
	
}

