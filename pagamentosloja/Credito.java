package pagamentosloja;

public class Credito extends Cartao {

    private double limiteDisponivel;
    private int parcelas;

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public void realizarPagamento() {

        if (getValor() <= 0) {
            setStatusTransacao("REPROVADO");
        } else if (getNumeroCartao() == null || getNumeroCartao().isEmpty()
                || getNomeTitular() == null || getNomeTitular().isEmpty()
                || getBandeira() == null || getBandeira().isEmpty()
                || getCvv() == null || getCvv().isEmpty()) {
            setStatusTransacao("REPROVADO");
        } else if (limiteDisponivel < getValor()) {
            setStatusTransacao("REPROVADO");
            System.out.println("Limite insuficiente.");
        } else {
            limiteDisponivel -= getValor();
            setStatusTransacao("APROVADO");
        }
    }

    @Override
    public void mostrarPagamento() {
        super.mostrarPagamento();

        System.out.println("Limite disponível: R$ " + limiteDisponivel);
        System.out.println("Parcelas: " + parcelas);

        if (parcelas > 1) {
            double valorParcela = getValor() / parcelas;
            System.out.println("Valor de cada parcela: R$ " + valorParcela);
        }
    }
    
    public Credito() {
    parcelas = 1;
    }
    
    public Credito(int parcelas) {
    this.parcelas = parcelas;
    }   
    
}