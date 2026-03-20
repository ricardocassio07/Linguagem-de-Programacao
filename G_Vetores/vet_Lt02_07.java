/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_Vetores;

import java.util.Scanner;
import java.util.Arrays;

/*
    07. A partir da exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência a sua existência no vetor (utilizar pesquisa binária).
    Programador: Cássio
    Data: 20/03/2026
*/

public class vet_Lt02_07 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        int[] vet = new int[20];
        
        for (int i = 0; i < vet.length; i++)
        {
            System.out.println((i + 1) + "- Digite um numero inteiro:");
            vet[i] = scan.nextInt();
        }
        
        quicksort(vet, 0, (vet.length - 1));
        System.out.println(Arrays.toString(vet));
        
        System.out.println("Digite um numero inteiro qualquer:");
        boolean resultado = buscaBinaria(vet, scan.nextInt());
        if (resultado)
        {
            System.out.println("NUMERO ENCONTRADO!");
        }
        else
        {
            System.out.println("NUMERO NAO ENCONTRADO!");
        }
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
    
    public static boolean buscaBinaria(int[] v, int alvo)
    {
        int inicio = 0;
        int fim = (v.length - 1);
        int meio;
        while (inicio <= fim)
        {
            meio = ((inicio + fim)/2);
            if (v[meio] == alvo)
            {
                return true;
            }
            else if (v[meio] > alvo)
            {
                fim = (meio - 1);
            }
            else if (v[meio] < alvo)
            {
                inicio = (meio + 1);
            }
        }
        return false;
    }
}
