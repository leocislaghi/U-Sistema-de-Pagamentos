package pagamentosloja;
import java.util.ArrayList;
public class Loja {
    
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Pagamento> pagamentos;
    
    public Loja() {
        funcionarios = new ArrayList<>();
        pagamentos = new ArrayList<>();
    }
    
       public void adicionarFuncionario(Funcionario funcionario) {
        for (Funcionario f : funcionarios) {
            if (f.getId().equals(funcionario.getId())) {
                System.out.println("ID ja cadastrado!");
                return;
            }
        }

        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado!");
    }

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
        }
    }

    public void listarPagamentos() {
        if (pagamentos.isEmpty()) {
            System.out.println("Nenhum pagamento cadastrado.");
            return;
        }
    
        for (Pagamento pagamento : pagamentos) {
            pagamento.mostrarPagamento();
        }
    }
}
