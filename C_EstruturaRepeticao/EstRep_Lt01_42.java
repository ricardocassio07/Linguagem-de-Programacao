/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

/*
    42. Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99.
    Programador: Cássio
    Data: 28/02/2026
*/
public class EstRep_Lt01_42 
{
    public static void main(String args[])
    {
        double resultado = 0;
        for (double i = 1; i < 100; i++)
        {
            resultado += (i/(2*i-1));
        }
        
        System.out.println(resultado);
    }
}
