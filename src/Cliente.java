public class Cliente extends Pessoa {
    private double saldo;

    Cliente() {
        super();
        this.saldo = 0.00;
    }

    Cliente(String nome, String cpf, double saldo) {
        super(nome, cpf);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        String s = super.toString();
        s += "\nSaldo: "+this.saldo;
        return s;
    }
}
