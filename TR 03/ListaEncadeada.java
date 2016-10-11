/**
 * classe Lista Encadeada.
 * 
 * @author Luiz Veiera Gonzaga Neto 
 * Matricula : 383842
 * @version 10/09/2016
 */
class ListaEncadeada<Item> 
{

    private Celula Primeira  = new Celula();
    private Celula Ultima = new Celula();  

    private  int e= 0;
  
    // 1 - Adiciona  no Começo
   
    public void addFirst(Item E) 
    {   
        
       Celula Nova = new Celula(this.Primeira.prox,E);
       this.Primeira.prox= Nova;
       this.Primeira.E = null;

       
       if(this.e == 0)
       {
           // caso da lista vazia
           this.Ultima = this.Primeira.prox;
        }
        this.e++;
    }
       
    // 2 - Adiciona no Fim
    public void addLast(Item E) 
    {
        if (this.e == 0) 
        {
            this.addFirst(E);
        } 
        else 
        {
            Celula nova = new Celula(E);
            this.Ultima.setP(nova);
            this.Ultima = nova;
            this.e++;
        }
    }
  
    // 3 - Pega por posição
    private Celula pegaCelula(int pos) 
    {
        if(!this.posicaoValida(pos))
        {
            throw new IllegalArgumentException("Posição não existe");
        }
        
        Celula Atual = Primeira.prox;
        for (int i = 0; i < pos; i++) 
        {
            Atual = Atual.getP();
        }
        return Atual;
    }
    
    // 4 - Adiciona em qualquer posição válida da lista
    public void add(int pos, Item E) 
    {
        if (!this.posicaoValida(pos)) 
        {
            throw new IllegalArgumentException("Posição não existe");
        }
        
        if(pos == 0)
        { // No começo.
            this.addFirst(E);
        } 
        else 
            if(pos == this.e)
            { // No fim.
                this.addLast(E);
            } 
        else
        {
            Celula Atual = this.pegaCelula(pos - 1);
            Celula Nova = new Celula(Atual.getP(), E);
            Atual.setP(Nova);
            this.e++;
        }
    }
    
    // 5- Remove o Primeiro Elemento
    public Item removeFirst() 
    {
        if (!this.posicaoValida(0)) 
        {
            throw new IllegalArgumentException("Posição não existe");
        }
        Item R = (Item) this.Primeira.prox.getE();
        this.Primeira.prox = this.Primeira.prox.prox;
        this.e--;
  
        if (this.e == 0) 
        {
            this.Ultima = null;
        }
        return R;
    }
    
    // 6 - Remove o ultimo Elemento
    public Item removeLast() 
    {
        Item RL =(Item) this.Ultima.getE();
        if (!this.posicaoValida(this.e - 1)) 
        {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (this.e == 1) 
        {
            this.removeFirst();
        } 
        else
        {
            Celula Penultima = this.pegaCelula(this.e-1);
            Penultima.setP(null);
            this.Ultima = Penultima;
            this.e--;
        }
        return RL;
    }
    
    // 7 - Remove qualquer Elemento da lista
    public void remove(int pos) 
    {
        if (!this.posicaoValida(pos)) 
        {
            throw new IllegalArgumentException("Posição não existe");
        }
        
        if (pos == 0) 
        {
            this.removeFirst();
        } 
        else
        if (pos == this.e - 1) 
        {
            this.removeLast();
        }
        else
        {
            Celula Anterior = this.pegaCelula(pos - 1);
            Celula Atual = Anterior.getP();
            Celula Proxima = Atual.getP();
            
            Anterior.setP(Proxima);
            this.e--;
        }
    }
    
    //8 - Remove por elemento na primeira ocorrência
    public boolean remove(Item E)
    {
        int r=0;

        r =this.indexOf(E);
        if(r==0)
        {
            this.removeFirst();
        }
        else
        {
            if(r!=0)
            {
                Celula Anterior = this.pegaCelula(r-1);
                Celula Atual = Anterior.getP();
                Celula Proxima = Atual.getP();
                
                Anterior.setP(Proxima);
                this.e--;
                
                return true;
            }
        }

        return false;
    }
    
    //9 - Remove por elemento na Ultima ocorrência
    public boolean removeL(Item E)
    {
        int r=0;

        r =this.lastIndexOf(E);
        if(r==this.size()-1)
        {
            this.removeLast();
        }
        else
        {
            if(r!=0)
            {
                Celula Anterior = this.pegaCelula(r);
                Celula Atual = Anterior.getP();
                Celula Proxima = Atual.getP();
                
                Anterior.setP(Proxima);
                this.e--;
                
                return true;
            }
        }

        return false;
    }

    
    //10-Busca a Primeira ocorrência de um Elemento
    public int indexOf(Item E)
    {
        int i=0;

       Celula Atual = this.Primeira.prox;
        
        while (Atual != null) 
        {
            if (Atual.getE().equals(E)) 
            {
               
                return i;
            }
            Atual = Atual.getP();
            i++;
        }
        return 0;
    }
     
    //11-Busca a Ultima ocorrência de um Elemento
    public int lastIndexOf(Item E)
    {
        int i=0;

       Celula Atual = this.Primeira.prox;
        
        while (Atual != null) 
        {
            if (Atual.getE().equals(E)) 
            {
                i++;
            }
            Atual = Atual.getP();
            
        }
        return i;
    }
    
    // 12 - Verifica se contem o E na Lista
    public boolean contain(Item E) 
    {
        Celula Atual = this.Primeira.prox;
        
        while (Atual != null) 
        {
            if (Atual.getE().equals(E)) 
            {
                return true;
            }
            Atual = Atual.getP();
        }
        return false;
    }
    
    //13 - imprime um único elemento
    public boolean print(int pos)
    {
        if (!this.posicaoValida(pos)) 
        {
            throw new IllegalArgumentException("Posição não existe");
        }
        System.out.println("ID:"+pos+"\nObjeto: "+pegaCelula(pos).getE()+"\n\n");      
        return true;
    }
    
    //14 - Imprime todos os elementos
    public void printAll()
    {
        if(this.e == 0)
        {
            System.out.println("Não existem elementos");
        }
        else
        {
            Celula Atual = Primeira.prox;
            for (int i = 0; i < this.size(); i++) 
            {
                
                System.out.println("ID:"+i+"\nObjeto: "+Atual.getE()+"\n\n");
                
                Atual = Atual.getP();
            }
            
        }
    }
    
    //  15 - Verifica o Tamanho da Lista
    public int size() 
    {
        return this.e;
    }

    
    //17 - Revifica se o Array está Vazio
    public boolean isEmpty()
    {
        if(this.e==0)
           return true;

        return false;
    }
    // 18 - Verifica se a Posição é válida
    protected boolean posicaoValida(int pos)
    {
        return pos>= 0 && pos< this.e;
    }
    
   

}
