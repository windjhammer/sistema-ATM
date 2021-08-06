public class Pessoa {
    private String nome;
    private String cpf;

    Pessoa() {
        this.nome = "null";
        this.cpf = "null";
    }

    Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String toString() {
        String s = "Nome: "+this.nome+"\nCPF: "+this.cpf;
        return s;
    }
}
