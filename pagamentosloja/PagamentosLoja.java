package pagamentosloja;
import java.util.Scanner;
public class PagamentosLoja {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Loja loja = new Loja();

        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Cadastrar Caixa");
            System.out.println("3 - Realizar Pagamento");
            System.out.println("4 - Listar Funcionarios");
            System.out.println("5 - Listar Caixas");
            System.out.println("6 - Listar Pagamentos");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    Funcionario funcionario = new Funcionario();

                    System.out.print("ID: ");
                    funcionario.setId(teclado.next());

                    System.out.print("Nome: ");
                    funcionario.setNome(teclado.next());

                    System.out.print("CPF: ");
                    funcionario.setCpf(teclado.next());

                    System.out.print("Salario: ");
                    funcionario.setSalario(teclado.nextDouble());

                    System.out.print("Cargo: ");
                    funcionario.setCargo(teclado.next());

                    loja.adicionarFuncionario(funcionario);

                    System.out.println("Funcionario cadastrado!");
                    break;

                case 2:
                    Caixa caixa = new Caixa();

                    System.out.print("Operador: ");
                    caixa.setOperador(teclado.next());

                    caixa.setStatus("Fechado");

                    loja.adicionarCaixa(caixa);

                    System.out.println("Caixa cadastrado!");
                    break;

                case 3:
                    Pagamento pagamento = new Pagamento();

                    System.out.print("Numero do pagamento: ");
                    pagamento.setNumeroPagamento(teclado.nextInt());

                    System.out.print("Valor da venda: ");
                    pagamento.setValorVenda(teclado.nextDouble());

                    System.out.print("Valor do pagamento: ");
                    pagamento.setValorPagamento(teclado.nextDouble());

                    System.out.print("Metodo de pagamento: ");
                    pagamento.setMetodoPagamento(teclado.next());

                    pagamento.realizarPagamento();

                    if (pagamento.getStatusTransacao().equals("APROVADO")) {
                        loja.adicionarPagamento(pagamento);
                    }

                    break;

                case 4:
                    loja.listarFuncionarios();
                    break;

                case 5:
                    loja.listarCaixas();
                    break;

                case 6:
                    loja.listarPagamentos();
                    break;

                case 7:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 7);
    }
}
