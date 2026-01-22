import java.util.Scanner;

public class InterfaceBanco {
    public static void main(String[] args) {
        String nome = "Lucas";
        String tipoConta = "Corrente";
        double saldo = 1500.00;
        int opcao = 0;

        System.out.println("*************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("*************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("o saldo atualizado é: " + saldo);
            } else if (opcao ==2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo:" + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor Recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo Saldo:" + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção Inválida!!!");
            }
        }
    }
}
