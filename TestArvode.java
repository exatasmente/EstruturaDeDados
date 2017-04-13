
package Binaria;

/**
 *
 * @author Luiz Neto
 */
public class TestArvode {
    
     public static void main(String[] args)
    {
        Arvore test = new Arvore();
 
        
        test.inserir(50);
        test.inserir(30);
        test.inserir(20);
        test.inserir(40);
        test.inserir(70);
        test.inserir(60);
        test.inserir(80);
 
        System.out.println("Percorrendo em ordem transversal");
        test.percorrer();
 
        System.out.println("\nRemover o 20");
        test.removerChave(20);
        System.out.println("Percorrendo a Árvore modificada");
        System.out.println(test.busca(40));
 
    
    }
}

 