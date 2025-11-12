/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoinf;

/**
 *
 * @author Caiol
 */
public class Turma {
    private String nomeCurso;
    private int qtdAulas;
    private Aluno listaAluno[];
    private int qtdAlunos;

    public Turma(String nomeCurso, int qtdAulas) {
        this.nomeCurso = nomeCurso;
        this.qtdAulas = qtdAulas;
        listaAluno = new Aluno[20];
        qtdAlunos = 0;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getQtdAulas() {
        return qtdAulas;
    }

    public void setQtdAulas(int qtdAulas) {
        this.qtdAulas = qtdAulas;
    }

    public Aluno[] getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(Aluno[] listaAluno) {
        this.listaAluno = listaAluno;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int count) {
        this.qtdAlunos = count;
    }
    
    public int buscarAluno(int codigo){
        for (int i = 0; i < qtdAlunos; i++) {
            if (listaAluno[i].getCodAluno() == codigo) {
                return i;
            }
        }
        return -1;
    }
    
    public void matricularAluno(Aluno al) throws Exception{
        if (qtdAlunos >= 20) {
            throw new Exception("Turma cheia.");
        }
        if (buscarAluno(al.getCodAluno()) != -1) {
            throw new Exception("Codigo de aluno repetido. aaa");
        }
        listaAluno[qtdAlunos] = al;
        qtdAlunos++;
    }

    public void registrarFalta(int codigo) throws Exception{
        int cod = buscarAluno(codigo);
        if(cod == -1){
            throw new Exception("Nao existe esse aluno");
        }
        listaAluno[cod].registrarFaltaAluno();
    }
    
    public void atribuirMedia(int codigo, double media) throws Exception{
        int cod = buscarAluno(codigo);
        if(cod == -1) {
            throw new Exception("Aluno nao existe");
        }
        
        if(media < 0 || media > 10){ 
            throw new Exception("Media tem que ser entre 0 e 10");            
        }
        
        listaAluno[cod].setMedia(media);
    
    }
 
    public void listarTodos(){
        System.out.println("\nCurso: " + nomeCurso);
        for(int i = 0 ; i < qtdAlunos ; i++){
            double freq = 100.0 * (qtdAulas - listaAluno[i].getQtdFaltas()) / qtdAulas;
            System.out.println("Codigo: " + listaAluno[i].getCodAluno() +
                               " | Nome: " + listaAluno[i].getNomeAluno() +
                               " | Media: " + listaAluno[i].getMedia() +
                               " | Faltas: " + listaAluno[i].getQtdFaltas() +
                               " | Frequencia: " + String.format("%.1f", freq) + "%");
        }
    }
    
    public void listarAprovados(){
        System.out.println("APROVADOS:\n");
        System.out.println("\nCurso: " + nomeCurso);
        for(int i = 0 ; i < qtdAlunos ; i++){
            double freq = 100.0 * (qtdAulas - listaAluno[i].getQtdFaltas()) / qtdAulas;
            if(listaAluno[i].getMedia() > 6 && freq >= 75){
                System.out.println("Codigo: " + listaAluno[i].getCodAluno() +
                               " | Nome: " + listaAluno[i].getNomeAluno() +
                               " | Media: " + listaAluno[i].getMedia() +
                               " | Faltas: " + listaAluno[i].getQtdFaltas() +
                               " | Frequencia: " + String.format("%.1f", freq) + "%");
            }
        }
    }
    
}
