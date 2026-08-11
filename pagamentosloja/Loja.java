package pagamentosloja;
import java.util.ArrayList;
import java.util.Scanner;
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
    
    public void alterarFuncionario(String id, Scanner teclado) {

        for (Funcionario funcionario : funcionarios) {

            if (funcionario.getId().equals(id)) {

                System.out.print("Novo nome: ");
                funcionario.setNome(teclado.next());

                System.out.print("Novo CPF: ");
                funcionario.setCpf(teclado.next());

                System.out.print("Novo salario: ");
                funcionario.setSalario(teclado.nextDouble());

                System.out.print("Novo cargo: ");
                funcionario.setCargo(teclado.next());

                System.out.println("Funcionario alterado com sucesso!");
                return;
            }
        }

        System.out.println("Funcionario nao encontrado.");
    }
}
