
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Produto;

public class ProgramaCadastrar {
    
// MAPEAMENTO OBJETO RELACIONAL - ORM DO HIBERNATE.
//Declaramos o EntityManagerFactory. Utilizamos essa fábrica para obter uma instância de EntityManager, 
// no momento que formos acessar o banco de dados;
private static EntityManagerFactory emf;

// Implementamos o método getEntityManager(), o qual deve ser chamado para obtermos a instância de EntityManager. 
// Lembre-se que todas as classes mapeadas são chamadas de entidades. EntityManager, como o próprio nome indica, representa o gerenciador de entidades. 
// Analisemos o código desse método:
	private static EntityManager getEntityManager() {
		 if (emf == null) {
			emf = Persistence.createEntityManagerFactory("produtos");
                         // Caso o EntityManagerFactory ainda não tenha sido criado (null), utilizamos a classe Persistence para isso. 
                         // O método createEntityManager() recebe como parâmetro uma string, que deve ser igual à string informada 
                         // como nome da unidade de persistência no persistence.xml. É dessa forma que estabelecemos essa ligação e, 
                         //t ambém nesse momento, o arquivo de configuração será lido, assim como todas as classes mapeadas. 
                         // Como esse é um processo lento, quando comparado com qualquer outra instanciação, o ideal é que ele aconteça apenas uma vez;
                         		 }
		 return emf.createEntityManager();
                 // A partir da fábrica, chamamos o método createEntityManager(), que nos retornará uma instância de EntityManager 
                 // para que possamos nos comunicar com o banco de dados;
	}

	public static void main(String args[]) {
		
                //instancia o produto 1, nome e quantidade;
                
		Produto produto1 = new Produto();
		produto1.setNome("Computador");
		produto1.setQuantidade(35);
		
                //instancia o produto 2, nome e quantidade;
		Produto produto2 = new Produto();
		produto2.setNome("Mouse");
		produto2.setQuantidade(100);
		
                //Aqui, começamos a utilizar, de fato, o Hibernate. Nessa linha estamos obtendo uma instância do gerenciador de entidades;
		EntityManager em = getEntityManager();
		
                // A partir do gerenciador de entidades, iniciamos uma transação com o banco de dados, 
                // visto que nesse programa vamos persistir dados nele;
		em.getTransaction().begin();
                
                // Com o método persist(), passamos para o gerenciador de entidades o objeto que desejamos armazenar no banco de dados;
                em.persist(produto1);
		em.persist(produto2);
                
                // Finalizamos a transação com o commit, confirmando a operação realizada;
		em.getTransaction().commit(); 
		
                // Encerramos o entitymanager e o entitymanagerfactory.
		em.close();
		emf.close();
	}
	
}