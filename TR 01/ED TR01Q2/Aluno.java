import javax.swing.JOptionPane;
/**
 * Escreva a descrição da classe aluno aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Aluno
{
    
    String nomeAluno; 
    String matricula;
    String turma;
    float prova1;
    float prova2;
    float prova3;
    float media;
    
    public Aluno(String nome, String mat, String tr,float p1, float p2, float p3)
    {
        this.nomeAluno = nome;
        this.matricula = mat;
        this.turma = tr;
        this.prova1 = p1;
        this.prova2 = p2;
        this.prova3 = p3;
        
    }
    
    public void SetMedia(float p1,float p2,float p3)
    {
       
         this.media =((p1+ p2+p3)/3);       
    }
    public String GetTurma()
    {
        return turma;
    }
    public float GetMedia()
    {
        return media;
    }
    public int Imprimir()
    {
       String message = String.format("Aluno Cadastrado!\nNOME: %s\nMATRICULA: %s\nTURMA: %s\nNOTA1: %.2f\nNOTA2: %.2f\nNOTA3: %.2f\nMÉDIA: %.2f ",nomeAluno,matricula,turma,prova1,prova2,prova3,media);
        JOptionPane.showMessageDialog(null, message);
        return 0;
    }
    
   
}
