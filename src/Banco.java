import java.util.HashMap;
import java.util.Scanner;


public class Banco {
    private HashMap<String, Cliente> Clientes;

    Banco() {
        this.Clientes = new HashMap<>();
    }

    public void atendimento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique seu cpf");
        String cpf = sc.nextLine();
        if (this.Clientes.size() > 0)
            Atm.caixa(Clientes, cpf);
        return;
    }

    public void registrarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique o nome do cliente:");
        String nome = sc.nextLine();
        System.out.println("Indique o CPF do cliente:");
        String cpf = sc.nextLine();
        System.out.println("Indique o saldo do cliente:");
        double saldo = sc.nextDouble();

        this.Clientes.put(cpf, new Cliente(nome, cpf, saldo));
    }

    public void listarClientes() {
        for (String i : this.Clientes.keySet()) {
            System.out.println(this.Clientes.get(i));
            System.out.print("\n\n");
        }
    }
}
