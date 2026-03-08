/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import java.util.Scanner;

/*
    18. Receba dois valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor.
    Programador: Cássio
    Data: 08/03/2026
*/
public class modfun_Lt02_18 
{
    public static void main(String args[])
    {
        int a, b, diferenca;
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro:");
        a = scan.nextInt();
        
        System.out.println("Digite outro numero inteiro:");
        b = scan.nextInt();
        
        diferenca = calcular(a, b);
        
        System.out.println("A diferenca entre " + a + " e " + b + " e igual a " + diferenca);
        
        scan.close();
    }
    
    static int calcular(int x, int y)
    {
        if (x > y)
        {
            return (x - y);
        }
        else
        {
            return (y - x);
        }
    }
}
