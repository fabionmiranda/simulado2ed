package simulado2;
public class OrdenacaoArvore {
    public void inserir(No node, int valor) {
	      //verifica se a árvore já foi criada
	       if (node != null) {
	        //Verifica se o valor a ser inserido é menor que o nodo corrente da árovre, se sim vai para subarvore esquerda
	        if (valor < node.valor) {
	            //Se tiver elemento no nodo esquerdo continua a busca
	            if (node.esquerda != null) {
	                inserir(node.esquerda, valor);
	                
	            } else 
	            {
	                //Se nodo esquerdo vazio insere o novo nodo aqui
	                System.out.println("  Inserindo " + valor + " a esquerda de " + node.valor);
	                node.esquerda = new No(valor);
	            }
	        //Verifica se o valor a ser inserido é maior que o nodo corrente da árvore, se sim vai para subarvore direita
	        } else if (valor > node.valor) {
	            //Se tiver elemento no nodo direito continua a busca
	            if (node.direita != null) {
	                inserir(node.direita, valor);
	            } else {
	                //Se nodo direito vazio insere o novo nodo aqui
	                System.out.println("  Inserindo " + valor + " a direita de " + node.valor);
	                node.direita = new No(valor);
	            }
	        }
	      }
	    }

	    public No removeValorMinimoDaArvore(No node) {
	        if (node == null) 
	        {
	            System.out.println("  ERRO ");
		        } else if (node.esquerda != null) {
		            node.esquerda = removeValorMinimoDaArvore(node.esquerda);
		            return node;
		        } else {
		        	//Se não tiver elemento esquerdo só nós resta o da direita
		            return node.direita;
	        }
	        return null;
	    }

	    //pre ordem
	    public void prefixado(No no) {
	        if(no != null){
	            System.out.print(no.valor + " ");
	            prefixado(no.esquerda);
	            prefixado(no.direita);
	        }
	    }
	// pos ordem
	    public void posfixado(No no) {
	        if(no != null){
	        	posfixado(no.esquerda);
	        	posfixado(no.direita);
	            System.out.print(no.valor + " ");
	        }
	    }

	    public void emordem(No no) {
	        if(no != null){
	        	emordem(no.esquerda);
			System.out.print(no.valor + " ");
	        	emordem(no.direita);
	        }
	    }
    
}
