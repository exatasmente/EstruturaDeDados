import java.util.Scanner;
/**
 * Classe Pridutos
 * Trabalho 1 
 * Questão 1 
 * Disciplina :Estrutura de dados 
 * Curso: Ciência da Computação
 * @author Luiz Neto 	Matricula: 383842
 * @version 29/08/2016
 */
public class Produtos
{
    int id;
    int codigo;
    String nomeProduto;
    long quantidade;
    double precoProduto;
    String fabricante;
    String tipo;

    public Produtos(int id,int codigo,String nomeProduto,long quantidade,double precoProduto,String fabricante,String tipo)
    {
        this.id = id;
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.quantidade= quantidade;
        this.precoProduto = precoProduto;
        this.fabricante  = fabricante;
        this.tipo = tipo;
    }

    public void Imprimir()
    {
        System.out.printf("-------------------------------\n");
        System.out.printf("ID:                  %d\n",id);
        System.out.printf("CODIGO:              %d\n",codigo);
        System.out.printf("FABRICANTE:          %s\n",fabricante);
        System.out.printf("NOME:                %s\n",nomeProduto);
        System.out.printf("QUANTIDADE:          %d\n",quantidade);
        System.out.printf("PREÇO:               %.2f\n",precoProduto);
        System.out.printf("-------------------------------\n");

    }
    
    public void SetCod(int codigo)
    {
        this.codigo = codigo;
    }

    public int GetCod()
    {
       return codigo;
    }

    public void SetPreco(double precoProduto)
    {
        this.precoProduto = precoProduto;
    }
    
    public double GetPreco()
    {
        return precoProduto;
    }

    public void SetNome(String nomeProduto)
    {
        this.nomeProduto = nomeProduto;
    }

    public String GetNome()
    {
        return nomeProduto;
    }

    public void SetFab(String fabricante)
    {

        this.fabricante = fabricante;
    }
   
    public String GetFab()
    {
        return fabricante;
    }

    public void SetTipo(String tipo)
    {
       this.tipo = tipo;
    }
    
    public String GetTipo()
    {
        return tipo;
    }
 
    public void SetQt(long quantidade)
    {  

        this.quantidade = quantidade;
    }
    
    public long GetQt()
    {  
        return quantidade;
    }    
    
}
