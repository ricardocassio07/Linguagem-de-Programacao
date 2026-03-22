/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package H_Matrizes;

/*
    04. Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
        |1|1|1|1|1|1|1|1|
        |1|2|2|2|2|2|2|1|
        |1|2|3|3|3|3|2|1|
        |1|2|3|4|4|3|2|1|
        |1|2|3|4|4|3|2|1|
        |1|2|3|3|3|3|2|1|
        |1|2|2|2|2|2|2|1|
        |1|1|1|1|1|1|1|1|
    Programador: Cássio
    Data: 22/03/2026
*/

public class mat_Lt02_04 
{
    public static void main(String args[])
    {
        int[][] matriz = carregarMatriz();
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                System.out.print("| " + matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }
    
    public static int[][] carregarMatriz()
    {
        int[][] matriz = new int[8][8];
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if ((i == 0) || (i == 7))
                {
                    matriz[i][j] = 1;
                }
                if ((i == 1) || (i == 6))
                {
                    if ((j == 0) || (j == 7))
                    {
                        matriz[i][j] = 1;
                    }
                    else
                    {
                        matriz[i][j] = 2;
                    }
                }
                if ((i == 2) || (i == 5))
                {
                    if ((j == 0) || (j == 7))
                    {
                        matriz[i][j] = 1;
                    }
                    else if ((j == 1) || (j == 6))
                    {
                        matriz[i][j] = 2;
                    }
                    else
                    {
                        matriz[i][j] = 3;
                    }
                }
                if ((i == 3) || (i == 4))
                {
                    if ((j == 0) || (j == 7))
                    {
                        matriz[i][j] = 1;
                    }
                    else if ((j ==  1) || (j == 6))
                    {
                        matriz[i][j] = 2;
                    }
                    else if ((j == 2) || (j == 5))
                    {
                        matriz[i][j] = 3;
                    }
                    else
                    {
                        matriz[i][j] = 4;
                    }
                }
            }
        }
        
        return matriz;
    }
}
