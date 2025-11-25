package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Compra> compras;
    private List<PerfumeFalta> perfumesSentidos;

    public Cliente() {
        this.compras = new ArrayList<>();
        this.perfumesSentidos = new ArrayList<>();
    }

    public Cliente(int id, String nome, String cpf, String telefone, String email) {
        super(id, nome, cpf, telefone, email);
        this.compras = new ArrayList<>();
        this.perfumesSentidos = new ArrayList<>();
    }

    public List<Compra> getCompras() { return compras; }
    // Setter de coleção reintroduzido
    public void setCompras(List<Compra> compras) { this.compras = compras; }
    
    public List<PerfumeFalta> getPerfumesSentidos() { return perfumesSentidos; }
    // Setter de coleção reintroduzido
    public void setPerfumesSentidos(List<PerfumeFalta> perfumesSentidos) { this.perfumesSentidos = perfumesSentidos; }

    // Métodos auxiliares mantidos
    public void adicionarCompra(Compra compra) { this.compras.add(compra); }
    public void adicionarPerfumeSentido(PerfumeFalta perfumeFalta) { this.perfumesSentidos.add(perfumeFalta); }

    @Override
    public String toString() {
        return "Cliente{" +
                super.toString() +
                ", numCompras=" + compras.size() +
                ", numPerfumesSentidos=" + perfumesSentidos.size() +
                '}';
    }
}
