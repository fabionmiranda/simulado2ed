public class FComissionado extends Funcionario {
  private double percentual;
  private double vendas;
  
  public double getPercentual() {
    return percentual;
  }
  
  public double getVendas() {
    return vendas;
  }
  
  public void setPercentual(double percentual) throws EDadoInvalido {
    if (percentual <= 0)
      throw new EDadoInvalido("O percentual deve ser positivo");
    
    this.percentual = percentual;
  }
  
  public void setPercentual(String percentual) throws EDadoInvalido {
    try {
      setPercentual( Double.parseDouble(percentual) );
    }
    catch (NumberFormatException nfe) {
      throw new EDadoInvalido("O percentual deve ser um número");
    }
  }
  
  public void setVendas(double vendas) throws EDadoInvalido {
    if (vendas < 0)
      throw new EDadoInvalido("Não há valor negativo para as vendas");
    
    this.vendas = vendas;
  }
  
  public void setVendas(String vendas) throws EDadoInvalido {
    try {
      setVendas( Double.parseDouble(vendas) );
    }
    catch (NumberFormatException nfe) {
      throw new EDadoInvalido("O valor das vendas é inválido");
    }
  }
  
  public double calcularProventos() {
    return super.getSalario() + (vendas * percentual / 100);
  }
}
