public class App {
    public static void main(String[] args) throws Exception {

        Professor professor = new Professor();
        Turma turma = new Turma();
        Aluno aluno = new Aluno();

        professor.setNumero(14794);
        professor.setNomeProprio("Leoncyo");
        professor.setNomeApelido(" - Capitao Nascimento");
        professor.setAnoNascimento(1984);
        professor.setArea("Especialista em TI");

        turma.setCodigo("TP1234");
        turma.setNomeCurso("Programação");
        turma.setAnoInicio(2025);
        turma.setAnoFim(2028);

        aluno.setCodigo("a14794");
        aluno.setNomeProprio("Davi");
        aluno.setNomeApelido("Nascimento");
        aluno.setAnoNascimento(2010);
        aluno.setTurma(turma);

        System.out.println(professor.getInfoProfessor());
        System.out.println("\n" + turma.getInfoTurma());
        System.out.println("\nNome do Aluno: " + aluno.getNomeCompleto());
        System.out.println("O aluno tem " + aluno.getIdade() + " anos");

    }
}
