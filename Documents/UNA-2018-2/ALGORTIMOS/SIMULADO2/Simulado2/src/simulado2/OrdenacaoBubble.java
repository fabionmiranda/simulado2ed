package simulado2;
public class OrdenacaoBubble {
    
    int vet[] = {8, 9, 3, 5, 1}; 
    int aux = 0; int i=0;
    
    void preencher()
    {
    //1-popular o vetor com os dados   
    //System.out.println("Vetor desordenado:");
        for(i = 0; i<5; i++)
        {
            System.out.println(" "+vet[i]);
        }
    }
    
    void ordenarvetor()
    {
        for(i = 0; i<5; i++){
    
            for(int j = 0; j<4; j++)
            {
                if(vet[j] > vet[j + 1])
                {
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
    
    }
   
    void mostrar()
    {
        System.out.println("Vetor organizado:");
        for(i = 0; i<5; i++)
        {
            System.out.println(" "+vet[i]);
        }
    }

    
}
