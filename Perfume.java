package model;

public class Perfume {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private Marca marca;

    public Perfume() {}

    public Perfume(int id, String nome, String descricao, double preco, Marca marca) {
        this.id = id;
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setMarca(marca);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do perfume não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }
        this.preco = preco;
    }

    public Marca getMarca() { return marca; }
    public void setMarca(Marca marca) {
        if (marca == null) {
            throw new IllegalArgumentException("A marca do perfume não pode ser nula.");
        }
        this.marca = marca;
    }
}
