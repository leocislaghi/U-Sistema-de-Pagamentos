package pagamentosloja;
public class Caixa {
    
    private String operador;
    private String status;

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void abrirCaixa() {
        status = "Aberto";
    }
    
     public void fecharCaixa() {
        status = "Fechado";
    }
    
     public void mostratDados() {
         System.out.println("===INFORMACOES DO CAIXA===");
         System.out.println("Operador: " + operador);
         System.out.println("Status: " + status);
         
     }
}
