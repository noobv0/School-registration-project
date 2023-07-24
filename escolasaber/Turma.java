package escolasaber;

import java.util.ArrayList;
import java.util.List;
class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunosMatriculados;
    private int capacidadeMaxima;

    public Turma(Disciplina disciplina, Professor professor, int capacidadeMaxima) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosMatriculados = new ArrayList<>();
    }

    // Getters e setters
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
}

