package model;

public class CompraPerfume {
    private Compra compra;
    private Perfume perfume;
    private int quantidade;
    private double precoUnitario;

    public CompraPerfume() {}

    public CompraPerfume(Compra compra, Perfume perfume, int quantidade, double precoUnitario) {
        this.setCompra(compra);
        this.setPerfume(perfume);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);
    }

    public Compra getCompra() { return compra; }
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Perfume getPerfume() { return perfume; }
    public void setPerfume(Perfume perfume) { this.perfume = perfume; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario <= 0) {
            throw new IllegalArgumentException("O preço unitário deve ser maior que zero.");
        }
        this.precoUnitario = precoUnitario;
    }
}
