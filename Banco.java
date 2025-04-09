import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        //DECLARANDO VARIÁVEIS
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String nome = "Isac de Aguiar";
        String conta = "Corrente";
        double saldoConta = 2500.00;
        double valor = 0;

        String menu = """
                \nOPERAÇÕES
                
                1- Consultar saldo
                2- Depósito
                3- Saque
                4- Sair
                """;

        String cliente = """
                Nome:\t\t\t%s
                Tipo conta:\t\t%s
                Saldo Inicial:\t%.2f
                """.formatted(nome, conta, saldoConta);

        System.out.println(cliente);

        // INICIO LAÇO DE REPETIÇÃO
        while (opcao < 4) {
            System.out.print(menu + "\nDIGITE A OPERAÇÃO ---> ");
            opcao = scanner.nextInt();
            System.out.println("*********************************************");

            //VERIFICA VALOR CORRETO DA OPERAÇÃO
            if (opcao < 1 || opcao > 4) {
                System.out.println("\nOPCAO INVÁLIDA!");
                System.out.println("*********************************************");

            // CONSULTA DO SALDO DA CONTA CORRENTE
            }else if (opcao == 1) {
                System.out.println("\nSALDO DA CONTA");
                System.out.println("R$ %.2f".formatted(saldoConta));
                System.out.println("*********************************************");

            // DEPÓSITO NA CONTA
            } else if (opcao == 2) {
                System.out.println("\nDEPÓSITO CONTA");
                System.out.print("VALOR: ");
                valor = scanner.nextDouble();

                //VERIFICA SE O DEPÓSITO TEM VALORES POSITIVOS
                if (valor <= 0) {
                    System.out.println("\nVALOR INVÁLIDO!");
                    System.out.println("*********************************************");
                } else {
                    saldoConta += valor;
                    System.out.println("\nSALDO ATUAL: R$ %.2f".formatted(saldoConta));
                    System.out.println("*********************************************");
                }

            //SAQUE DA CONTA CORRENTE
            } else if (opcao == 3) {
                System.out.println("\nSAQUE CONTA CORRENTE");
                System.out.print("VALOR PARA SAQUE: ");
                valor = scanner.nextDouble();

                /*VERIFICA SE O VALOR PARA SAQUE É POSITIVO OU SE O VALOR É
                  MAIOR QUE O SALDO DA CONTA
                */
                if (valor <= 0 || valor > saldoConta) {
                    System.out.println("\nVALOR INVÁLIDO!");
                    System.out.println("*********************************************");
                } else { // REALIZA O SAQUE DO VALOR DA CONTA
                    saldoConta -= valor;
                    System.out.println("\nSALDO ATUAL: R$ %.2f".formatted(saldoConta));
                    System.out.println("*********************************************");
                }
            }

            else if (opcao == 4){
                System.out.println("\nOBRIGADO POR USAR O NOSSO SISTEMA!");
            }
        }
    }
}
