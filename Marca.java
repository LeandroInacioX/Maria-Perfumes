package model;

import java.util.ArrayList;
import java.util.List;

public class Marca {
    private int id;
    private String nome;
    private List<Perfume> perfumes;

    public Marca() {
        this.perfumes = new ArrayList<>();
    }

    public Marca(int id, String nome) {
        this.id = id;
        this.setNome(nome);
        this.perfumes = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da marca não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public List<Perfume> getPerfumes() { return perfumes; }
    // Setter de coleção reintroduzido
    public void setPerfumes(List<Perfume> perfumes) { this.perfumes = perfumes; }

    // Método auxiliar mantido
    public void adicionarPerfume(Perfume perfume) {
        if (perfume != null && !this.perfumes.contains(perfume)) {
            this.perfumes.add(perfume);
        }
    }
}
