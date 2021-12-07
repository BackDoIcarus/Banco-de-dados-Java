package test.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "Estacionamento")

public class Estacionamento {
	
	@Id
	@Column (name = "id", nullable = false)
	@GeneratedValue  (strategy=GenerationType.AUTO)
	private long id;
	
	

	
	
	@Column (name = "custos", nullable = false)
	private Double custos;
	
	@Column (name = "nro_vagas", nullable = false)
	private Double nro_vagas;
	
	@Column (name = "subsolo", nullable = false)
	private Double subsolo;
	
	@Column (name = "compartilhado", nullable = false)
	private Boolean compartilhado;
	
	
	
	
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getCustos() {
		return custos;
	}

	public void setCustos(Double custos) {
		this.custos = custos;
	}

	public Double getNro_vagas() {
		return nro_vagas;
	}

	public void setNro_vagas(Double nro_vagas) {
		this.nro_vagas = nro_vagas;
	}

	public Double getSubsolo() {
		return subsolo;
	}

	public void setSubsolo(Double subsolo) {
		this.subsolo = subsolo;
	}

	public Boolean getCompartilhado() {
		return compartilhado;
	}

	public void setCompartilhado(Boolean compartilhado) {
		this.compartilhado = compartilhado;
	}

	
	

}
