
/**
 * Classe Turma
 * Classe usada para armazenar somente as turmas
 * 
 * @author Luiz 
 * @version 28/09/2016
 */

public class Turma
{
   int id;
   String turma;
   
    /**
     * COnstrutor para objetos da classe Turma
     */
    public Turma(String tr, int id)
    {
        this.turma= tr;
        this.id = id;
    }   
    public void Imprimir()
    {
       
        System.out.printf("ID:                  %d\n",id);
        System.out.printf("TURMA:               %s\n",turma);
       

    }
    public String GetTurma()
    {
        return turma;
    }
   
}
