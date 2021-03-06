/**
 * Classe Veiculos 
 * @author Luiz 
 * @version 28/09/2016
 */
import java.util.Scanner;
public class Veiculos
{
    public static Scanner input = new Scanner (System.in);
    int id;
    int ano;
    long capacidade;
    long  tempo;
    long  visitas;
    String  marca;
    String modelo;
    String tipoCarga;
    
    public Veiculos(int iD,int year,long cap,long time,long vis,String m,String mod, String carga)
    {
        this.id = iD;
        this.ano = year;
        this.capacidade = cap;
        this.tempo = time;
        this.visitas = vis;
        this.marca = m;
        this.modelo = mod;
        this.tipoCarga = carga;        
    }
    
    public void Imprimir()
    {
        System.out.printf("-------------------------------\n");
        System.out.printf("ID:                      %d\n",id);
        System.out.printf("MODELO:                  %s\n",modelo);
        System.out.printf("MARCA:                   %s\n",marca);
        System.out.printf("ANO:                     %d\n",ano);
        System.out.printf("VISITAS:                 %d\n",visitas);
        System.out.printf("TEMPO LIMITE:            %dHs\n",tempo);
        System.out.printf("CARGA:                   %s\n",tipoCarga);
        System.out.printf("CAPACIDADE:              %dKg\n",capacidade);
        System.out.printf("-------------------------------\n");
    }
    
    public void SetCarga()
    {
        System.out.println("Digite o Novo Tipo de Carga do Veículo");
        this.tipoCarga = input.nextLine();
    }
    
    public void SetVisitas()
    {
    	System.out.println("Digite a Nova Quantidade de Visitas do Veículo");
        this.visitas = input.nextLong();
    }
    
    public void SetTempo()
    {
        System.out.println("Digite o novo Tempo Máximo de Entraga do Veículo");
        this.tempo = input.nextLong();
    }
}
