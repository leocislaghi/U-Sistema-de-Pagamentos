package pagamentosloja;
public abstract class Pagamento {
    
    private int numeroPagamento;
    private double valor;
    private String statusTransacao;

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public void setNumeroPagamento(int numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatusTransacao() {
        return statusTransacao;
    }

    public void setStatusTransacao(String statusTransacao) {
        this.statusTransacao = statusTransacao;
    }

    public abstract void realizarPagamento();

    public void mostrarPagamento() {
        System.out.println("Numero: " + numeroPagamento);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + statusTransacao);
    }
}