package jjschool;

public class TestaClasseDeAula {

    public static void main(String[] args) {
        // Criando objetos da classe ClasseDeAula
        ClasseDeAula classe1 = new ClasseDeAula();
        classe1.categoria = "Professor";
        classe1.categoria2 = "Aluno";
        classe1.numeroDaSala = 22;

        // Criando objeto da classe Professor
        Professor professor1 = new Professor(23, "Classe Especial", "Gojo Satoru", "Técnicas de Maldição");

        // Criando objetos na classe Aluno usando o construtor
        Aluno aluno1 = new Aluno(7145, "Itadori Yuuji", "20/03/2003", 15, 1.75, "Luta corpo a corpo", "C");
        aluno1.atualizarRanking("C");

        // Criando objetos na classe Materia usando o construtor
        Materia materia1 = new Materia(101, "Luta", "Prática", 20);

        // Exibindo informações da classe Materia
        System.out.println("Código da Matéria: " + materia1.getCodigoDaMateria());
        System.out.println("Nome da Matéria: " + materia1.getNomeDaMateria());
        System.out.println("Tipo de Aula: " + materia1.getTipoDeAula());
        System.out.println("Quantidade de Alunos Matriculados: " + materia1.getQuantidadeAlunosMatriculados());

        System.out.println("***********************************************");

        // Exibindo informações da classe
        System.out.println("Categoria: " + classe1.categoria);
        System.out.println("Nome do Professor: " + professor1.getNomeProfessor());
        System.out.println("Código Professor: " + professor1.getCodigoProfessor());
        System.out.println("Nº da Sala: " + classe1.numeroDaSala);
        System.out.println("***********************************************");

        // Exibindo informações do aluno
        System.out.println("ID do Aluno: " + aluno1.getIdAluno());
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Data Nascimento: " + aluno1.getDataNascimento());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Altura: " + aluno1.getAltura());
        System.out.println("Especialidade: " + aluno1.getEspecialidade());
        System.out.println("Ranking do aluno atualizado para: RANKING " + aluno1.getRanking());

        // Criando outro aluno
        Aluno aluno2 = new Aluno(5152, "Megumi Fushiguro", "22/12/2002", 16, 1.70, "Shikigami", "");

        System.out.println("***********************************************");
        System.out.println("Categoria: " + classe1.categoria2);
        System.out.println("Nº da Sala: " + classe1.numeroDaSala);
        System.out.println("ID do Aluno 1: " + aluno1.getIdAluno());
        System.out.println("ID do Aluno 2: " + aluno2.getIdAluno());
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Data Nascimento: " + aluno2.getDataNascimento());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Altura: " + aluno2.getAltura());
        System.out.println("Especialidade: " + aluno2.getEspecialidade());
    }
}
