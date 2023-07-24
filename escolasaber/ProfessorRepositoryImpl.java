package escolasaber;

import java.util.ArrayList;
import java.util.List;
class ProfessorRepositoryImpl implements ProfessorRepository {
    private List<Professor> professores;

    public ProfessorRepositoryImpl() {
        this.professores = new ArrayList<>();
    }

    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }

    public Professor buscarProfessor(int registro) {
        for (Professor professor : professores) {
            if (professor.getRegistro() == registro) {
                return professor;
            }
        }
        return null;
    }

    public List<Professor> getProfessores() {
        return professores;
    }
}
