package test.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "Visualizacao"
public class Vizualizacao {

	

	@Id
	@Column (name = "id", nullable = false)
	@GeneratedValue  (strategy=GenerationType.AUTO)
	private long id;
	


	@Column (name = "nome", nullable = false)
	private String id;
	// meus imoveis e visualizações andre disse  q  ainda iria olhar, mas o contador não tera no id.*/
}
	
	

