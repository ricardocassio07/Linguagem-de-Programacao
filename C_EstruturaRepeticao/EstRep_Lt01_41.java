/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

/*
    41. Mostre todas as possibilidades de 2 dados caírem de forma que a soma
    tenha como resultado 7;
    Programador: Cássio
    Data: 28/02/2026
*/
public class EstRep_Lt01_41 
{
    public static void main(String args[])
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if ((i + j) == 7)
                {
                    System.out.println("D1: " + i + " D2: " + j);
                }
            }
        }
    }
}
