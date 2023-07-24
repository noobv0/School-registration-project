package escolasaber;

class SistemaAcademico {
    private AlunoRepository alunoRepository;
    private ProfessorRepository professorRepository;
    private DisciplinaRepository disciplinaRepository;
    private TurmaRepository turmaRepository;

    public SistemaAcademico() {
        this.alunoRepository = new AlunoRepositoryImpl();
        this.professorRepository = new ProfessorRepositoryImpl();
        this.disciplinaRepository = new DisciplinaRepositoryImpl();
        this.turmaRepository = new TurmaRepositoryImpl();
    }

    public void cadastrarAluno(String nome, int matricula) {
        Aluno aluno = new Aluno(nome, matricula);
        alunoRepository.cadastrarAluno(aluno);
    }

    public void cadastrarProfessor(String nome, int registro) {
        Professor professor = new Professor(nome, registro);
        professorRepository.cadastrarProfessor(professor);
    }

    public void cadastrarDisciplina(String nome, String codigo, int cargaHoraria) {
        Disciplina disciplina = new Disciplina(nome, codigo, cargaHoraria);
        disciplinaRepository.cadastrarDisciplina(disciplina);
    }

    public void cadastrarTurma(String codigoDisciplina, int registroProfessor, int capacidadeMaxima) {
        Disciplina disciplina = disciplinaRepository.buscarDisciplina(codigoDisciplina);
        Professor professor = professorRepository.buscarProfessor(registroProfessor);
        Turma turma = new Turma(disciplina, professor, capacidadeMaxima);
        turmaRepository.cadastrarTurma(turma);
    }

    public void realizarMatricula(int matriculaAluno, String codigoDisciplina) {
        Aluno aluno = alunoRepository.buscarAluno(matriculaAluno);
        Turma turma = turmaRepository.buscarTurma(codigoDisciplina);

        if (aluno != null && turma != null) {
            if (turma.getAlunosMatriculados().size() < turma.getCapacidadeMaxima()) {
                turma.getAlunosMatriculados().add(aluno);
                aluno.getDisciplinasMatriculadas().add(turma.getDisciplina());
                System.out.println("Matrícula realizada com sucesso!");
            } else {
                System.out.println("Não há vagas disponíveis nesta turma.");
            }
        } else {
            System.out.println("Aluno ou turma não encontrados.");
        }
    }

    public void consultarInformacoes() {
        // Consultar informações sobre alunos
        System.out.println("Alunos cadastrados:");
        for (Aluno aluno : alunoRepository.getAlunos()) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Disciplinas matriculadas:");
            for (Disciplina disciplina : aluno.getDisciplinasMatriculadas()) {
                System.out.println("  - " + disciplina.getNome());
            }
            System.out.println("--------------------------");
        }

        // Consultar informações sobre professores
        System.out.println("Professores cadastrados:");
        for (Professor professor : professorRepository.getProfessores()) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Registro: " + professor.getRegistro());
            System.out.println("Disciplinas lecionadas:");
            for (Disciplina disciplina : professor.getDisciplinasLecionadas()) {
                System.out.println("  - " + disciplina.getNome());
            }
            System.out.println("--------------------------");
        }

        // Consultar informações sobre disciplinas
        System.out.println("Disciplinas cadastradas:");
        for (Disciplina disciplina : disciplinaRepository.getDisciplinas()) {
            System.out.println("Nome: " + disciplina.getNome());
            System.out.println("Código: " + disciplina.getCodigo());
            System.out.println("Carga Horária: " + disciplina.getCargaHoraria());
            System.out.println("--------------------------");
        }

        // Consultar informações sobre turmas
        System.out.println("Turmas cadastradas:");
        for (Turma turma : turmaRepository.getTurmas()) {
            System.out.println("Disciplina: " + turma.getDisciplina().getNome());
            System.out.println("Professor: " + turma.getProfessor().getNome());
            System.out.println("Capacidade Máxima: " + turma.getCapacidadeMaxima());
            System.out.println("Alunos Matriculados:");
            for (Aluno aluno : turma.getAlunosMatriculados()) {
                System.out.println("  - " + aluno.getNome());
            }
            System.out.println("--------------------------");
        }
    }

}