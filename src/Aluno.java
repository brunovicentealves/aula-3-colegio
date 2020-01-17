import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String nomeDoPai;
    private String nomeDaMae;
    private String dataNascimento;
    private String numeroCertidaoNascimento;

    public Aluno(String nome, String nomeDoPai, String nomeDaMae, String dataNascimento, String numeroCertidaoNascimento) {
        this.nome = nome;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.dataNascimento = dataNascimento;
        this.numeroCertidaoNascimento = numeroCertidaoNascimento;
    }
    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    private List<Turma> turmas = new ArrayList<Turma>();
}

