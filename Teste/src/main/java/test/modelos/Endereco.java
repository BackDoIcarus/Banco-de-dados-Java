package test.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "Endereco"
public class Endereco {

	
	@Id
	@Column (name = "id", nullable = false)
	@GeneratedValue  (strategy=GenerationType.AUTO)
	private long id;
	

	
	
	@Column (name = "cep", nullable = false)
	private String Cep;
	
	@Column (name = "rua", nullable = false)
	private String rua;
	
	@Column (name = "nro_imovel", nullable = false)
	private Int nro_imovel;
	
	@Column (name = "pais", nullable = false)
	private String pais;
	
	@Column (name = "complemento", nullable = false)
	private String complemento;
	
	
	@Column (name = "cadastrar_imovel", nullable = false)
	private String cadastrar_imovel;
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCep() {
		return Cep;
	}


	public void setCep(String cep) {
		Cep = cep;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public Int getNro_imovel() {
		return nro_imovel;
	}


	public void setNro_imovel(Int nro_imovel) {
		this.nro_imovel = nro_imovel;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getCadastrar_imovel() {
		return cadastrar_imovel;
	}


	public void setCadastrar_imovel(String cadastrar_imovel) {
		this.cadastrar_imovel = cadastrar_imovel;
	}


	
	
}
