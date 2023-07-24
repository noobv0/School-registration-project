package escolasaber;

import java.util.List;
interface AlunoRepository {
    void cadastrarAluno(Aluno aluno);
    Aluno buscarAluno(int matricula);
    List<Aluno> getAlunos(); // Adicionando o método getAlunos()
}