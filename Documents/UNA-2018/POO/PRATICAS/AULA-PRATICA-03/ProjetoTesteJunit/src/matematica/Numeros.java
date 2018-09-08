package matematica;

/**
  * @author fabionmiranda
 */
public class Numeros 
{
 // método tipo true of false (boolean) com 1 parametro inteiro 
 // chamado numero
    
    public Boolean numeroPar (int numero)
    {    
        return numero%2==0; 
    //retorna o resto (%) do numero dividido por 2
    //se for zero então ele é par
        
    }

    // método que retorna um numero inteiro e tem 1 parametro que o lado
    public int areaQuadrado(int lado)
    {    
        return lado*lado; 
    }
    
    //método que 0, 1 (true or false) com 2 parametros.
    public Boolean numeroDivisivel (int dividendo, int divisor)
    {
        return dividendo%divisor==0;
    }
    
    
//fim classe Numeros    
}

