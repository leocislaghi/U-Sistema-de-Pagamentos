package pagamentosloja;

public class Debito extends Cartao {

    private double saldoDisponivel;
    private String senha;

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void realizarPagamento() {

        if (getValor() <= 0) {
            setStatusTransacao("REPROVADO");
        } else if (getNumeroCartao() == null || getNumeroCartao().isEmpty()
                || getNomeTitular() == null || getNomeTitular().isEmpty()
                || getBandeira() == null || getBandeira().isEmpty()
                || getCvv() == null || getCvv().isEmpty()
                || senha == null || senha.isEmpty()) {
            setStatusTransacao("REPROVADO");
        } else if (saldoDisponivel < getValor()) {
            setStatusTransacao("REPROVADO");
            System.out.println("Saldo insuficiente.");
        } else {
            saldoDisponivel -= getValor();
            setStatusTransacao("APROVADO");
        }
    }

    @Override
    public void mostrarPagamento() {
        super.mostrarPagamento();
        System.out.println("Saldo disponível: R$ " + saldoDisponivel);
    }
}