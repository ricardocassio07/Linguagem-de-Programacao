/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import java.util.Scanner;

/*
    29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido 
    em 30 dias, sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não são considerados.
    Programador: Cássio
    Data: 22/02/2026
*/
public class EstDec_Lt01_29 
{
    public static void main(String args[])
    {
        int tipoInvestimento;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tipo de investimento (1- Poupanca 2- Renda Fixa):");
        tipoInvestimento = scan.nextInt();
        
        if (tipoInvestimento == 1 || tipoInvestimento == 2)
        {
            double valorInvestido, novoValor;
            
            System.out.println("Valor investido:");
            valorInvestido = scan.nextDouble();
            
            if (tipoInvestimento == 1)
            {
                novoValor = (valorInvestido * 1.03);
            }
            else
            {
                novoValor = (valorInvestido * 1.05);
            }
            
            System.out.printf("Valor Reajustado R$ %.2f%n", novoValor);
        }
        else
        {
            System.out.println("TIPO INVALIDO");
        }
    }
}
