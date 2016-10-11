
/**
 * Trabalho 06 1 Estrutura de dados
 * 
 * @author Luiz
 * @version 09/10/2016
 */
public class Main
{
    public static PilhaAy <String> pilha = new PilhaAy<String>();
    public static void main(String[] args)
    {
        String teste = "ESSE É O TESTE PARA INVERTER STRING USANDO PILHA DE ARRAY EM JAVA";
        String[] a = teste.split(" ");

        for(int i=a.length-1; i >= 0; i--)
        {
            pilha.add(a[i]);

        }
        System.out.println("++++++IMPRIMINDO+++++++++\n");
        pilha.printAll();
        System.out.println("\n\n+++++++REMOVENDO+++++++++\n");
        for(int i =0;i < a.length;i++)
        {
            System.out.print(pilha.remove()+" ");
        }
        System.out.println("\n\n+++++++++FIM++++++++++++++\n\n");
    }
}
