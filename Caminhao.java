import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {
  private int eixos;
  
  public Caminhao(String placa, int ano, int eixos) {
    super(placa,ano);
    this.eixos = eixos;
  }
  
  public int getEixos() {
    return eixos;
  }
  
  public void setEixos(int eixos) {
    this.eixos = eixos;
  }
  
  public void exibirDados() {
    super.exibirDados();
    String str = "Número de eixos: " + eixos;
    JOptionPane.showMessageDialog(null,str,"Mensagem",1);
  }
}
