import java.util.Scanner;
public class Main 
{
    private static int r=0;
    private static int e=0;
    private static Vetor L = new Vetor();
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) 
    {
        Menu();
    }

    public static void M1()
    {

        int q;
        System.out.println("Digite a Quabtidade de Elementos ser armazenada");
        q = input.nextInt();
        input.nextLine();
        Object[] M = new Object[q];
        for(int i =0; i<q;i++)
        {
            System.out.println("Digite o Valor a ser armazenado");
         
            M[i] = input.nextLine();
            e++;
        }
        L.addRange(q,M);   
        Menu(); 
    }

    public static void M2()
    {
        Object M;
        System.out.println("Digite o Valor a ser armazenado");
        input.nextLine();
        M = input.nextLine();
        L.add(M);
        L.print(e);
        e++;
        Menu(); 
    }

    public static void M3()
    {
        int p;
        Object M;
        System.out.println("Digite o Valor a ser armazenado");
        input.nextLine();
        M = input.nextLine();

        System.out.println("Digite a Posição");
        p =input.nextInt();
        L.add(p,M);
        L.print(p);
        e++;
        Menu(); 
    }

    public static void M4()
    {
        Object G = new Object();
        int p;
        System.out.println("Digite a Posição");
        p =input.nextInt();
        G=L.get(p);
        System.out.println(G);
        Menu();
    }

    public static void M5()
    {
        int p;
        L.printAll();
        System.out.println("Digite a Posição");
        p =input.nextInt();
        Object G = new Object();

        G = L.remove(p);
        e--;
        Menu();
    }

    public static void M6()
    {
        Object M;
        System.out.println("Digite o Valor a Excluido");
        input.nextLine();
        M = input.nextLine();
        System.out.println(L.remove(M));
        e--;
        Menu();
    }

    public static void M7()
    {
        int i,f;
        System.out.println("Digite o Valor de Inicio");
        i = input.nextInt();
        System.out.println("Digite o Valor de Fim");
        f = input.nextInt();
        L.removeRange(i,f);
        e -=  i+f;
        Menu();
    }

    public static void M8()
    {
        L.clear();
        e=0;
        Menu();
    }

    public static void M9()
    {
        if(L.size()==0)
            Menu();
        int a=0;
        Object M;
        int i;
        L.printAll();
        System.out.println("Digite o ID do Objeto Que Você Deseja Alterar");
        a = input.nextInt();
        if(!L.print(a))
            Menu();
        System.out.println("Digite o Valor a ser armazenado");
        input.nextLine();
        M = input.nextLine();

        L.set(a,M);
        L.print(a);
        System.out.println("Objeto  Alterado!");
        Menu();
    }

    public static void M10()
    {
        Object M;
        System.out.println("Digite o Valor a ser Procurado");
        input.nextLine();
        M = input.nextLine();

        System.out.println("A Posição do elemento é : "+L.lastIndexOf(M)+"\n\n");
        Menu();
    }

    public static void M11()
    {
        Object M;
        System.out.println("Digite o Valor a ser Procurado");
        input.nextLine();
        M = input.nextLine();

        System.out.println("A Posição do elemento é : "+L.indexOf(M)+"\n\n");
        Menu();
    }

    public static void M12()
    {
        Object M;
        System.out.println("Digite o Valor a ser Procurado");
        input.nextLine();
        M = input.nextLine();
        System.out.println(L.contains(M));
        Menu();
    }    

    public static void M13()
    {
        System.out.println(L.size());
        Menu();
    }

    public static void M16()
    {
        L.printAll();
        Menu();
    }

    public static void M17()
    {
        int p;
        System.out.println("Digite o Valor a ser impresso ");
        p =input.nextInt();

        L.print(p);
        Menu();
    }

    public static void M18()
    {
        int i,f;
        System.out.println("Digite o Valor do Item 1");
        i = input.nextInt();
        System.out.println("Digite o Valor do Item 2");
        f = input.nextInt();
        L.cPos(i,f);

        Menu();
    }

    public static void M19()
    {
        System.out.println(L.isEmpty());
        Menu();
    }

    public static void M20()
    {
        int p;
        System.out.println("Digite um Valor");
        p =input.nextInt();
        System.out.println(L.posicaoValida(p));
        Menu();
    }

    public static void Menu() 
    { 
        System.out.println("1-> Adicionar uma Quantidade Especifica de Elementos\n2->Adicionar no Fim\n3->Adicionar em uma posição \n4->Recuperar \n5->Remover por Referência\n6->Remover Por Elemento\n7->Remover Uma Quantidade Específica\n");
        System.out.println("8->Limpa O Vetor\n9->Altera um Elemento apartir de sua Posição\n10->Procuar a ultima ocorrência de um Objeto Específico\n11->Procuar a primeira ocorrência de um Objeto Específico\n12->Procura um Objeto especifico\n13->Quantidade de elementos no Array\n");
        System.out.println("14->Exibe todos o Elementos\n15->Exibe um elemento especifico\n16->Troca a Posição do 2 elementos\n17->Revifica se o Array está Vazio\n18->Verifica se a Posição é válida\n");
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
            case 10:
                M10();
                break;                
            case 11:
                M11();
                break;                
            case 12:
                M12();
                break;                
            case 13:
                M13();
                break;                
            case 14:
                M16();
                break;                
            case 15:
                M17();
                break;                
            case 16:
                M18();
                break;                
            case 17:
                M19();
                break;                
            case 18:
                M20();
                break;
        }
    }
}
