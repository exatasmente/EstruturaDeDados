/**
 * Classe Pilha.
 * 
 * @author Luiz Vieira Gonzaga Neto 
 * Matricula : 383842
 * @version 20/09/2016
 */
public class PilhaLe<Item>
{
    private  ListaEncadeada < Object > Pilha = new ListaEncadeada < Object >();
    private static int p=0;
    
    public void add(Object E)
    {
        Pilha.addFirst(E);
        this.p++;
        
    }
    
    public Item remove()
    {
        this.p--;
        return (Item) Pilha.removeFirst();
    }
    
    public int indexOf(Item E)
    {
     
     
        return Pilha.indexOf(E);
    }
    
    public int lastIndexOf(Item E)
    {
        return  Pilha.lastIndexOf(E);
    }
    
    public boolean contain(Item E) 
    {
        return Pilha.contain(E);
    }
    
    public void printAll()
    {
        Pilha.printAll();        
    }
    public void print(int pos)
    {
        Pilha.print(pos);        
    }
    
    
    public int size() 
    {
        return Pilha.size();
    }
    
    public boolean isEmpty()
    {
        return Pilha.isEmpty();
    }
    
    protected boolean posicaoValida(int pos)
    {
        return Pilha.posicaoValida(pos);
    }

    
 
}
