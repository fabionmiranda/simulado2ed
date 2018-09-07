public class EDadoInvalido extends Exception {
  public EDadoInvalido() {
    super("Dado inválido!");
  }
  
  public EDadoInvalido(String mensagem) {
    super("Dado inválido!\n" + mensagem);
  }
}
