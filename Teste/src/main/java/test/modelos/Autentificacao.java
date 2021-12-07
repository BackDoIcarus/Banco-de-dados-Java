package test.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "Autentificacao")


public class Autentificacao {

	
	@Id
	@Column (name = "id", nullable = false)
	@GeneratedValue  (strategy=GenerationType.AUTO)
	private long id;
	
	
	
	
	
	@Column (name = "autentificacao_credencial_login", nullable = false)
	private Boolean autentificacao_credencial_login;
	
	@Column (name = "autentificacao_email_senha", nullable = false)
	private Boolean autentificacao_email_senha;
	
	
	
	
}
