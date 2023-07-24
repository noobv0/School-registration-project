package escolasaber;

import java.util.ArrayList;
import java.util.List;
class TurmaRepositoryImpl implements TurmaRepository {
    private List<Turma> turmas;

    public TurmaRepositoryImpl() {
        this.turmas = new ArrayList<>();
    }

    public void cadastrarTurma(Turma turma) {
        turmas.add(turma);
    }

    public Turma buscarTurma(String codigo) {
        for (Turma turma : turmas) {
            if (turma.getDisciplina().getCodigo().equals(codigo)) {
                return turma;
            }
        }
        return null;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}