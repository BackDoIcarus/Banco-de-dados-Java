package test.modelos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "Usuario")


public class Usuario {
	
	
	@Id
	@Column (name = "id", nullable = false)
	@GeneratedValue  (strategy=GenerationType.AUTO)
	private long id;
	
	
	
	
	
	
	@Column (name = "senha", nullable = false)
	private String senha;
	
	@Column (name = "dt_nasc", nullable = false, length= 8)
	@DateTimeFormat (pattern = "dd/mm/yyyy")
	private LocalDate dt_nasc;
	
	@Column (name = "nome", nullable = false, length =50)
	private String nome;
	
	@Column (name = "sobrenome", nullable = false, length =50)
	private String sobrenome;
	
	@Column (name = "estado", nullable = false, length =50)
	private String estado;
	
	@Column (name = "nro_telefone", nullable = false, length = 11) 
	private int nro_telefone;
	
	@Column (name = "email", nullable = false, length =50)
	private String email;
	
	
	@Column (name = "cpf", nullable = false, length =11) 
	private String cpf;
	
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getNro_telefone() {
		return nro_telefone;
	}


	public void setNro_telefone(int nro_telefone) {
		this.nro_telefone = nro_telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	
	
	
	//Não sabemos guardar data.

}
