package pagamentosloja;
public class OperadorCaixa extends Funcionario{
    
    private int numeroCaixa;
    private String status = "FECHADO";

    public int getNumeroCaixa() {
        return numeroCaixa;
    }

    public void setNumeroCaixa(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
   @Override 
   public void mostrarDados() {
       super.mostrarDados();
       System.out.println("Numero do caixa: " + numeroCaixa);
       System.out.println("Status: " + status);
   }
    
}
