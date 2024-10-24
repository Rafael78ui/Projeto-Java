public class Cliente {
    private String nome;
    private String cpfCnpj;
    private String telefone;


    // Construtor
    public Cliente(String nome, String cpfCnpj, String telefone) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.telefone = telefone;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public String getTelefone() {
        return telefone;
    }


    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setTelefone(String
            telefone) {
        this.telefone = telefone;

    }

    // ... outros setters
}