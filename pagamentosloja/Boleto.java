package pagamentosloja;
public class Boleto extends Pagamento {

    private String codigoBarras;

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void realizarPagamento() {

        if (getValor() <= 0) {
            setStatusTransacao("REPROVADO");
        } else if (codigoBarras == null || codigoBarras.isEmpty()) {
            setStatusTransacao("REPROVADO");
        } else {
            setStatusTransacao("APROVADO");
        }
    }

    @Override
    public void mostrarPagamento() {
        super.mostrarPagamento();
        System.out.println("Codigo de barras: " + codigoBarras);
    }
}