public class Servico {
    private String nome;
    private String descricao;
    private double preco;
    private int duracao;

    // Construtor
    public Servico(String nome, String descricao, double preco, int duracao) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.duracao = duracao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public
    int getDuracao() {
        return duracao;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDuracao(int
            duracao) {
        this.duracao = duracao;
    }
}