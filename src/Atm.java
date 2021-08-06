import java.util.Scanner;
import java.util.HashMap;
public class Atm {

    public static void caixa(HashMap<String, Cliente> Clientes, String cpfCliente) {
        
        Cliente cliente = Clientes.get(cpfCliente);
        
        double saldo = cliente.getSaldo(), saque, deposito;
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        while(a) {
            System.out.println("---Caixa Eletrônico---");
            System.out.println("1. Saque");
            System.out.println("2. Depósito");
            System.out.println("3. Saldo");
            System.out.println("4. Sair");
            System.out.println("----------------------");
            System.out.print("Escolha a operação que deseja fazer: ");

            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Digite o valor a ser sacado: ");
                    saque = sc.nextInt();
                    if(saldo >= saque) {
                        saldo = saldo - saque;
                        System.out.println(saque+" Reais sacados, retire o dinheiro. O seu saldo agora é: "+saldo);
                        cliente.setSaldo(saldo);
                    }
                    else {
                        System.out.println("Saldo insuficiente.");
                    }
                    System.out.println("");
                    break;
                
                case 2:
                    System.out.print("Digite o Valor a ser depositado: ");
                    
                    deposito = sc.nextDouble();

                    saldo = saldo+deposito;
                    System.out.println(deposito+" Reais depositados com sucesso, o seu saldo agora é: "+saldo);
                    System.out.println("");
                    cliente.setSaldo(saldo);
                    break;
                
                case 3:
                    System.out.println("Saldo: "+saldo);
                    System.out.println("");
                    break;

                case 4:
                    a = false;
                    break;
            }
        }
    }

    Atm() {

    }
}