package jjschool;

public class TestaProfessor {

    public static void main(String[] args) {
        // Criando atributos/objetos na classe Professor usando o construtor
        Professor professor1 = new Professor(23, "Classe Especial", "Gojo Satoru", "Técnicas de Maldição");
        
        // Definindo e convertendo o salário
        double salarioOriginal = 100000.0; // Salário em ienes
        professor1.conversaoSalario(salarioOriginal);
       
        // Exibindo informações do professor Gojo
        System.out.println("Código Professor: " + professor1.getCodigoProfessor());
        System.out.println("Ranking Professor: " + professor1.getRankingProfessor());
        System.out.println("Nome do Professor: " + professor1.getNomeProfessor());
        System.out.println("Especialidade do Professor: " + professor1.getEspecialidade());
        System.out.println("Salário Convertido: " + professor1.getSalario() + " Em Real Brasileiro");

        // Criando outro professor, Nanami
        Professor professor2 = new Professor(24, "Classe A", "Kento Nanami", "Técnicas de Exorcismo");
        
        // Definindo e convertendo o salário
        double salarioOriginalNanami = 90000.0; // Salário em ienes para Nanami
        professor2.conversaoSalario(salarioOriginalNanami);
       
        // Exibindo informações do professor Nanami
        System.out.println("***********************************************");
        System.out.println("Código Professor: " + professor2.getCodigoProfessor());
        System.out.println("Ranking Professor: " + professor2.getRankingProfessor());
        System.out.println("Nome do Professor: " + professor2.getNomeProfessor());
        System.out.println("Especialidade do Professor: " + professor2.getEspecialidade());
        System.out.println("Salário Convertido: " + professor2.getSalario() + " Em Real Brasileiro");
    }
}
