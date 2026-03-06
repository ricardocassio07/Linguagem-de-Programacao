/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import java.util.Scanner;

/*
    23. Receba três valores obrigatoriamente em ordem crescente e um quarto valor não necessariamente em ordem.
    Mostre os 4 números em ordem crescente.
    Programador: Cássio
    Data: 05/03/2026
*/

public class modproc_Lt02_23 
{
    static double v1, v2, v3, v4;
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("DIGITE 3 VALORES EM ORDEM CRESCENTE!");
        
        boolean valido = false;
        
        do
        {
            System.out.println("Digite o primeiro valor:");
            v1 = scan.nextDouble();
            
            System.out.println("Digite o segundo valor:");
            v2 = scan.nextDouble();
            
            System.out.println("Digite o terceiro valor:");
            v3 = scan.nextDouble();
            
            if (!(v1 > v2 || v2 > v3))
            {
                valido = true;
            }
            else
            {
                System.out.println("DADOS INVALIDOS!");
            }
        }
        while(valido == false);
        
        System.out.println("Agora, digite um quarto valor qualquer:");
        v4 = scan.nextDouble();
        
        calcular();
        
        scan.close();
        
    }
    
    static void calcular()
    {
        if (v4 < v1)
        {
            System.out.println("[" + v4 + ", " + v1 + ", " + v2 + ", " + v3 + "]");
        }
        else if (v4 < v2)
        {
            System.out.println("[" + v1 + ", " + v4 + ", " + v2 + ", " + v3 + "]");
        }
        else if (v4 < v3)
        {
            System.out.println("[" + v1 + ", " + v2 + ", " + v4 + ", " + v3 + "]");
        }
        else
        {
            System.out.println("[" + v1 + ", " + v2 + ", " + v3 + ", " + v4 + "]");
        }
    }
}
