import java.util.Date;
import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
}

class Servico {
    private String nome;
    private String descricao;
    private double preco;
    private int duracao;
}

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("João da Silva", "12345678901", "(11) 98765-4321");

        // Criando uma lista de serviços
        List<Servico> servicos = new ArrayList<>();
        servicos.add(new Servico("Fotografia", "Sessão de fotos", 500.0, 2));
        servicos.add(new Servico("Vídeo", "Gravação do evento", 800.0, 3));

        // Criando um fotógrafo profissional
        FotografoProfissional fotografo = new FotografoProfissional("Maria", "987654321", "Fotografia de Casamento");

        // Criando um estúdio
        Estudio estudio = new Estudio("Estudio da Maria", "Rua Principal, 123");

        // Criando um agendamento
        Date dataHora = new Date();
        Agendamento agendamento = new Agendamento(dataHora, cliente, servicos, fotografo, estudio);

        // Imprimindo informações do agendamento
        System.out.println("Agendamento criado com sucesso!");
        System.out.println("Cliente: " + agendamento.getCliente().getNome());
        // ... outras informações
    }
}