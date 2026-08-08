package pagamentosloja;
import java.util.ArrayList;
public class Loja {
    
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Caixa> caixas;
    private ArrayList<Pagamento> pagamentos;
    
    public Loja() {
        funcionarios = new ArrayList<>();
        caixas = new ArrayList<>();
        pagamentos = new ArrayList<>();
    }
    
    public void adicionarFuncionario(Funcionario funcionario) {
    funcionarios.add(funcionario);
    }
    
    public void adicionarCaixa(Caixa caixa) {
    caixas.add(caixa);
    }

    public void adicionarPagamento(Pagamento pagamento) {
    pagamentos.add(pagamento);
    }

    public void listarFuncionarios() {
    for (Funcionario funcionario : funcionarios) {
        funcionario.mostrarDados();
    }
    }

    public void listarCaixas() {
    for (Caixa caixa : caixas) {
        caixa.mostratDados();
    }
    }

    public void listarPagamentos() {
    for (Pagamento pagamento : pagamentos) {
        pagamento.mostrarPagamento();
    }
    }
    
    
}
