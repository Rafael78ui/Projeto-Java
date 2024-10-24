import java.util.Date;
import java.util.List;

public class Agendamento {
    private Date dataHora;
    private Cliente cliente;
    private List<Servico> servicos;
    private Funcionario fotografo;
    private Estudio estudio;

    // Construtor
    public Agendamento(Date dataHora, Cliente cliente, List<Servico> servicos, Funcionario fotografo, Estudio estudio) {
        this.dataHora = dataHora;
        this.cliente = cliente;
        this.servicos = servicos;
        this.fotografo = fotografo;
        this.estudio = estudio;
    }

    // Getters
    public Date getDataHora() {
        return dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public Funcionario getFotografo() {
        return fotografo;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    // Setters
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public  
    void setFotografo(Funcionario fotografo) {
        this.fotografo = fotografo;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }
}