package pagamentosloja;

public abstract class Cartao extends Pagamento {

    private String numeroCartao;
    private String nomeTitular;
    private String bandeira;
    private String cvv;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public void mostrarPagamento() {
        super.mostrarPagamento();
        System.out.println("Numero do cartao: " + numeroCartao);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Bandeira: " + bandeira);
        System.out.println("CVV: " + cvv);
    }
}