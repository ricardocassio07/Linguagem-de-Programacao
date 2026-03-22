/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package H_Matrizes;

import java.util.Map;
import java.util.HashMap;

/*
    05. Carregar códigos das peças em um tabuleiro de xadrez, onde:
        |Código: |  1  |   2  |  3   |   4   |   5   |  6 |  7   |
        |Peça:   | Peão| Torre| Bispo| Cavalo| Rainha| Rei| Vazio|
            Calcular e mostrar a soma das peças do tabuleiro.
            Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peças
    Programador: Càssio
    Data: 22/03/2026
*/

public class mat_Lt02_05 
{
    public static void main(String args[])
    {
        int[][] tabuleiro = carregarTabuleiro();
        int soma = calcularTabuleiro(tabuleiro);
        
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                System.out.print("| " + tabuleiro[i][j] + " ");
            }
            System.out.println("|");
        }
        
        System.out.println("SOMA: " + soma);
    }
    
    public static int[][] carregarTabuleiro()
    {
        int[][] tabuleiro = new int[8][8];
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if ((i == 0) || (i == 7))
                {
                    if ((j == 0) || (j == 7))
                    {
                        tabuleiro[i][j] = 2;
                    }
                    if ((j == 1) || (j == 6))
                    {
                        tabuleiro[i][j] = 4;
                    }
                    if ((j == 2) || (j == 5))
                    {
                        tabuleiro[i][j] = 3;
                    }
                    if ((j == 3) || (j == 4))
                    {
                        if (i == 0)
                        {
                            if (j == 3)
                            {
                                 tabuleiro[i][j] = 5;
                            }
                            else
                            {
                                tabuleiro[i][j] = 6;
                            }
                        }
                        else if (i == 7)
                        {
                            if (j == 3)
                            {
                                tabuleiro[i][j] = 6;
                            }
                            else
                            {
                                tabuleiro[i][j] = 5;
                            }
                        }
                    }
                }
                else if ((i == 1) || (i == 6))
                {
                    tabuleiro[i][j] = 1;
                }
                else
                {
                    tabuleiro[i][j] = 7;
                }
            }
        }
        
        return tabuleiro;
    }
    
    public static int calcularTabuleiro(int[][] tabuleiro)
    {
        int soma = 0;
        Map<Integer, Integer> valor = new HashMap<>();
        valor.put(1, 1); // Peão
        valor.put(2, 5); // Torre
        valor.put(3, 3); // Bispo
        valor.put(4, 3); // Cavalo
        valor.put(5, 9); // Rainha
        valor.put(6, 100); // Rei (valor alto simbólico)
        valor.put(7, 0); // Vazio
        
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                soma += valor.get(tabuleiro[i][j]);
            }
        }
        return soma;
    }
}
