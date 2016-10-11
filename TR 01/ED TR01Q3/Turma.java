/**
 * Classe Principal
 * Trabalho 1 
 * Questão 2
* Disciplina :Estrutura de dados 
 * Curso: Ciência da Computação
 * @author Luiz Neto 	Matricula: 383842
 * @version 29/08/2016
 */
public class Turma
{
   int id;
   String turma;
   
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
