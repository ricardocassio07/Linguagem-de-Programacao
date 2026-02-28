/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

import java.util.Scanner;

/*
    34. Receba um número. Calcule e mostre os resultados da tabuada desse número.
    Programador: Cássio
    Data: 26/02/2026
*/
public class EstRep_Lt01_34 
{
    public static void main(String args[])
    {
        int num;
        
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite um numero:");
        num = scan.nextInt();
        
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (i * num));
        }
        
        scan.close();
    }
}
