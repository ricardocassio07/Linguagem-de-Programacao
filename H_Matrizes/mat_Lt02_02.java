/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package H_Matrizes;

import java.util.Scanner;
import java.util.Arrays;

/*
    02. Criar e carregar uma matriz[4][4] com valores aleatórios sendo que a diagonal principal terá seus dados
    carregados no programa segundo:
        |1 |  |  |  |
        |  |4 |  |  |
        |  |  |16|  |
        |  |  |  |64|
*/

public class mat_Lt02_02 
{
    public static void main(String args[])
    {
        int[][] matriz = carregarMatriz();
        String resultado = "";

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                resultado += matriz[i][j] + "\t";
            }
            resultado += "\n";
        }

        System.out.println(resultado);
    }
    
    public static int[][] carregarMatriz()
    {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int expoente = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (i == j)
                {
                    matriz[i][j] = (int) Math.pow(2, expoente);
                    expoente += 2;
                }
                else
                {
                    System.out.println("Digite um numero:");
                    matriz[i][j] = scan.nextInt();
                }
            }
        }
        return matriz;
    }
}
