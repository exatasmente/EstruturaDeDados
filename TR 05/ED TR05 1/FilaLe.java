/**
 * Classe Fila.
 * 
 * @author Luiz Vieira Gonzaga Neto 
 * Matricula : 383842
 * @version 20/09/2016
 */
public class FilaLe<Item>
{
    private  ListaEncadeada < Object > Fila = new ListaEncadeada < Object >();
    private static int p=0;
    
    public void add(Object E)
    {
        Fila.addLast(E);
        this.p++;
        
    }
    
    public Item remove()
    {
        this.p--;
        return (Item) Fila.removeFirst();
    }
    
    public int indexOf(Item E)
    {
     
     
        return Fila.indexOf(E);
    }
    
    public int lastIndexOf(Item E)
    {
        return  Fila.lastIndexOf(E);
    }
    
    public boolean contain(Item E) 
    {
        return Fila.contain(E);
    }
    
    public void printAll()
    {
        Fila.printAll();        
    }
    public void print(int pos)
    {
        Fila.print(pos);        
    }
    
    
    public int size() 
    {
        return Fila.size();
    }
    
    public boolean isEmpty()
    {
        return Fila.isEmpty();
    }
    
    protected boolean posicaoValida(int pos)
    {
        return Fila.posicaoValida(pos);
    }

    
 
}
