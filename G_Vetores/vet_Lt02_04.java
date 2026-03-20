/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Vetores;

import java.util.Scanner;

/*
    04. Criar e coletar em um vetor [30] real e calcular e exibir:
        A) A média do grupo;
        B) A quantidade de notas acima da média do grupo;
        C) As posições dos valores abaixo da média do grupo.
    Programador: Cássio
    Data: 19/03/2026
*/

public class vet_Lt02_04 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double nota = 0;
        double[] notas = new double[30];
        for (int i = 0; i < 30; i++)
        {
            do
            {
                System.out.println("Digite a " + (i + 1) + "º nota do grupo:");
                nota = scan.nextDouble();
            }
            while((nota < 0) || (nota > 10));
            notas[i] = nota;
        }
        double media = media(notas);
        int qtdeNotasBoas = calcularNotasBoas(notas, media);
        System.out.println("MEDIA = " + media);
        System.out.println("Quantidade das notas superiores a media: " + qtdeNotasBoas);
        posicoesNotasInferiores(notas, media);
    }
    
    public static double media(double[] valores)
    {
        double soma = 0;
        for (int i = 0; i < 30; i++)
        {
            soma += valores[i];
        }
        return soma/30.0;
    }
    
    public static int calcularNotasBoas(double[] notas, double media)
    {
        int qtde = 0;
        for (int i = 0; i < 30; i++)
        {
            if (notas[i] > media)
            {
                qtde++;
            }
        }
        return qtde;
    }
    
    public static void posicoesNotasInferiores(double[] notas, double media)
    {
        System.out.print("Posicoes das notas inferiores a media: [");
        for (int i = 0; i < 30; i++)
        {
            if (notas[i] < media)
            {
                System.out.print(i + ", ");
            }
        }
        System.out.println("]");
    }
}
