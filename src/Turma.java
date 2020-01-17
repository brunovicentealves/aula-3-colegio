import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int numeroTurma;
    private Aluno aluno;
    private DiarioDeClasse diarioDeClasse;
    private List<DiarioDeClasse> aulas = new ArrayList<DiarioDeClasse>();

    public Turma(int numeroTurma, Aluno aluno, DiarioDeClasse diarioDeClasse) {
        this.numeroTurma = numeroTurma;
        this.aluno = aluno;
        this.diarioDeClasse = diarioDeClasse;
    }

    public List<DiarioDeClasse> getAulas() {
        return aulas;
    }

    public void setAulas(List<DiarioDeClasse> aulas) {
        this.aulas = aulas;
    }
}
