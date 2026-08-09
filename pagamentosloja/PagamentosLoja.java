package pagamentosloja;
import java.util.Scanner;
public class PagamentosLoja {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Loja loja = new Loja();

        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Cadastrar Operador de Caixa");
            System.out.println("3 - Realizar Pagamento");
            System.out.println("4 - Listar Funcionarios");;
            System.out.println("5 - Listar Pagamentos");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    Gerente gerente = new Gerente();

                    System.out.print("ID: ");
                    gerente.setId(teclado.next());

                    System.out.print("Nome: ");
                    gerente.setNome(teclado.next());

                    System.out.print("CPF: ");
                    gerente.setCpf(teclado.next());

                    System.out.print("Salario: ");
                    gerente.setSalario(teclado.nextDouble());

                    System.out.print("Cargo: ");
                    gerente.setCargo(teclado.next());

                    System.out.print("Setor: ");
                    gerente.setSetor(teclado.next());

                    System.out.print("Bonus: ");
                    gerente.setBonus(teclado.nextDouble());

                    loja.adicionarFuncionario(gerente);
                    break;

                case 2:
                    OperadorCaixa operador = new OperadorCaixa();

                    System.out.print("ID: ");
                    operador.setId(teclado.next());

                    System.out.print("Nome: ");
                    operador.setNome(teclado.next());

                    System.out.print("CPF: ");
                    operador.setCpf(teclado.next());

                    System.out.print("Salario: ");
                    operador.setSalario(teclado.nextDouble());

                    System.out.print("Cargo: ");
                    operador.setCargo(teclado.next());

                    System.out.print("Numero do caixa: ");
                    operador.setNumeroCaixa(teclado.nextInt());

                    loja.adicionarFuncionario(operador);
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
                    loja.listarPagamentos();
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 6);
    }
}
