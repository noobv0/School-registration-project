package escolasaber;

import java.util.List;
interface TurmaRepository {
    void cadastrarTurma(Turma turma);
    Turma buscarTurma(String codigo);
    List<Turma> getTurmas(); // Adicionando o método getTurmas()
}
