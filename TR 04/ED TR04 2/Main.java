import java.util.Scanner;
/**
 * Classe Main.
 *
 * @author Luiz Vieira Gonzaga Neto
 * Matricula : 383842
 * @version 20/09/2016
 */


public class Main
{
    private static int r=0;
    private static int e= 0;
    private static PilhaAy< Object > P = new PilhaAy< Object >();
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args)
    {

         while(e !=-2){
        System.out.println("1->Adicionar\n2->Remover");
        System.out.println("3->Busca a Primeira ocorrência de um Elemento\n4->Busca a Última ocorrência de um Elemento\n5->Verifica se contem o Elemento\n6->imprime Todos");
        System.out.println("7->Verifica o Tamanho\n8->Revifica se está Vazio\n9->Verifica se a Posição é válida\n");
        r = input.nextInt();
        switch(r)
        {
            case 1:
                M1();
                break;
            case 2:
                M2();
                break;
            case 3:
                M3();
                break;
            case 4:
                M4();
                break;
            case 5:
                M5();
                break;
            case 6:
                M6();
                break;
            case 7:
                M7();
                break;
            case 8:
                M8();
                break;
            case 9:
                M9();
                break;

        }
    }
    }

    public static void M1()
    {
        Object M;
        System.out.println("Digite o Valor a ser armazenado");
        M = input.next();
        P.add(M);
        P.print(e);
        e++;

    }

    public static void M2()
    {
        Object R;
        R= P.remove();
        e--;
         System.out.println(R);
    }

    public static void M3()
    {
        Object M;
        int ind;
        System.out.println("Digite o Valor a ser Procurado");
        M = input.next();
        ind = P.indexOf(M);
        P.print(ind);
    }

    public static void M4()
    {
        Object M;
        int ind;
        System.out.println("Digite o Valor a ser Procurado");
        M = input.next();
        ind =P.lastIndexOf(M);
        P.print(ind);

    }

    public static void M5()
    {
        Object M;
        System.out.println("Digite o Valor a ser Procurado");
        M = input.next();
        System.out.println(P.contain(M));

    }

    public static void M6()
    {

        P.printAll();

    }

    public static void M7()
    {

        System.out.println(P.size());

    }

    public static void M8()
    {
        System.out.println(P.isEmpty());

    }

    public static void M9()
    {
        int p;
        System.out.println("Digite um Valor");
        p =input.nextInt();
        System.out.println(P.posicaoValida(p));

    }

}
