package test.controladores;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "Cadastrar_imovel"
public class Cadastrar_imovel {

	
	
	@Id
	@Column (name = "id", nullable = false)
	@GeneratedValue  (strategy=GenerationType.AUTO)
	private long id;
	
	
	@Column (name = "estado_bairro", nullable = false)
	private String estado_bairro;
	
	@column(name= "estado_bairro", nullable = false)
	private String cadastrar_imovel;
	
	
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

	public String getCadastrar_imovel() {
		return cadastrar_imovel;
	}

	public void setCadastrar_imovel(String cadastrar_imovel) {
		this.cadastrar_imovel = cadastrar_imovel;
	}

	
}
