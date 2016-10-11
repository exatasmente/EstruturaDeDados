
/**
 * Classe Celula.
 * 
 * @author Luiz Vieira Gonzaga Neto 
 * Matricula : 383842
 * @version 10/09/2016
 */

class Celula<Item> 
{

    protected Celula prox;

    protected Item E;

    public Celula() 
    {
        this.prox = null;
        this.E = null;
    }

    public Celula(Celula prox, Item E) 
    {
        this.prox = prox;
        this.E = E;
    }

    public Celula(Item E) 
    {
        this.E = E;
    }

    public void setP(Celula prox) 
    {
        this.prox = prox;
    }

    public Celula getP() 
    {
        return prox;
    }
  
    public Item getE() 
    {
        return E;
    }
      
}