import java.util.ArrayList;
import java.util.List;

public class Serie {
    private int numero;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Serie(int numero) {
        this.numero = numero;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
