package test.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "ICARUS")

public class Icarus {
	
	
	@Column (name = "name", nullable = false, length =50)
	private String nome;
	
	@Column (name = "endereco", nullable = false, length =50)
	private String endereco;
	
	@Column (name = "email", nullable = false)
	private String email;
	
	@Column (name = "cnpj", nullable = false, length =14)
	private String cnpj;
	
	@Column (name = "nro_comercial", nullable = false, length =6)
	private String nro_comercial;
	
	@Column (name = "direitos_autorais", nullable = false, length =500)
	private String direitos_autorais;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNro_comercial() {
		return nro_comercial;
	}

	public void setNro_comercial(String nro_comercial) {
		this.nro_comercial = nro_comercial;
	}

	public String getDireitos_autorais() {
		return direitos_autorais;
	}

	public void setDireitos_autorais(String direitos_autorais) {
		this.direitos_autorais = direitos_autorais;
	}

	
	

}
