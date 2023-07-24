package escolasaber;

import java.util.ArrayList;
import java.util.List;
class Professor {
    private String nome;
    private int registro;
    private List<Disciplina> disciplinasLecionadas;

    public Professor(String nome, int registro) {
        this.nome = nome;
        this.registro = registro;
        this.disciplinasLecionadas = new ArrayList<>();
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public List<Disciplina> getDisciplinasLecionadas() {
        return disciplinasLecionadas;
    }

    public void setDisciplinasLecionadas(List<Disciplina> disciplinasLecionadas) {
        this.disciplinasLecionadas = disciplinasLecionadas;
    }
}