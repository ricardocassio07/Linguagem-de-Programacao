/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

/*
    45. Calcule e mostre a série 1 - 2/4 + 3/9 - 4/16 + 5/25 + ... + 15/225.
    Programador: Cássio
    Data: 28/02/2026
*/
public class EstRep_Lt01_45 
{
    public static void main(String args[])
    {
        double resultado = 0;
        
        for (double i = 1; i <= 15; i++)
        {
            if ((i % 2) == 0)
            {
                resultado -= (i / Math.pow(i, 2));
            }
            else
            {
                resultado += (i / Math.pow(i, 2));
            }
            
        }
        
        System.out.println(resultado);
    }
}
