package model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private double comissao;
    private List<PerfumeFalta> perfumesSolicitados;

    public Funcionario() {
        this.perfumesSolicitados = new ArrayList<>();
    }

    public Funcionario(int id, String nome, String cpf, String telefone, String email, double comissao) {
        super(id, nome, cpf, telefone, email);
        this.setComissao(comissao);
        this.perfumesSolicitados = new ArrayList<>();
    }

    public double getComissao() { return comissao; }
    public void setComissao(double comissao) { 
        if (comissao < 0) {
            throw new IllegalArgumentException("A comissão não pode ser negativa.");
        }
        this.comissao = comissao; 
    }
    
    public List<PerfumeFalta> getPerfumesSolicitados() { return perfumesSolicitados; }
    // Setter de coleção reintroduzido
    public void setPerfumesSolicitados(List<PerfumeFalta> perfumesSolicitados) { this.perfumesSolicitados = perfumesSolicitados; }
    
    // Método auxiliar mantido
    public void adicionarPerfumeSolicitado(PerfumeFalta perfumeFalta) { 
        if (perfumeFalta != null) {
            this.perfumesSolicitados.add(perfumeFalta); 
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "pessoa=" + super.toString() +
                ", comissao=" + comissao +
                ", perfumesSolicitados=" + perfumesSolicitados.size() +
                '}';
    }
}
