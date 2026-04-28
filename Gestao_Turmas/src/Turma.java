public class Turma {

    private String codigo;
    private String nomeCurso;
    private int anoInicio;
    private int anoFim;


    public Turma() {

        this.codigo = "";
        this.nomeCurso = "";
        this.anoInicio = 0;
        this.anoFim = 0;

    }

    public Turma(String codigo, String nomeCurso, int anoInicio, int anoFim) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getAnoFim() {
        return anoFim;
    }

    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }

    public String getInfoTurma(String cod, String curso, int anoInicio1, int anoFim1 ) {
        return "-----INFORMAÇÕES-DA-TURMA-----\n\n" + 
        "Codigo da turma: " + cod.toUpperCase() +
        "\nNome do Curso: " + curso.toUpperCase() +
        "\nAno de Inicio: " + anoInicio1 +
        "\nAno de Fim: " + anoFim1;
    }

}