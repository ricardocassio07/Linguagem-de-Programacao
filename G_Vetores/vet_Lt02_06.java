/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Vetores;

import java.util.Scanner;
import java.util.Arrays;

/*
    06. Criar e coletar um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
    Programador: Cássio
    Data: 20/03/2026
*/
public class vet_Lt02_06 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        int[] vet = new int[20];
        
        for (int i = 0; i < vet.length; i++)
        {
            System.out.println("Digite o " + (i + 1) + "º numero do vetor:");
            vet[i] = scan.nextInt();
        }
        
        quicksort(vet, 0, (vet.length - 1));
        
        System.out.println(Arrays.toString(vet));
    }
    
    public static void quicksort(int[] v, int inicio, int fim)
    {
        if (inicio < fim)
        {
            int pi = particao(v, inicio, fim);
            quicksort(v, inicio, (pi - 1));
            quicksort(v, (pi + 1), fim);
        }
    }
    
    public static int particao(int[] v, int inicio, int fim)
    {
        int pivo = v[fim];
        int j = (inicio - 1);
        int temp;
        for (int i = inicio; i < fim; i++)
        {
            if (v[i] < pivo)
            {
                j++;
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
        temp = v[fim];
        v[fim] = v[(j + 1)];
        v[(j + 1)] = temp;
        return (j + 1);
    }
}
