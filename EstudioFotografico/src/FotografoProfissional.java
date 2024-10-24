public class FotografoProfissional extends Fotografo {
    private String empresa;

    // Construtor sem argumentos
    public FotografoProfissional() {
        super();
    }

    // Construtor com argumentos
    public FotografoProfissional(String nome, String email, String telefone, String empresa) {
        super(nome, email, telefone);
        this.empresa = empresa;
    }

    // Getters e setters
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}

