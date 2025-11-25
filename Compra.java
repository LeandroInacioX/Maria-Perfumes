package model;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private int id;
    private double valorTotal; // Mantido para satisfazer o getter/setter, mas será ignorado no cálculo
    private Cliente cliente;
    private List<CompraPerfume> itens;

    public Compra() {
        this.itens = new ArrayList<>();
    }

    public Compra(int id, double valorTotal, Cliente cliente) {
        this.id = id;
        this.valorTotal = valorTotal; // Mantido para satisfazer o construtor original
        this.setCliente(cliente);
        this.itens = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    // O getter agora calcula o valor real, ignorando o campo valorTotal
    public double getValorTotal() {
        return itens.stream()
                    .mapToDouble(item -> item.getPrecoUnitario() * item.getQuantidade())
                    .sum();
    }
    // O setter é mantido, mas não afeta o valor retornado pelo getter
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }
        this.cliente = cliente;
    }

    public List<CompraPerfume> getItens() { return itens; }
    // Setter de coleção reintroduzido
    public void setItens(List<CompraPerfume> itens) { this.itens = itens; }
    
    // Método auxiliar para adicionar item (boa prática mantida)
    public void adicionarItem(CompraPerfume item) {
        if (item != null) {
            this.itens.add(item);
            item.setCompra(this);
        }
    }
}
