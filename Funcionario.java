import java.text.*;

public abstract class Funcionario {
  private int matricula;
  private String nome;
  private double salario;
  
  public int getMatricula() {
    return matricula;
  }
  
  public String getNome() {
    return nome;
  }
  
  public double getSalario() {
    return salario;
  }
  
  public void setMatricula(int matricula) throws EDadoInvalido {
    if (matricula <= 0)
      throw new EDadoInvalido("A matrícula deve ser positiva");
      
    this.matricula = matricula;
  }
  
  public void setMatricula(String matricula) throws EDadoInvalido {
    try {
      setMatricula(Integer.parseInt(matricula));
    }
    catch (NumberFormatException nfe) {
      throw new EDadoInvalido("A matrícula deve ser um inteiro");
    }
  }
  
  public void setNome(String nome) throws EDadoInvalido{
    nome = nome.trim();
    
    if (nome.length() < 5)
      throw new EDadoInvalido("Nome com menos de 5 caracteres");
      
    if (nome.length() > 50)
      throw new EDadoInvalido("Nome com mais de 50 caracteres");
      
    this.nome = nome;
  }
  
  public void setSalario(double salario) throws EDadoInvalido {
    if (salario <= 0)
      throw new EDadoInvalido("O salário deve ser positivo");
    
    this.salario = salario;
  }
  
  public void setSalario(String salario) throws EDadoInvalido {
    try {
      setSalario( Double.parseDouble(salario) );
    }
    catch (NumberFormatException nfe) {
      throw new EDadoInvalido("O salário deve ser um número");
    }
  }
  
  public abstract double calcularProventos();
  
  public String toString() {
    double total = calcularProventos();
    double diferenca = total - salario;
    
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    return "Funcionário " + matricula + ": " + nome + " - " + 
      nf.format(salario) + " + " + nf.format(diferenca) + " = " +
      nf.format(total);
  }
}
