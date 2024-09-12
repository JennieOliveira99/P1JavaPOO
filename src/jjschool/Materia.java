package jjschool;

public class Materia {
    // Inserindo variáveis na classe Materia
    private int codigoDaMateria;
    private String nomeDaMateria;
    private String tipoDeAula;
    private int quantidadeAlunosMatriculados;

    // Construtor
    public Materia(int codigoDaMateria, String nomeDaMateria, String tipoDeAula, int quantidadeAlunosMatriculados) {
        this.codigoDaMateria = codigoDaMateria;
        this.nomeDaMateria = nomeDaMateria;
        this.tipoDeAula = tipoDeAula;
        this.quantidadeAlunosMatriculados = quantidadeAlunosMatriculados;
    }

    // Métodos getters e setters
    public int getCodigoDaMateria() { return codigoDaMateria; }
    public void setCodigoDaMateria(int codigoDaMateria) { this.codigoDaMateria = codigoDaMateria; }

    public String getNomeDaMateria() { return nomeDaMateria; }
    public void setNomeDaMateria(String nomeDaMateria) { this.nomeDaMateria = nomeDaMateria; }

    public String getTipoDeAula() { return tipoDeAula; }
    public void setTipoDeAula(String tipoDeAula) { this.tipoDeAula = tipoDeAula; }

    public int getQuantidadeAlunosMatriculados() { return quantidadeAlunosMatriculados; }
    public void setQuantidadeAlunosMatriculados(int quantidadeAlunosMatriculados) { this.quantidadeAlunosMatriculados = quantidadeAlunosMatriculados; }
}
