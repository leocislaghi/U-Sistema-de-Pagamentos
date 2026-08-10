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
                    System.out.println("===== FORMA DE PAGAMENTO =====");
                    System.out.println("1 - PIX");
                    System.out.println("2 - Boleto");
                    System.out.println("3 - Cartao");
                    System.out.print("Escolha: ");

                    int forma = teclado.nextInt();

                    Pagamento pagamento = null;

                    if (forma == 1) {
                        Pix pix = new Pix();

                        System.out.print("Numero do pagamento: ");
                        pix.setNumeroPagamento(teclado.nextInt());

                        System.out.print("Valor: ");
                        pix.setValor(teclado.nextDouble());

                        System.out.print("Chave PIX: ");
                        pix.setChavePix(teclado.next());

                        pix.realizarPagamento();
                        pagamento = pix;

                    } else if (forma == 2) {
                        Boleto boleto = new Boleto();

                        System.out.print("Numero do pagamento: ");
                        boleto.setNumeroPagamento(teclado.nextInt());

                        System.out.print("Valor: ");
                        boleto.setValor(teclado.nextDouble());

                        System.out.print("Codigo de barras: ");
                        boleto.setCodigoBarras(teclado.next());

                        boleto.realizarPagamento();
                        pagamento = boleto;

                    } else if (forma == 3) {

                        System.out.println("===== TIPO DE CARTAO =====");
                        System.out.println("1 - Debito");
                        System.out.println("2 - Credito");
                        System.out.print("Escolha: ");

                        int tipo = teclado.nextInt();

                        if (tipo == 1) {
                            Debito debito = new Debito();

                            System.out.print("Numero do pagamento: ");
                            debito.setNumeroPagamento(teclado.nextInt());

                            System.out.print("Valor: ");
                            debito.setValor(teclado.nextDouble());

                            System.out.print("Numero do cartao: ");
                            debito.setNumeroCartao(teclado.next());

                            System.out.print("Nome do titular: ");
                            debito.setNomeTitular(teclado.next());

                            System.out.print("Bandeira: ");
                            debito.setBandeira(teclado.next());

                            System.out.print("CVV: ");
                            debito.setCvv(teclado.next());

                            System.out.print("Senha: ");
                            debito.setSenha(teclado.next());

                            System.out.print("Saldo disponivel: ");
                            debito.setSaldoDisponivel(teclado.nextDouble());

                            debito.realizarPagamento();
                            pagamento = debito;

                        } else if (tipo == 2) {
                            System.out.println("1 - A vista");
                            System.out.println("2 - Parcelado");
                            System.out.print("Escolha: ");

                            int escolha = teclado.nextInt();

                            Credito credito;

                            if (escolha == 1) {
                                credito = new Credito();
                            } else {
                                System.out.print("Quantidade de parcelas: ");
                                int parcelas = teclado.nextInt();
                                credito = new Credito(parcelas);
                            }

                            System.out.print("Numero do pagamento: ");
                            credito.setNumeroPagamento(teclado.nextInt());

                            System.out.print("Valor: ");
                            credito.setValor(teclado.nextDouble());

                            System.out.print("Numero do cartão: ");
                            credito.setNumeroCartao(teclado.next());

                            System.out.print("Nome do titular: ");
                            credito.setNomeTitular(teclado.next());

                            System.out.print("Bandeira: ");
                            credito.setBandeira(teclado.next());

                            System.out.print("CVV: ");
                            credito.setCvv(teclado.next());

                            System.out.print("Limite disponivel: ");
                            credito.setLimiteDisponivel(teclado.nextDouble());

                            credito.realizarPagamento();
                            pagamento = credito;
                        }
                    }

                    if (pagamento != null && "APROVADO".equals(pagamento.getStatusTransacao())) {
                        loja.adicionarPagamento(pagamento);
                        pagamento.mostrarPagamento();
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
