package escolasaber;

import java.util.ArrayList;
import java.util.List;
class DisciplinaRepositoryImpl implements DisciplinaRepository {
    private List<Disciplina> disciplinas;

    public DisciplinaRepositoryImpl() {
        this.disciplinas = new ArrayList<>();
    }

    public void cadastrarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public Disciplina buscarDisciplina(String codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo().equals(codigo)) {
                return disciplina;
            }
        }
        return null;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}