package pagamentosloja;
public class Pix extends Pagamento {

    private String chavePix;

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void realizarPagamento() {

        if (getValor() <= 0) {
            setStatusTransacao("REPROVADO");
        } else if (chavePix == null || chavePix.isEmpty()) {
            setStatusTransacao("REPROVADO");
        } else {
            setStatusTransacao("APROVADO");
        }
    }

    @Override
    public void mostrarPagamento() {
        super.mostrarPagamento();
        System.out.println("Chave PIX: " + chavePix);
    }
}