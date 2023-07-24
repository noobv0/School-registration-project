package escolasaber;

import java.util.List;
interface DisciplinaRepository {
    void cadastrarDisciplina(Disciplina disciplina);
    Disciplina buscarDisciplina(String codigo);
    List<Disciplina> getDisciplinas(); // Adicionando o método getDisciplinas()
}