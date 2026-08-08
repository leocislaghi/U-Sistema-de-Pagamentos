package pagamentosloja;
public class Pagamento {
    
    private int numeroPagamento;
    private double valorVenda;
    private double valorPagamento;
    private String metodoPagamento;
    private String statusTransacao;
    
    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public void setNumeroPagamento(int numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getStatusTransacao() {
        return statusTransacao;
    }

    public void setStatusTransacao(String statusTransacao) {
        this.statusTransacao = statusTransacao;
    }
    
    public void realizarPagamento() {
    if (valorPagamento <= 0) {
        statusTransacao = "REPROVADO";
    } else if (metodoPagamento == null || metodoPagamento.isEmpty()) {
        statusTransacao = "REPROVADO";
    } else {
        statusTransacao = "APROVADO";
    }
}

    public void mostrarPagamento() {
        System.out.println("===INFORMACOES PAGAMENTO===");  
        System.out.println("Numero do pagamento: " + numeroPagamento);
        System.out.println("Valor da venda: " + valorVenda);
        System.out.println("Valor do Pagamento: " + valorPagamento);
        System.out.println("Metodo de pagamento: " + metodoPagamento);
        System.out.println("Status da transacao: " + statusTransacao);
    }
    
}
