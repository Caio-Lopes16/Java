/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoinf;

/**
 *
 * @author Caiol
 */
public class CursoInf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
try {
            Turma turma = new Turma("Informatica", 40);

            Aluno a1 = new Aluno(1, "Caio");
            Aluno a2 = new Aluno(2, "Lara");
            Aluno a3 = new Aluno(3, "Bruno");

            turma.matricularAluno(a1);
            turma.matricularAluno(a2);
            turma.matricularAluno(a3);

            turma.registrarFalta(1);
            turma.registrarFalta(2);
            
            turma.atribuirMedia(1, 8);
            turma.atribuirMedia(2, 5);
            turma.atribuirMedia(3, 9);

            turma.listarTodos();
            turma.listarAprovados();

            // Teste de erro
            turma.registrarFalta(6);
            turma.matricularAluno(new Aluno(1, "Repetido"));
            
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
