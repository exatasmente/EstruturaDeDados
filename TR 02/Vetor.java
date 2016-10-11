public class Vetor
{ 
    private static int MAX = 2;
    private static int e=0;
    private Object[] E;

    //1 - Construtor
    public Vetor() {
        this.E = new Object[MAX];
    }

    
    public boolean addRange(int q,Object[] E) 
    {
       
        for(int i =0; i<q;i++)
        {
         this.E[this.e] = E[i];
         this.e++;
         if(this.e==Vetor.MAX)
            ArrayUp();
        }

        if(this.E[this.e-1]!=null)
            return true;
        return false;
    }
    
    //2 - Adicionar no Fim da Lista
    public boolean add(Object E) 
    {
        this.E[this.e] = E;
        this.e++;
        if(this.e==Vetor.MAX)
            ArrayUp();

        if(this.E[this.e-1]!=null)
            return true;
        return false;
    }

    //3 - Adicionar em Uma Posição determinada da Lista
    public boolean add(int p,Object E)
    {
        if (!this.posicaoValida(p)) 
        {
            throw new IllegalArgumentException("Posição não existe");
        }   
        for (int i = this.e-1; i >= p; i-=1) 
        {
            if(this.E[i]==null)
                break;
            this.E[i+1] = this.E[i];
        }

        this.E[p] = E;
        this.e++;
        if(this.e==Vetor.MAX)
           ArrayUp();
        return true;
    }

    //4 - Recuperar um Elemento
    public Object get(int p) 
    {
        if (!this.posicaoValida(p)) 
                throw new IllegalArgumentException("Posição não existe");

        return this.E[p];
    }

    //5 - Remover um Elemento apartir de sua Posição
    public Object remove(int p) 
    {
        if (!this.posicaoValida(p)) 
        {
               throw new IllegalArgumentException("Posição não existe");
        }

        Object aux = new Object();
        aux = this.E[p];    

        for (int i = p; i < this.size() - 1; i++) 
        { 
            this.E[i] = this.E[i + 1];
        }

        this.e--;

        if(this.e==Vetor.MAX/2)
            ArrayDown();

        return aux;
    }

    //6 - Remover um elemento específico
    public boolean remove(Object E)
    {
        int r=0;

        r =this.indexOf(E);

        if(r!=-1)
        {
            for (int i = r; i < this.size()- 1; i++) 
            { 
                this.E[i] = this.E[i + 1];
            }

            this.e--;

            if(this.e==Vetor.MAX/2)
                ArrayDown();

            return true;
        }

        return false;
    }

    //7 - Remover Uma Quantidade Específica de Elementos a Partir de sua posição de inicio de fim 
    protected boolean removeRange(int inicio,int fim)
    {
        if (!this.posicaoValida(inicio) || !this.posicaoValida(fim)) 
        {
             throw new IllegalArgumentException("Posição não existe");
        }
        for(int i=fim;i>=inicio;i--)
        {

            this.E[i] = this.E[i+1];
            this.e--;
            if(this.e==Vetor.MAX/2)
                   ArrayDown();
        }
        this.E[this.e]=null;

       
        return true; 
    }

    // 8 - Limpa O Vetor
    public void clear()
    {
        for (int i = 0; i < this.size(); i++) 
        { 
            this.E[i] = null;
        } 
        this.e=0;
    }
    // 9 - Altera um Elemento apartir de sua Posição
    public boolean set(int p,Object E) 
    {
        if (!this.posicaoValida(p)) 
        {
               throw new IllegalArgumentException("Posição não existe");
               
        }
        this.E[p] = E;
        return true;
    }

    //10 - Procuar a ultima ocorrência de um Objeto Específico
    public int lastIndexOf(Object E)
    {        
        int i, index = -1;

        for (i = 0; i < this.size(); i++) 
        {
            if (this.E[i].equals(E)) 
            {
                index =i;
            }
        }

        return index;
    }
    //11 - Procuar a primeira ocorrência de um Objeto Específico
    public int indexOf(Object E)
    {
        int i, index = -1;

        for (i = 0; i < this.size(); i++) 
        {
            if (this.E[i].equals(E)) 
            {
                return i;
            }
        }

        return index;
    }

    //12 - Procura um Objeto especifico e Retorna True para a Primeira Ocorrência
    public boolean contains(Object E) 
    {

        for (int i = 0; i < this.size(); i++) 
        {
            if (this.E[i].equals(E)) 
            {
                return true;
            }
        }
        return false;
    }

    //13 - Retorna a quantidade de elementos no Array
    public int size() 
    {
        return this.e;
    }

    //14 - Aumenta a Capacidade do Array
    private void ArrayUp() 
    {
        Object[] novoArray = new Object[MAX * 2];

        System.arraycopy(this.E, 0, novoArray, 0, this.size());

        MAX=MAX*2;

        this.E = novoArray;
        System.out.println("A Capacidade do Array foi Incrementada Para: "+MAX+"\n\n");
    }

    //15 - Diminui a Capacidade do Array
    private void ArrayDown() 
    {
        int max =(int) ((int) MAX*0.75);

        Object[] novoArray = new Object[max];

        System.arraycopy(this.E, 0, novoArray, 0, this.size());

        MAX=max;
        
        this.E = novoArray;
        System.out.println("A Capacidade do Array foi Decrementada Para: "+MAX+"\n\n");
    }

    //16 - Exibe todos o Elementos do Array Para o Usuário
    public void printAll()
    {
        int i;
        for(i =0; i<this.size();i++)
        {
            System.out.println("ID:"+i+"\nObjeto: "+this.E[i]+"\n\n");   
        }
    }
    //17 - Exibe um elemento especifico do Array Para o Usuário
    public boolean print(int ind)
    {
        if (!this.posicaoValida(ind)) {
               throw new IllegalArgumentException("Posição não existe");
        }
        System.out.println("ID:"+ind+"\nObjeto: "+this.E[ind]+"\n\n");      
        return true;
    }

    //18 - Troca a Posição do 2 elementos do Array
    public boolean cPos(int p1,int p2) 
    {
        if (!this.posicaoValida(p1) || !this.posicaoValida(p2)) 
        {
            throw new IllegalArgumentException("Posição não existe");
        }
        Object novoArray = new Object();

        novoArray = this.E[p1];

        this.E[p1] = this.E[p2];

        this.E[p2] = novoArray;
        return true;
    }

    //19 - Revifica se o Array está Vazio
    public boolean isEmpty()
    {
        if(this.E[0]==null)
            return true;

        return false;
    }

    //20 - Verifica se a Posição é válida
    protected boolean posicaoValida(int p) 
    {
        return p < this.size() && p >= 0;
    }
    
    public int cap()
    {
        return MAX;
    }

}