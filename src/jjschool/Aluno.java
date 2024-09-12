package jjschool;

public class Aluno {
    // Inserindo Variáveis na CLASSE Aluno
    private int idAluno;
    private String nome;
    private String dataNascimento;
    private int idade;
    private double altura;
    private String especialidade;
    private String ranking;

    // Construtor
    public Aluno(int idAluno, String nome, String dataNascimento, int idade, double altura, String especialidade, String ranking) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.altura = altura;
        this.especialidade = especialidade;
        this.ranking = ranking;
    }

    // Métodos getters e setters
    public int getIdAluno() { return idAluno; }
    public void setIdAluno(int idAluno) { this.idAluno = idAluno; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public String getRanking() { return ranking; }
    public void setRanking(String ranking) { this.ranking = ranking; }

    // Método para atualizar o ranking do aluno com condicional
    public void atualizarRanking(String novoRanking) {
        // Só atualiza se o novoRanking não for nulo e não estiver vazio
        if (novoRanking != null && !novoRanking.isEmpty()) {
            this.ranking = novoRanking;
        }
    }
}
