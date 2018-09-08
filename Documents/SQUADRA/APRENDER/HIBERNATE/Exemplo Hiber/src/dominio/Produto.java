package dominio;

import javax.persistence.*;

//Com a anotação @Entity, indicamos que a classe Produto agora é uma entidade. 
// Apenas dessa forma, no banco de dados haverá uma tabela de nome produto;
@Entity 
public class Produto {
//@Id, indicamos que o atributo id representa a chave primária dessa entidade;
// @GeneratedValue, indicamos que o valor para a chave primária será gerenciado pelo provedor de persistência em conjunto com o banco de dados. 
// Não será mais uma responsabilidade do nosso código, o que acontece quando não declaramos essa anotação.
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private int quantidade;
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
