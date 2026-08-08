package pagamentosloja;
public class PagamentosLoja {
    public static void main(String[] args) {
        //Classe Funcionário
        Funcionario funcionario = new Funcionario();
        
        funcionario.setId("123.321.123");
        funcionario.setNome("Leonardo Barbosa Cislaghi");
        funcionario.setCpf("564.059.784.23");
        funcionario.setCargo("Supervisor");
        
        funcionario.mostrarDados();
        
        //Classe Caixa
        Caixa caixa = new Caixa();
        
        caixa.setOperador("Marcos");
        caixa.setStatus("Fechado");
        caixa.abrirCaixa();
        caixa.fecharCaixa();
        
        caixa.mostratDados();
        
        //Classe Pagamento
        Pagamento pagamento = new Pagamento
        
        pagamento.setMetodoPagamento("Pix");
        pagamento.setNumeroPagamento(1545525);
        pagamento.setStatusTransacao("Aprovado");
        pagamento.setValorPagamento(50.9);
        pagamento.setValorVenda(25);
    }
    
}
