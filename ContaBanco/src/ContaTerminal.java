import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

                Scanner entrada = new Scanner(System.in);

                System.out.print("Digite o nome do cliente: ");
                String nome = entrada.nextLine();

                System.out.print("Digite o CPF do cliente: ");
                String cpf = entrada.nextLine();

                System.out.print("Digite o número da conta: ");
                int numeroConta = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Digite o número da agência: ");
                String agencia = entrada.nextLine();

                System.out.print("Digite o tipo da conta: ");
                String tipoConta = entrada.nextLine();

                System.out.print("Digite o saldo da conta: ");
                String saldoInput = entrada.nextLine();
                double saldo = Double.parseDouble(saldoInput);

                System.out.print("Cheque Especial (Sim/Não): ");
                String chequeEspecial = entrada.nextLine();

                Cliente cliente = new Cliente(nome, cpf, agencia, tipoConta);

                Conta conta = new Conta(cliente,numeroConta, agencia,saldo,tipoConta, chequeEspecial);

                System.out.println("\n***********************Informações da Conta:***********");
                System.out.println("Olá " + conta.getCliente().getNome() + ", obrigado por criar uma conta em nosso banco,");
                System.out.println("CPF: " + conta.getCliente().getCpf());
                System.out.println("Agência: " + conta.getAgencia());
                System.out.println("Tipo de Conta: " + conta.getTipoConta());
                System.out.println("Número da Conta: " + conta.getNumeroConta());
                System.out.println("Seu saldo " + conta.getSaldo() + " já está disponível para saque");
                System.out.println("Cheque Especial: " + conta.getChequeEspecial());

                entrada.close();
            }
        }
