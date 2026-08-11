package pagamentosloja;
import java.util.Scanner;
public class PagamentosLoja {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Loja loja = new Loja();

        int opcao;

        do {
            System.out.println("\n===== LOJA JAVAVEIRA =====");
            System.out.println("1 - Acessar Sistema");
            System.out.println("2 - Sair");
            System.out.print("Escolha: ");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:

                    int perfil;

                    do {
                        System.out.println("\n===== ACESSAR SISTEMA =====");
                        System.out.println("1 - Gerente");
                        System.out.println("2 - Operador de Caixa");
                        System.out.println("3 - Voltar");
                        System.out.print("Escolha o perfil: ");

                        perfil = teclado.nextInt();

                        switch (perfil) {

                            // ================= GERENTE =================
                            case 1:

                                System.out.print("Usuario: ");
                                String usuario = teclado.next();

                                System.out.print("Senha: ");
                                String senha = teclado.next();

                                if (usuario.equals("gerente") && senha.equals("1234")) {

                                    System.out.println("Login realizado com sucesso!");

                                    int opcaoGerente;

                                    do {
                                        System.out.println("\n===== MENU GERENTE =====");
                                        System.out.println("1 - Cadastrar Funcionario");
                                        System.out.println("2 - Alterar Funcionario");
                                        System.out.println("3 - Listar Funcionarios");
                                        System.out.println("4 - Gerar Relatorio de Vendas");
                                        System.out.println("5 - Voltar");
                                        System.out.print("Escolha: ");

                                        opcaoGerente = teclado.nextInt();

                                        switch (opcaoGerente) {

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
                                                System.out.print("Digite o ID do funcionario: "); 
                                                String id = teclado.next();
                                                loja.alterarFuncionario(id, teclado);
                                                break;

                                            case 3:
                                                loja.listarFuncionarios();
                                                break;

                                            case 4:
                                                loja.listarPagamentos();
                                                break;

                                            case 5:
                                                System.out.println("Voltando...");
                                                break;

                                            default:
                                                System.out.println("Opcao invalida.");
                                        }

                                    } while (opcaoGerente != 5);

                                } else {
                                    System.out.println("Usuario ou senha incorretos.");
                                }

                                break;

                            // ================= OPERADOR =================
                            case 2:

                                System.out.println("\n===== MENU OPERADOR DE CAIXA =====");
                                System.out.println("1 - Realizar Pagamento");
                                System.out.println("2 - Listar Pagamentos");
                                System.out.println("3 - Voltar");
                                System.out.print("Escolha: ");

                                int opcaoOperador = teclado.nextInt();

                                if (opcaoOperador == 1) {

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

                                            System.out.print("Numero do cartao: ");
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

                                    if (pagamento != null &&
                                        "APROVADO".equals(pagamento.getStatusTransacao())) {

                                        loja.adicionarPagamento(pagamento);
                                        pagamento.mostrarPagamento();
                                    }

                                } else if (opcaoOperador == 2) {

                                    loja.listarPagamentos();

                                } else if (opcaoOperador == 3) {

                                    System.out.println("Voltando...");

                                } else {

                                    System.out.println("Opcao invalida.");
                                }

                                break;

                            case 3:
                                System.out.println("Voltando...");
                                break;

                            default:
                                System.out.println("Opcao invalida.");
                        }

                    } while (perfil != 3);

                    break;

                case 2:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 2);

        teclado.close();
    }
}
