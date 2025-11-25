package model;

import java.util.ArrayList;
import java.util.List;

public class PerfumeFalta {
    private int id;
    private String nome;
    private List<Funcionario> solicitantes;
    private List<Cliente> clientesQueSentem;

    public PerfumeFalta() {
        this.solicitantes = new ArrayList<>();
        this.clientesQueSentem = new ArrayList<>();
    }

    public PerfumeFalta(int id, String nome) {
        this.id = id;
        this.setNome(nome);
        this.solicitantes = new ArrayList<>();
        this.clientesQueSentem = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do perfume em falta não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public List<Funcionario> getSolicitantes() { return solicitantes; }
    // Setter de coleção reintroduzido
    public void setSolicitantes(List<Funcionario> solicitantes) { this.solicitantes = solicitantes; }
    
    public List<Cliente> getClientesQueSentem() { return clientesQueSentem; }
    // Setter de coleção reintroduzido
    public void setClientesQueSentem(List<Cliente> clientesQueSentem) { this.clientesQueSentem = clientesQueSentem; }

    // Métodos auxiliares mantidos
    public void adicionarSolicitante(Funcionario funcionario) {
        if (funcionario != null && !this.solicitantes.contains(funcionario)) {
            this.solicitantes.add(funcionario);
        }
    }
    public void adicionarClienteQueSente(Cliente cliente) {
        if (cliente != null && !this.clientesQueSentem.contains(cliente)) {
            this.clientesQueSentem.add(cliente);
        }
    }
}
