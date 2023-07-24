package escolasaber;

import java.util.ArrayList;
import java.util.List;
class AlunoRepositoryImpl implements AlunoRepository {
    private List<Aluno> alunos;

    public AlunoRepositoryImpl() {
        this.alunos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno buscarAluno(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}