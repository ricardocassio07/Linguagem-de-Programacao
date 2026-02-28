/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

import java.util.Scanner;

/*
    44. Receba o número da base e do expoente. Calcule e mostre o valor da potência.
    Programador: Cássio
    Data: 28/02/2026
*/
public class EstRep_Lt01_44 
{
    public static void main(String args[])
    {
        int base = 0, expoente = 0, potencia = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor da base:");
        base = scan.nextInt();
        
        System.out.println("Digite o valor do expoente:");
        expoente = scan.nextInt();
        
        potencia = base;
        
        for (int i = 1; i < expoente; i++)
        {
            potencia *= base; 
        }
        
        System.out.println(base + "^" + expoente + " = " + potencia);
        
        scan.close();
    }
}
