import java.util.Scanner;
import java.util.ArrayList;
/**
 * Classe Principal
 * Trabalho 1 
 * Questão 3
 * Disciplina :Estrutura de dados 
 * Curso: Ciência da Computação Ano: 2016.1 Semestre: 2°
 * @author Luiz
 * @version 29/08/2016
 */
public class Programa
{
    public static  ArrayList<Veiculos> V = new ArrayList<> ();
    public static  int r=0;
    public static  int v=0;
    public static  Scanner input = new Scanner (System.in);
    public static void main(String[] args)
    {  
        Menu();
    }
    public static void CadVeiculos()
    {
        int id;
        int ano;
        long capacidade;
        long  tempo;
        long  visitas;
        String  marca;
        String modelo;
        String tipoCarga;

        System.out.println("Digite o Modelo do Veículo");
        modelo = input.nextLine();
        System.out.println("Digite a Marca do Veículo");
        marca = input.nextLine();
        System.out.println("Digite o Tipo de Carga do Veículo");
        tipoCarga = input.nextLine();
        System.out.println("Digite o Ano do Veículo");
        ano = input.nextInt();       
        System.out.println("Digite a Capacidade de Carga do Veículo (em Quilos)");
        capacidade = input.nextLong();       
        System.out.println("Digite a Quantidade de Vistas Máximas do Veículo");
        visitas = input.nextLong();       
        System.out.println("Digite o Tempo Máximo de Entregas do Veículo(em Horas)");
        tempo = input.nextLong();    
        V.add(new Veiculos(v,ano,capacidade,tempo,visitas,marca,modelo,tipoCarga));
        V.get(v).Imprimir();
        v++;
        Menu(); 
    }
    public static void AltVeiculos()
    {
        int i;
        int a=0;
        for(i=0;i<V.size();i++)
        {
            V.get(i).Imprimir();
        }
        System.out.println("Digite o ID do Veículo Que Você Deseja Alterar");
        a = input.nextInt();
        V.get(a).Imprimir();
        System.out.println("O Que Você Deseja Alterar\n1->Carga\n2->Visitas\n3->Tempo");
        r = input.nextInt();
        switch(r)
        {
            case 1:
            V.get(a).SetCarga();
            break;
            case 2:
            V.get(a).SetVisitas();
            break;
            case 3:
            V.get(a).SetTempo();               
            break;                
            default:
            break;
        }
        V.get(a).Imprimir();
        Menu();
    }
    public static void Menu()
    {
        System.out.println("VEÍCULOS\n1->Cadastrar Veiculo\n2->Alterar Veículo\n3->Sair");
        r= input.nextInt();
        if(r==1)
            CadVeiculos();
        if(r==2)
            AltVeiculos();
        if(r==3)
            System.exit(0);    
    }
}      
