package escolasaber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaAcademico sistema = new SistemaAcademico();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Cadastrar Disciplina");
            System.out.println("4. Cadastrar Turma");
            System.out.println("5. Realizar Matrícula");
            System.out.println("6. Consultar Informações");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Digite o número de matrícula do aluno: ");
                    int matriculaAluno = scanner.nextInt();
                    scanner.nextLine();
                    sistema.cadastrarAluno(nomeAluno, matriculaAluno);
                }
                case 2 -> {
                    System.out.print("Digite o nome do professor: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("Digite o número de registro do professor: ");
                    int registroProfessor = scanner.nextInt();
                    scanner.nextLine();
                    sistema.cadastrarProfessor(nomeProfessor, registroProfessor);
                }
                case 3 -> {
                    System.out.print("Digite o nome da disciplina: ");
                    String nomeDisciplina = scanner.nextLine();
                    System.out.print("Digite o código da disciplina: ");
                    String codigoDisciplina = scanner.nextLine();
                    System.out.print("Digite a carga horária da disciplina: ");
                    int cargaHorariaDisciplina = scanner.nextInt();
                    scanner.nextLine();
                    sistema.cadastrarDisciplina(nomeDisciplina, codigoDisciplina, cargaHorariaDisciplina);
                }
                case 4 -> {
                    System.out.print("Digite o código da disciplina da turma: ");
                    String codigoTurma = scanner.nextLine();
                    System.out.print("Digite o número de registro do professor da turma: ");
                    int registroProfessorTurma = scanner.nextInt();
                    System.out.print("Digite a capacidade máxima da turma: ");
                    int capacidadeTurma = scanner.nextInt();
                    scanner.nextLine();
                    sistema.cadastrarTurma(codigoTurma, registroProfessorTurma, capacidadeTurma);
                }
                case 5 -> {
                    System.out.print("Digite o número de matrícula do aluno: ");
                    int matriculaMatricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o código da disciplina para matrícula: ");
                    String codigoMatricula = scanner.nextLine();
                    sistema.realizarMatricula(matriculaMatricula, codigoMatricula);
                }
                case 6 -> sistema.consultarInformacoes();
                case 0 -> continuar = false;
                default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

            System.out.println();
        }

        scanner.close();
    }
}

