package escolasaber;


import java.util.List;
interface ProfessorRepository {
    void cadastrarProfessor(Professor professor);
    Professor buscarProfessor(int registro);
    List<Professor> getProfessores(); // Adicionando o método getProfessores()
}

