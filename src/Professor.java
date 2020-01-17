import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario{
//    private String leciona;
    private List<DiarioDeClasse> aulas = new ArrayList<>();

    public Professor(String nome, String dataNascimento) {
        super(nome, dataNascimento);
    }

    public List<DiarioDeClasse> getAulas() {
        return aulas;
    }

    public void setAulas(List<DiarioDeClasse> aulas) {
        this.aulas = aulas;
    }
}
