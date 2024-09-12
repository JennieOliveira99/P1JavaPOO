package jjschool;

public class Professor {
    // Variáveis na classe Professor
    private int codigoProfessor;
    private String rankingProfessor;
    private String nomeProfessor;
    private String especialidade;
    private double salario;

    // Construtor
    public Professor(int codigoProfessor, String rankingProfessor, String nomeProfessor, String especialidade) {
        this.codigoProfessor = codigoProfessor;
        this.rankingProfessor = rankingProfessor;
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
    }

    // Getters e Setters
    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getRankingProfessor() {
        return rankingProfessor;
    }

    public void setRankingProfessor(String rankingProfessor) {
        this.rankingProfessor = rankingProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // Método para converter o salário
    public void conversaoSalario(double salario) {
        // Salário em ienes convertido para real brasileiro
        this.salario = salario * 0.031; // 0.031 taxa de câmbio
    }

    // Método público para obter o salário convertido
    public double getSalario() {
        return salario;
    }
}
