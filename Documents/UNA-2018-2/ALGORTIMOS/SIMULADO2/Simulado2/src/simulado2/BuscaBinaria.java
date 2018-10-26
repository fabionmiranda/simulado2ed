package simulado2;
import java.util.Scanner;

public class BuscaBinaria {
    // x representa vetor de produtos ou clientes etc...
    int [] x = new int [10];
    // atributos para auxiliar na busca 
    int numProcurado, i , inicio , fim , meio , achou;
    //Didaticamente a entrada deve ser ordenada,
    //pois se trata de uma busca binaria
    Scanner entrada = new Scanner(System.in);
    
    void preencher()
    {
    //carregando os numeros no vetor (ordenados)
    for(i = 0; i <=9; i++){
    	//
        System.out.println("Digite o " + (i+1) + " numero");
        //alimentaçao do vetor a medida  que o usuario digita
        x[i]=entrada.nextInt();
            
    }
    }

    void pesquisar()
    {
        //digitando o numero a ser buscado no vetor
        System.out.println("Digite o numero a ser buscado no vetor");
        numProcurado = entrada.nextInt();

        //buscando o numero digitado no vetor

        achou = 0;// indicar se encontrou o numero procurado ou nao
        inicio = 0;
        fim = 9;
        meio = (inicio+fim) /2 ; // definindo o meio do vetor para facilitar a busca

     // procura o numero enquanto (achou) for 0
        //
        while(inicio <= fim && achou ==0)
        {

             if(x[meio] == numProcurado)
                 achou =1;
        // se o numero procurado for menor que o meio  
             // anda pra esquerda
          else{
             if(numProcurado < x[meio])
             fim = meio -1;

                          else{
                            //se numero for  maior, entao o inicio recebe o meio +1
                            // o proximo numero para direita
                            inicio = meio+1;//anda no vetor
                            meio = (inicio+fim)/2;

             }   
         }
        }
        // se nao encontrar
          if(achou == 0)
          
            System.out.println("nao foi possivel identificar o numero");

   
          else{
              System.out.println("numero encontrado na posiçao "+ meio);
          }
        }
    }


