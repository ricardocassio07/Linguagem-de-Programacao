/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

import java.math.BigInteger;

/*
    39. Calcule a quantidade de grãos contidos em um trabalho de xadrez onde:
            Casa: 1, 2, 3, 4, ... , 64
            Qtde: 1, 2, 4, 8, ... , N
    Programador: Cássio
    Data: 28/02/2026
*/
public class EstRep_Lt01_39 
{
    public static void main(String args[])
    {
        BigInteger resultado = BigInteger.ZERO;
        BigInteger graos = BigInteger.ONE;
        
        for (int i = 0; i < 64; i++)
        {
            resultado = resultado.add(graos);
            graos = graos.multiply(BigInteger.valueOf(2));
        }
        
        System.out.println(resultado);
    }
}
