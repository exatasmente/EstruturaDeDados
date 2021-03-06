
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * Classe Principal
 * Trabalho 1 
 * Questão 2
 * Disciplina :Estrutura de dados 
 * Curso: Ciência da Computação Ano: 2016.1 Semestre: 2°
 * 
 * @author Luiz
 * @version 29/08/2016
 */

public class Main
{
    public static  ArrayList<Aluno> A = new ArrayList<> (); //ArrayList do Objeto Aluno
    public static  ArrayList<Turma> T = new ArrayList<> (); //ArrayList do Objeto Aluno
    public static  Scanner input = new Scanner (System.in);
    public static  int r;
    public static  int a=0;
    public static  int t=0;

    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args)
    {  
        Menu();
    }

    /**
     * Method CadTurma
     *
     */
    public static void CadTurma()
    {
        String turma;
        input.nextLine();
        System.out.println("Digite da Turma");
        turma = input.nextLine();
        T.add(new Turma(turma,t));
        System.out.printf("Turma %s Cadastrada!\n",turma);
        t++;
        Menu();

    }

    /**
     * Method GetTurma
     *
     * @return r Valor de Retorno
     */
    public static int GetTurma()
    {
        int i;
        for(i=0;i<T.size();i++)
        {
            T.get(i).Imprimir();

        }
        System.out.printf("Digite o ID da Turma ");
        r= input.nextInt();
        return r;            
    }

    /**
     * Method QtTurmas
     *
     * @return 0 ou 1 valor de Retorno
     */
    public static int QtTurmas()
    {
        if(T.size()==0)
        {

            System.out.println("Não Existem Turmas Deseja Cadastar uma Turma\n1->Sim\n2->Não");
            r = input.nextInt();
            if(r==1)
            {
                return 1;
            }
        }
        return 0;
    }

    /**
     * Method CadAluno
     *
     */
    public static void CadAluno()
    {

        int tr; //Variavéis de Retorno
        //Vaiavéis Utilizadas pelo COnstrutor
        String nomeAluno; 
        String matricula;
        String turma;
        float prova1;
        float prova2;
        float prova3;
        float media;

        
        r = QtTurmas();        //Função para Buscar as Tumas Cadastradas 
        if(r==1)        
            CadTurma();        // Caso não existam turmas cadastradas a Função cadTurma será Chamada se o Ator Quiser Cadastrar 

        // Recebimento  de Dados    
        input.nextLine();
        System.out.println("Digite o Nome do Aluno");
        nomeAluno = input.nextLine();

        System.out.println("Digite a Matricula do Aluno");
        matricula = input.nextLine();

        tr = GetTurma();
        turma = T.get(tr).GetTurma();
        System.out.println("Digite A Nota 1");       
        prova1 = input.nextFloat();

        System.out.println("Digite a Nota 2");        
        prova2 = input.nextFloat();

        System.out.println("Digite a Nota 3");        
        prova3 = input.nextFloat();
        A.add(new Aluno(nomeAluno,matricula,turma,prova1,prova2,prova3)); //COnstrutor do Objeto aluno

        A.get(a).SetMedia(prova1,prova2,prova3);      //COnstrutor Média Aluno

        A.get(a).Imprimir(); //Imprimir o Aluno Cadastrado
        a++;
        Menu(); //Voltar par o Menu
    }

    /**
     * Method MediaTurma
     *
     */
    public static void MediaTurma()
    {

        //Variavéis da Função
        int i,tt;
        int count=0;
        float mt=0;
        float mg=0;
        r=QtTurmas();//Buscar turmas Cadastradas
        if(r==1)
            CadTurma(); // Caso não existam turmas cadastradas a Função cadTurma será Chamada se o ator Quiser Cadastrar 
        tt = GetTurma(); //Retorna a posição em que a turma se encontra no Vetor

        for(i=0;i<T.size();i++)
        {
            if(A.get(i).GetTurma() == T.get(tt).GetTurma()) //Comparação Aluno - Turma
            {
                count++; //contador de alunos na turma
                mt += A.get(i).GetMedia(); // Variavél mt irá se incrementar com os valores da média de cada aluno da turma escolhida 

            }

        }
        if(count==0) //Se não existir alunos cadastrados na Turma escolhida
        {

            System.out.println("Não existem alunos Cadastrados Deseja Cadastar um Aluno\n1->Sim\n2->Não");
            r = input.nextInt();
            if(r==1)
                CadAluno();
            if(r==2)
                Menu();
        }
        else //Se existir 
        {
            mg =mt/count; // A variavél mg vai receber o valor da média total dos alunos dividida pela quantidade de alunos na turma
            PrintMedia(count, mg ,T.get(tt).GetTurma());// Função para exibir a média da turma
            Menu();
        }
    } 

    /**
     * Method PrintMedia
     *
     * @param n A parametro
     * @param mg A parametro
     * @param Turma A parametro
     */
    public static void PrintMedia(int n, float mg , String Turma)
    {

        String message = String.format("Existem %d Alunos Na Turma %s\nA Média Geral da Turma %s é:\n\t%.2f ",n,Turma,Turma,mg);    
        JOptionPane.showMessageDialog(null, message);// A variavél mg vai receber o valor da média total dos alunos dividida pela quantidade de alunos na turma

   
    }

    /**
     * Method Menu
     *
     */
    public static void Menu()
    {

        System.out.println("O que Voce deseja fazer\n1->Cadastar Aluno\n2->Cadastrar Turma\n3->Ver Média de Turma\n4->Sair\n");
        r = input.nextInt();
        if(r==1)
        {
            CadAluno();
        }
        if(r==2)
        {
            CadTurma();
        }  
        if(r==3)
        {
            MediaTurma();
        }
        if(r==4)
        {
            System.exit(0);
        }

    }

}

       