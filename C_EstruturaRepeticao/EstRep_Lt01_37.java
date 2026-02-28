/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

import java.util.Scanner;

/*
    37. Receba um número inteiro. Calcule e mostre a série de fibonacci até o N'nésimo termo.
    Programador: Cássio
    Data: 26/02/2026                                                                                                                                                                                                                                                                                                                                       
*/
public class EstRep_Lt01_37 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int N = scan.nextInt();
        
        int x = 0;
        int y = 1;
        int temp;   
        
        for (int i = 0; i < N; i++)
        {
            temp = x;
            x += y;
            y = temp;
            
            System.out.print(x + ", ");
        }
    }
}
